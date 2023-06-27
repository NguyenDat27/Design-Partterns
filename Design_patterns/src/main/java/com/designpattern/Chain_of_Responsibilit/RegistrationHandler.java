package com.example.design_patter.Chain_of_Responsibilit;

public interface RegistrationHandler {
    void setNextHandler(RegistrationHandler nextHandler);
    void processRegistration(UserRegistration registration);
}