package edu.nubip.sm.auth.repository;

import edu.nubip.sm.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
