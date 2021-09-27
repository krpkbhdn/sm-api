package edu.nubip.sm.auth.service.impl;

import edu.nubip.sm.auth.domain.User;
import edu.nubip.sm.auth.repository.UserDetailsRepository;
import edu.nubip.sm.auth.security.AuthUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserDetailsRepository userDetailsRepository;

    @Autowired
    public UserDetailsServiceImpl(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOpt = userDetailsRepository.findByUsernameOrEmail(username);

        userOpt.orElseThrow(() -> new UsernameNotFoundException("Username\\Email or password wrong"));
        UserDetails userDetails = new AuthUserDetails(userOpt.get());

        new AccountStatusUserDetailsChecker().check(userDetails);

        return userDetails;
    }
}
