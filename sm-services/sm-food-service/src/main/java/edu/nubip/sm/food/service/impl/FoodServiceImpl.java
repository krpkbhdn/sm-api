package edu.nubip.sm.food.service.impl;

import edu.nubip.sm.food.domain.Food;
import edu.nubip.sm.food.repository.FoodRepository;
import edu.nubip.sm.food.service.FoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Optional<Food> findById(Long id) {
        return foodRepository.findById(id);
    }

    @Override
    public Optional<Food> create(Food food) {
        return Optional.of(foodRepository.save(food));
    }

    @Override
    public Optional<Food> update(Long id, Food food) {
        food.setId(id);
        return Optional.of(foodRepository.save(food));
    }

    @Override
    public void delete(Food food) {
        foodRepository.delete(food);
    }

    @Override
    public void deleteById(Long id) {
        foodRepository.deleteById(id);
    }
}
