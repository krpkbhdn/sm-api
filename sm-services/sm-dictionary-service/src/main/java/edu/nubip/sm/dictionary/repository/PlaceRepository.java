package edu.nubip.sm.dictionary.repository;

import edu.nubip.sm.dictionary.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
