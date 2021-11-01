package edu.nubip.sm.auth.service.impl;

import edu.nubip.sm.auth.domain.Role;
import edu.nubip.sm.auth.repository.RoleRepository;
import edu.nubip.sm.auth.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public List<Role> findAllByNameIn(Iterable<String> names) {
        log.info("Request to fetch roles from db by names collection");
        return roleRepository.findAllByNameIn(names);
    }
}
