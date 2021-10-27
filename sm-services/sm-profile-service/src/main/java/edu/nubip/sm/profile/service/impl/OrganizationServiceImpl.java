package edu.nubip.sm.profile.service.impl;

import edu.nubip.sm.profile.domain.Organization;
import edu.nubip.sm.profile.repository.OrganizationRepository;
import edu.nubip.sm.profile.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Override
    public List<Organization> findAll() {
        return organizationRepository.findAll();
    }

    @Override
    public Optional<Organization> findById(Long id) {
        return organizationRepository.findById(id);
    }

    @Override
    public Optional<Organization> create(Organization organization) {
        return Optional.of(organizationRepository.save(organization));
    }

    @Override
    public Optional<Organization> update(Long id, Organization organization) {
        organization.setId(id);
        return Optional.of(organizationRepository.save(organization));
    }

    @Override
    public void delete(Organization organization) {
        organizationRepository.delete(organization);
    }

    @Override
    public void deleteById(Long id) {
        organizationRepository.deleteById(id);
    }
}
