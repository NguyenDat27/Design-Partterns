package com.hcmute.springboot.behavioralpatterns.state.states.state;

import com.hcmute.springboot.behavioralpatterns.state.states.State;

public class ConcreteStateB extends State {
    @Override
    public void Handle1() {
        System.out.println("ConcreteStateB handles request1.");
    }

    @Override
    public void Handle2() {
        System.out.println("ConcreteStateB handles request2.");
        System.out.println("ConcreteStateB wants to change the state of the context.");
        this._context.TransitionTo(new ConcreteStateA());
    }
}
