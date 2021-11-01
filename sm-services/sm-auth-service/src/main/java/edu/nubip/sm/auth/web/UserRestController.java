package edu.nubip.sm.auth.web;

import edu.nubip.sm.auth.domain.User;
import edu.nubip.sm.auth.dto.UserCreateDto;
import edu.nubip.sm.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {

    private final UserService userService;

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/")
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findAll();
        if (users == null || users.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(users);
    }

    @PostMapping("/")
    public ResponseEntity<?> createUser(@RequestBody UserCreateDto userDto) {
        try {
            User createdUser = userService.createUser(userDto);
            return ResponseEntity.ok(createdUser);
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
