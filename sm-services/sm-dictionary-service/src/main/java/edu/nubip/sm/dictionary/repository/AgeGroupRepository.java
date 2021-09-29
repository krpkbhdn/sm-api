package edu.nubip.sm.dictionary.repository;

import edu.nubip.sm.dictionary.domain.AgeGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgeGroupRepository extends JpaRepository<AgeGroup, Integer> {
}
