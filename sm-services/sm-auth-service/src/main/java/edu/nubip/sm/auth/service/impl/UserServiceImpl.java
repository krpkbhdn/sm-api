package edu.nubip.sm.auth.service.impl;

import edu.nubip.sm.auth.domain.Role;
import edu.nubip.sm.auth.domain.User;
import edu.nubip.sm.auth.dto.UserCreateDto;
import edu.nubip.sm.auth.repository.UserDetailsRepository;
import edu.nubip.sm.auth.service.RoleService;
import edu.nubip.sm.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserDetailsRepository userDetailsRepository;
    private final RoleService roleService;

    private final PasswordEncoder passwordEncoder;

    @Override
    public List<User> findAll() {
        return userDetailsRepository.findAll();
    }

    @Override
    public Optional<User> findByUsernameOrEmail(String username, String email) {
        return userDetailsRepository.findByUsernameOrEmail(username, email);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userDetailsRepository.findByUsername(username);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDetailsRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findById(long id) {
        return userDetailsRepository.findById(id);
    }

    @Override
    public User createUser(UserCreateDto userDto) throws RuntimeException {
        if (userDto == null || userDto.getUsername() == null || userDto.getEmail() == null || userDto.getPassword() == null) {
            throw new RuntimeException("User haven't required fields: " + userDto);
        }
        log.info("Request to create user: {} <{}>", userDto.getUsername(), userDto.getEmail());
        boolean userIsExist = userDetailsRepository.existsByUsernameOrEmail(userDto.getUsername(), userDto.getEmail());
        if (userIsExist) {
            throw new RuntimeException("User already exists: " + userDto.getUsername() + " <" + userDto.getEmail() + ">");
        }
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setEnabled(true);

        Set<String> roleNames;
        if (userDto.getRoles() != null && !userDto.getRoles().isEmpty()) {
            roleNames = userDto.getRoles();
        } else {
            roleNames = Set.of("ROLE_USER");
        }

        List<Role> roles = roleService.findAllByNameIn(roleNames);
        user.setRoles(roles);

        User savedUser = userDetailsRepository.save(user);
        log.info("Created new user: {} <{}>", savedUser.getUsername(), savedUser.getEmail());
        return savedUser;
    }

    @Override
    public User createUser(String username, String email, String password) throws RuntimeException {
        UserCreateDto userDto = new UserCreateDto();
        userDto.setUsername(username);
        userDto.setEmail(email);
        userDto.setPassword(password);
        return createUser(userDto);
    }

    @Override
    public User save(User user) {
        log.debug("Request to save user: {} <{}>", user.getUsername(), user.getEmail());
        return userDetailsRepository.save(user);
    }

    @Override
    public void delete(User user) {
        log.debug("Request to delete user: {} - {} <{}>", user.getId(), user.getUsername(), user.getEmail());
        userDetailsRepository.delete(user);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete user by id: {}", id);
        userDetailsRepository.deleteById(id);
    }
}
