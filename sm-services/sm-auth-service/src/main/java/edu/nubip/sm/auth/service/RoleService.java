package edu.nubip.sm.auth.service;

import edu.nubip.sm.auth.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllByNameIn(Iterable<String> names);
}
