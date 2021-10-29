package edu.nubip.sm.food.repository;

import edu.nubip.sm.food.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
