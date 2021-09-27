package edu.nubip.sm.auth.service;

import edu.nubip.sm.auth.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findByUsernameOrEmail(String username, String email);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findById(long id);

    User createUser(User user);
    User createUser(String username, String email, String password);

    User save(User user);

    void delete(User user);
    void delete(Long id);

}
