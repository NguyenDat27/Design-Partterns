package com.example.design_patter.Chain_of_Responsibilit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RegistrationProcessor {
    private RegistrationHandler firstHandler;



    public RegistrationProcessor(@Qualifier("ageValidationHandler") RegistrationHandler ageValidationHandler,
                                 @Qualifier("emailValidationHandler") RegistrationHandler emailValidationHandler,
                                 @Qualifier("usernameValidationHandler") RegistrationHandler usernameValidationHandler) {
        this.firstHandler = ageValidationHandler;
        ageValidationHandler.setNextHandler(emailValidationHandler);
        emailValidationHandler.setNextHandler(usernameValidationHandler);
    }
    public void processRegistration(UserRegistration registration) {
        try {
            firstHandler.processRegistration(registration);
            // Xử lý sau khi đăng ký thành công
            System.out.println("Registration processing completed successfully.");
        } catch (Exception e) {
            // Xử lý khi có lỗi đăng ký
            System.out.println("Registration processing failed: " + e.getMessage());
        }
    }
}




