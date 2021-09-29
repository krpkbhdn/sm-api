package edu.nubip.sm.dictionary.repository;

import edu.nubip.sm.dictionary.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Integer> {
}
