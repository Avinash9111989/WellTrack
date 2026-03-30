package com.welltrack.iam;

import com.welltrack.iam.entity.Role;
import com.welltrack.iam.entity.User;
import com.welltrack.iam.repository.UserRepository;
import com.welltrack.iam.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @AfterEach
    void cleanup() {
        // Clean up any test users created
        userRepository.deleteAll();
    }

    @Test
    void testCreateUser() {
        User user = new User();
        user.setName("Test User");
        user.setEmail("test_" + System.currentTimeMillis() + "@welltrack.com");
        user.setPassword("password123");
        user.setRole(Role.EMPLOYEE);   // ✅ use enum
        user.setStatus("ACTIVE");

        User saved = userService.createUser(user);

        assertEquals(Role.EMPLOYEE, saved.getRole()); // ✅ compare enum
        assertEquals("ACTIVE", saved.getStatus());
    }

}