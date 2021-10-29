package edu.nubip.sm.food.service.impl;

import edu.nubip.sm.food.domain.Ingredient;
import edu.nubip.sm.food.repository.IngredientRepository;
import edu.nubip.sm.food.service.IngredientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository ingredientRepository;

    @Override
    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    @Override
    public Optional<Ingredient> findById(Long id) {
        return ingredientRepository.findById(id);
    }

    @Override
    public Optional<Ingredient> create(Ingredient ingredient) {
        return Optional.of(ingredientRepository.save(ingredient));
    }

    @Override
    public Optional<Ingredient> update(Long id, Ingredient ingredient) {
        ingredient.setId(id);
        return Optional.of(ingredientRepository.save(ingredient));
    }

    @Override
    public void delete(Ingredient ingredient) {
        ingredientRepository.delete(ingredient);
    }

    @Override
    public void deleteById(Long id) {
        ingredientRepository.deleteById(id);
    }
}
