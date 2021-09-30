package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.MealInfo;
import edu.nubip.sm.dictionary.repository.MealInfoRepository;
import edu.nubip.sm.dictionary.service.MealInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class MealInfoServiceImpl implements MealInfoService {

    private final MealInfoRepository mealInfoRepository;

    @Override
    public List<MealInfo> findAll() {
        return mealInfoRepository.findAll();
    }

    @Override
    public Optional<MealInfo> findById(Integer id) {
        return mealInfoRepository.findById(id);
    }

    @Override
    public Optional<MealInfo> create(MealInfo mealInfo) {
        return Optional.of(mealInfoRepository.save(mealInfo));
    }

    @Override
    public Optional<MealInfo> update(Integer id, MealInfo mealInfo) {
        mealInfo.setId(id);
        return Optional.of(mealInfoRepository.save(mealInfo));
    }

    @Override
    public void delete(MealInfo mealInfo) {
        mealInfoRepository.delete(mealInfo);
    }

    @Override
    public void deleteById(Integer id) {
        mealInfoRepository.deleteById(id);
    }
}
