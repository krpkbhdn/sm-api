package edu.nubip.sm.auth.repository;

import edu.nubip.sm.auth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    List<Role> findAllByNameIn(Iterable<String> names);
}
