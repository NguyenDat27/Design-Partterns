package com.hcmute.springboot.behavioralpatterns.state.states.state;

import com.hcmute.springboot.behavioralpatterns.state.states.State;

public class ConcreteStateA extends State {
    @Override
    public void Handle1() {
        System.out.println("ConcreteStateA handles request1.");
        System.out.println("ConcreteStateA wants to change the state of the context.");
        this._context.TransitionTo(new ConcreteStateB());
    }

    @Override
    public void Handle2() {
        System.out.println("ConcreteStateA handles request2.");
    }
}
