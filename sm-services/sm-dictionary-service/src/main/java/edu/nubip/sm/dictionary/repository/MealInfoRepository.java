package edu.nubip.sm.dictionary.repository;

import edu.nubip.sm.dictionary.domain.MealInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealInfoRepository extends JpaRepository<MealInfo, Integer> {
}
