package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.District;
import edu.nubip.sm.dictionary.repository.DistrictRepository;
import edu.nubip.sm.dictionary.service.DistrictService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    @Override
    public List<District> findAll() {
        return districtRepository.findAll();
    }

    @Override
    public Optional<District> findById(Integer id) {
        return districtRepository.findById(id);
    }

    @Override
    public Optional<District> create(District district) {
        return Optional.of(districtRepository.save(district));
    }

    @Override
    public Optional<District> update(Integer id, District district) {
        district.setId(id);
        return Optional.of(districtRepository.save(district));
    }

    @Override
    public void delete(District district) {
        districtRepository.delete(district);
    }

    @Override
    public void deleteById(Integer id) {
        districtRepository.deleteById(id);
    }
}
