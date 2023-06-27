package com.hcmute.springboot.behavioralpatterns.state.controller;


import com.hcmute.springboot.behavioralpatterns.state.context.Context;
import com.hcmute.springboot.behavioralpatterns.state.states.state.ConcreteStateA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/state")
public class StateController {
    @GetMapping
    public ResponseEntity getStrate() {

        Context context = new Context(new ConcreteStateA());
        context.Request1();
        context.Request2();

        return ResponseEntity.noContent().build();
    }
}
