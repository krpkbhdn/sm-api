package edu.nubip.sm.profile.web;

import edu.nubip.sm.profile.domain.UserProfile;
import edu.nubip.sm.profile.service.UserProfileService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-profile")
public class UserProfileRestController extends AbstractRestController<UserProfile, Long, UserProfileService> {

    public UserProfileRestController(UserProfileService service) {
        super(service);
    }
}
