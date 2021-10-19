package edu.nubip.sm.profile.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
    List<T> findAll();

    Optional<T> findById(ID id);

    Optional<T> create(T obj);

    Optional<T> update(ID id, T obj);

    void delete(T obj);

    void deleteById(ID id);
}
