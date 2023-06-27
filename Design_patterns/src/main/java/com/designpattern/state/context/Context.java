package com.hcmute.springboot.behavioralpatterns.state.context;

import com.hcmute.springboot.behavioralpatterns.state.states.State;

public class Context {
    private State _state = null;

    public Context(State state)
    {
        this.TransitionTo(state);
    }

    public void TransitionTo(State state)
    {
        System.out.println("Context: Transition to "+state.getClass().getName());
        this._state = state;
        this._state.SetContext(this);
    }

    public void Request1()
    {
        this._state.Handle1();
    }

    public void Request2()
    {
        this._state.Handle2();
    }
}
