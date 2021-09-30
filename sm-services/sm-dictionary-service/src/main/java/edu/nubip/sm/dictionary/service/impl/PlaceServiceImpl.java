package edu.nubip.sm.dictionary.service.impl;

import edu.nubip.sm.dictionary.domain.Place;
import edu.nubip.sm.dictionary.repository.PlaceRepository;
import edu.nubip.sm.dictionary.service.PlaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private final PlaceRepository placeRepository;

    @Override
    public List<Place> findAll() {
        return placeRepository.findAll();
    }

    @Override
    public Optional<Place> findById(Long id) {
        return placeRepository.findById(id);
    }

    @Override
    public Optional<Place> create(Place place) {
        return Optional.of(placeRepository.save(place));
    }

    @Override
    public Optional<Place> update(Long id, Place place) {
        place.setId(id);
        return Optional.of(placeRepository.save(place));
    }

    @Override
    public void delete(Place place) {
        placeRepository.delete(place);
    }

    @Override
    public void deleteById(Long id) {
        placeRepository.deleteById(id);
    }
}
