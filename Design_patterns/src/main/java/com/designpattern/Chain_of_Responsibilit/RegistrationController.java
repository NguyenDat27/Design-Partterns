package com.example.design_patter.Chain_of_Responsibilit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final RegistrationProcessor registrationProcessor;

    public RegistrationController(RegistrationProcessor registrationProcessor) {
        this.registrationProcessor = registrationProcessor;
    }

    @PostMapping("/registration")
    public ResponseEntity<String> registerUser() {
        UserRegistration registration = new UserRegistration();
        registration.setAge(20);
        registration.setEmail("example@example.com");
        registration.setUsername("exampleuser");

        registrationProcessor.processRegistration(registration);
        return ResponseEntity.ok("Registration successful");
    }
}