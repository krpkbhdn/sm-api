package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.EatingTime;
import edu.nubip.sm.dictionary.repository.EatingTimeRepository;
import edu.nubip.sm.dictionary.service.EatingTimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class EatingTimeServiceImpl implements EatingTimeService {

    private final EatingTimeRepository eatingTimeRepository;

    @Override
    public List<EatingTime> findAll() {
        return eatingTimeRepository.findAll();
    }

    @Override
    public Optional<EatingTime> findById(Integer id) {
        return eatingTimeRepository.findById(id);
    }

    @Override
    public Optional<EatingTime> create(EatingTime eatingTime) {
        return Optional.of(eatingTimeRepository.save(eatingTime));
    }

    @Override
    public Optional<EatingTime> update(Integer id, EatingTime eatingTime) {
        eatingTime.setId(id);
        return Optional.of(eatingTimeRepository.save(eatingTime));
    }

    @Override
    public void delete(EatingTime eatingTime) {
        eatingTimeRepository.delete(eatingTime);
    }

    @Override
    public void deleteById(Integer id) {
        eatingTimeRepository.deleteById(id);
    }
}
