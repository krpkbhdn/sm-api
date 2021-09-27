package edu.nubip.sm.auth.service.impl;

import edu.nubip.sm.auth.domain.User;
import edu.nubip.sm.auth.repository.UserDetailsRepository;
import edu.nubip.sm.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserDetailsRepository userDetailsRepository;
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
    public User createUser(User user) {
        if (user == null || user.getUsername() == null || user.getEmail() == null || user.getPassword() == null) {
            throw new RuntimeException("User haven't required fields: " + user);
        }
        log.debug("Request to create user: {} <{}>", user.getUsername(), user.getEmail());
        boolean userIsExist = userDetailsRepository.existsByUsernameOrEmail(user.getUsername(), user.getEmail());
        if (userIsExist) {
            throw new RuntimeException("User already exists: " + user.getUsername() + " <" + user.getEmail() + ">");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setEnabled(true);
        User savedUser = userDetailsRepository.save(user);
        log.debug("Created new user: {} <{}>", savedUser.getUsername(), savedUser.getEmail());
        return savedUser;
    }

    @Override
    public User createUser(String username, String email, String password) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        return createUser(user);
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
