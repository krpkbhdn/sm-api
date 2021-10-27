package edu.nubip.sm.profile.repository;

import edu.nubip.sm.profile.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
