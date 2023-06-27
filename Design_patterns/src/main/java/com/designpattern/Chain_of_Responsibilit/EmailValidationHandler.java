package com.example.design_patter.Chain_of_Responsibilit;

import org.springframework.stereotype.Component;

@Component
public class EmailValidationHandler implements RegistrationHandler {

    private RegistrationHandler nextHandler;

    @Override
    public void setNextHandler(RegistrationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRegistration(UserRegistration registration) {
        // Kiểm tra địa chỉ email có hợp lệ không
        if (registration.getEmail().contains("@")) {
            System.out.println("Email validation passed");
            if (nextHandler != null) {
                nextHandler.processRegistration(registration);
            }
        } else {
            throw new RuntimeException("Email validation failed");
        }
    }
}
