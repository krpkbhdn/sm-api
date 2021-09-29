package edu.nubip.sm.dictionary.repository;

import edu.nubip.sm.dictionary.domain.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Integer> {
}
