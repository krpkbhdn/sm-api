package edu.nubip.sm.dictionary.repository;

import edu.nubip.sm.dictionary.domain.PlaceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceTypeRepository extends JpaRepository<PlaceType, Integer> {
}
