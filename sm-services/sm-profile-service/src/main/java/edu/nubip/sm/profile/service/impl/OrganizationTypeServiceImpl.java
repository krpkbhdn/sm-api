package edu.nubip.sm.profile.service.impl;

import edu.nubip.sm.profile.domain.OrganizationType;
import edu.nubip.sm.profile.repository.OrganizationTypeRepository;
import edu.nubip.sm.profile.service.OrganizationTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrganizationTypeServiceImpl implements OrganizationTypeService {

    private final OrganizationTypeRepository organizationTypeRepository;

    @Override
    public List<OrganizationType> findAll() {
        return organizationTypeRepository.findAll();
    }

    @Override
    public Optional<OrganizationType> findById(Integer id) {
        return organizationTypeRepository.findById(id);
    }

    @Override
    public Optional<OrganizationType> create(OrganizationType organizationType) {
        return Optional.of(organizationTypeRepository.save(organizationType));
    }

    @Override
    public Optional<OrganizationType> update(Integer id, OrganizationType organizationType) {
        organizationType.setId(id);
        return Optional.of(organizationTypeRepository.save(organizationType));
    }

    @Override
    public void delete(OrganizationType organizationType) {
        organizationTypeRepository.delete(organizationType);
    }

    @Override
    public void deleteById(Integer id) {
        organizationTypeRepository.deleteById(id);
    }
}
