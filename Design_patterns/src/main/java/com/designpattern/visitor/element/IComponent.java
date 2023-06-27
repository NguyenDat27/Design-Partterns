package com.hcmute.springboot.behavioralpatterns.visitor.element;

import com.hcmute.springboot.behavioralpatterns.visitor.visitor.IVisitor;

public interface IComponent {
    void Accept(IVisitor visitor);
}
