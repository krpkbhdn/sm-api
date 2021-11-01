package edu.nubip.sm.profile.security;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public final class SecurityUtils {

    public static Map<String, ?> getCurrentUserDetails() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object details = authentication.getDetails();
        if (details instanceof OAuth2AuthenticationDetails) {
            String token = ((OAuth2AuthenticationDetails) details).getTokenValue();
            JsonParser parser = JsonParserFactory.getJsonParser();
            return parser.parseMap(JwtHelper.decode(token).getClaims());
        }
        return new HashMap<>();
    }
}
