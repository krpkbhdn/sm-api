package edu.nubip.sm.profile.repository;

import edu.nubip.sm.profile.domain.OrganizationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationTypeRepository extends JpaRepository<OrganizationType, Integer> {
}
