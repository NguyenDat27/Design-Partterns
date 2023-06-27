package com.hcmute.springboot.behavioralpatterns.visitor.visitor;

import com.hcmute.springboot.behavioralpatterns.visitor.element.component.ConcreteComponentA;
import com.hcmute.springboot.behavioralpatterns.visitor.element.component.ConcreteComponentB;

public interface IVisitor {
    void VisitConcreteComponentA(ConcreteComponentA element);

    void VisitConcreteComponentB(ConcreteComponentB element);
}
