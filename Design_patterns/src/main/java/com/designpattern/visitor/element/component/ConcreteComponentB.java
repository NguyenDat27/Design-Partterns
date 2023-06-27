package com.hcmute.springboot.behavioralpatterns.visitor.element.component;

import com.hcmute.springboot.behavioralpatterns.visitor.element.IComponent;
import com.hcmute.springboot.behavioralpatterns.visitor.visitor.IVisitor;

public class ConcreteComponentB implements IComponent {
    public void Accept(IVisitor visitor)
    {
        visitor.VisitConcreteComponentB(this);
    }

    public String SpecialMethodOfConcreteComponentB()
    {
        return "B";
    }
}
