package edu.nubip.sm.profile.web;

import edu.nubip.sm.profile.domain.UserProfile;
import edu.nubip.sm.profile.security.SecurityUtils;
import edu.nubip.sm.profile.service.UserProfileService;
import edu.nubip.sm.profile.util.StringUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user-profile")
public class UserProfileRestController extends AbstractRestController<UserProfile, Long, UserProfileService> {

    public UserProfileRestController(UserProfileService service) {
        super(service);
    }

    @GetMapping("/current")
    public ResponseEntity<?> getCurrentUserProfile() {
        Map<String, ?> currentUserDetails = SecurityUtils.getCurrentUserDetails();
        Object userId = currentUserDetails.getOrDefault("id", null);

        if (StringUtil.isNumeric(userId.toString())) {
            long id = Long.parseLong(userId.toString());
            Optional<UserProfile> userProfile = service.findById(id);
            if (userProfile.isPresent()) {
                return ResponseEntity.of(userProfile);
            }
        }
        return ResponseEntity.noContent().build();
    }
}
