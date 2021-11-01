package edu.nubip.sm.auth.service;

import edu.nubip.sm.auth.domain.User;
import edu.nubip.sm.auth.dto.UserCreateDto;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findByUsernameOrEmail(String username, String email);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findById(long id);

    User createUser(UserCreateDto userDto) throws RuntimeException;
    User createUser(String username, String email, String password) throws RuntimeException;

    User save(User user);

    void delete(User user);
    void delete(Long id);

}
