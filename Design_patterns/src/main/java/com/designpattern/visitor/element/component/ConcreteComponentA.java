package com.hcmute.springboot.behavioralpatterns.visitor.element.component;

import com.hcmute.springboot.behavioralpatterns.visitor.element.IComponent;
import com.hcmute.springboot.behavioralpatterns.visitor.visitor.IVisitor;

public class ConcreteComponentA implements IComponent {
    @Override
    public void Accept(IVisitor visitor) {
        visitor.VisitConcreteComponentA(this);
    }
    public String ExclusiveMethodOfConcreteComponentA()
    {
        return "A";
    }
}
