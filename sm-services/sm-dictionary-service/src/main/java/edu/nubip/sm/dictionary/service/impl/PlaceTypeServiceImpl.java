package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.PlaceType;
import edu.nubip.sm.dictionary.repository.PlaceTypeRepository;
import edu.nubip.sm.dictionary.service.PlaceTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlaceTypeServiceImpl implements PlaceTypeService {

    private final PlaceTypeRepository placeTypeRepository;

    @Override
    public List<PlaceType> findAll() {
        return placeTypeRepository.findAll();
    }

    @Override
    public Optional<PlaceType> findById(Integer id) {
        return placeTypeRepository.findById(id);
    }

    @Override
    public Optional<PlaceType> create(PlaceType placeType) {
        return Optional.of(placeTypeRepository.save(placeType));
    }

    @Override
    public Optional<PlaceType> update(Integer id, PlaceType placeType) {
        placeType.setId(id);
        return Optional.of(placeTypeRepository.save(placeType));
    }

    @Override
    public void delete(PlaceType placeType) {
        placeTypeRepository.delete(placeType);
    }

    @Override
    public void deleteById(Integer id) {
        placeTypeRepository.deleteById(id);
    }
}
