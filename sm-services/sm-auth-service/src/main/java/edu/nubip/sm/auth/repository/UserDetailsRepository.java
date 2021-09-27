package edu.nubip.sm.auth.repository;

import edu.nubip.sm.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

    @Query("SELECT o FROM User o WHERE o.username = ?1 OR o.email = ?1")
    Optional<User> findByUsernameOrEmail(String s);
    Optional<User> findByUsernameOrEmail(String username, String email);

    boolean existsByUsernameOrEmail(String username, String email);
}
