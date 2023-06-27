package com.hcmute.springboot.behavioralpatterns.visitor.visitor.visitor;

import com.hcmute.springboot.behavioralpatterns.visitor.element.component.ConcreteComponentA;
import com.hcmute.springboot.behavioralpatterns.visitor.element.component.ConcreteComponentB;
import com.hcmute.springboot.behavioralpatterns.visitor.visitor.IVisitor;

public class ConcreteVisitor1 implements IVisitor {
    public void VisitConcreteComponentA(ConcreteComponentA element)
    {
        System.out.println(element.ExclusiveMethodOfConcreteComponentA() + " + ConcreteVisitor1");
    }

    public void VisitConcreteComponentB(ConcreteComponentB element)
    {
        System.out.println(element.SpecialMethodOfConcreteComponentB() + " + ConcreteVisitor1");
    }
}
