package edu.nubip.sm.profile.repository;

import edu.nubip.sm.profile.domain.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
