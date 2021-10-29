package edu.nubip.sm.food.repository;

import edu.nubip.sm.food.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
