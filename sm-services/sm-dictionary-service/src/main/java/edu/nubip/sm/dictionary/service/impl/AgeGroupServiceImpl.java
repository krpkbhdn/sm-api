package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.AgeGroup;
import edu.nubip.sm.dictionary.repository.AgeGroupRepository;
import edu.nubip.sm.dictionary.service.AgeGroupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class AgeGroupServiceImpl implements AgeGroupService {

    private final AgeGroupRepository ageGroupRepository;

    @Override
    public List<AgeGroup> findAll() {
        return ageGroupRepository.findAll();
    }

    @Override
    public Optional<AgeGroup> findById(Integer id) {
        return ageGroupRepository.findById(id);
    }

    @Override
    public Optional<AgeGroup> create(AgeGroup ageGroup) {
        return Optional.of(ageGroupRepository.save(ageGroup));
    }

    @Override
    public Optional<AgeGroup> update(Integer id, AgeGroup ageGroup) {
        ageGroup.setId(id);
        return Optional.of(ageGroupRepository.save(ageGroup));
    }

    @Override
    public void delete(AgeGroup ageGroup) {
        ageGroupRepository.delete(ageGroup);
    }

    @Override
    public void deleteById(Integer id) {
        ageGroupRepository.deleteById(id);
    }
}
