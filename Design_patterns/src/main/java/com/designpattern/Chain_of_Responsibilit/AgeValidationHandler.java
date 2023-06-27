package com.example.design_patter.Chain_of_Responsibilit;

import org.springframework.stereotype.Component;

@Component
public class AgeValidationHandler implements RegistrationHandler {

    private RegistrationHandler nextHandler;

    @Override
    public void setNextHandler(RegistrationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRegistration(UserRegistration registration) {
        // Kiểm tra tuổi có đủ điều kiện đăng ký không
        if (registration.getAge() >= 18) {
            System.out.println("Age validation passed");
            if (nextHandler != null) {
                nextHandler.processRegistration(registration);
            }
        } else {
            throw new RuntimeException("Age validation failed");
        }
    }
}