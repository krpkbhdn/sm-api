package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.Gender;
import edu.nubip.sm.dictionary.repository.GenderRepository;
import edu.nubip.sm.dictionary.service.GenderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class GenderServiceImpl implements GenderService {

    private final GenderRepository genderRepository;

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public Optional<Gender> findById(Integer id) {
        return genderRepository.findById(id);
    }

    @Override
    public Optional<Gender> create(Gender gender) {
        return Optional.of(genderRepository.save(gender));
    }

    @Override
    public Optional<Gender> update(Integer id, Gender gender) {
        gender.setId(id);
        return Optional.of(genderRepository.save(gender));
    }

    @Override
    public void delete(Gender gender) {
        genderRepository.delete(gender);
    }

    @Override
    public void deleteById(Integer id) {
        genderRepository.deleteById(id);
    }
}
