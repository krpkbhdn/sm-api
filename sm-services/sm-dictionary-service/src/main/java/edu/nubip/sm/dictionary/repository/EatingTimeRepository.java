package edu.nubip.sm.dictionary.repository;

import edu.nubip.sm.dictionary.domain.EatingTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EatingTimeRepository extends JpaRepository<EatingTime, Integer> {
}
