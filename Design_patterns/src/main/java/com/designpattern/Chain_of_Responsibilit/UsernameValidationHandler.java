package com.example.design_patter.Chain_of_Responsibilit;

import org.springframework.stereotype.Component;

@Component
public class UsernameValidationHandler implements RegistrationHandler {

    private RegistrationHandler nextHandler;

    @Override
    public void setNextHandler(RegistrationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRegistration(UserRegistration registration) {
        // Kiểm tra tên người dùng có hợp lệ không
        if (!registration.getUsername().isEmpty()) {
            System.out.println("Username validation passed");
            if (nextHandler != null) {
                nextHandler.processRegistration(registration);
            }
        } else {
            throw new RuntimeException("Username validation failed");
        }
    }
}