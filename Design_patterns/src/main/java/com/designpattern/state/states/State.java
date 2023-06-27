package com.hcmute.springboot.behavioralpatterns.state.states;

import com.hcmute.springboot.behavioralpatterns.state.context.Context;

public abstract class State {
    protected Context _context;
    public void SetContext(Context context)
    {
        this._context = context;
    }

    public abstract void Handle1();

    public abstract void Handle2();
}
