package edu.nubip.sm.profile.service.impl;

import edu.nubip.sm.profile.domain.UserProfile;
import edu.nubip.sm.profile.repository.UserProfileRepository;
import edu.nubip.sm.profile.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository userProfileRepository;

    @Override
    public List<UserProfile> findAll() {
        return userProfileRepository.findAll();
    }

    @Override
    public Optional<UserProfile> findById(Long id) {
        return userProfileRepository.findById(id);
    }

    @Override
    public Optional<UserProfile> create(UserProfile userProfile) {
        return Optional.of(userProfileRepository.save(userProfile));
    }

    @Override
    public Optional<UserProfile> update(Long id, UserProfile userProfile) {
        userProfile.setId(id);
        return Optional.of(userProfileRepository.save(userProfile));
    }

    @Override
    public void delete(UserProfile userProfile) {
        userProfileRepository.delete(userProfile);
    }

    @Override
    public void deleteById(Long id) {
        userProfileRepository.deleteById(id);
    }
}
