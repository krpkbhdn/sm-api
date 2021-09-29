package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.Region;
import edu.nubip.sm.dictionary.repository.RegionRepository;
import edu.nubip.sm.dictionary.service.RegionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regionRepository;

    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Override
    public Optional<Region> findById(Integer id) {
        return regionRepository.findById(id);
    }

    @Override
    public Optional<Region> create(Region region) {
        return Optional.of(regionRepository.save(region));
    }

    @Override
    public Optional<Region> update(Integer id, Region region) {
        region.setId(id);
        return Optional.of(regionRepository.save(region));
    }

    @Override
    public void delete(Region region) {
        regionRepository.delete(region);
    }

    @Override
    public void deleteById(Integer id) {
        regionRepository.deleteById(id);
    }
}
