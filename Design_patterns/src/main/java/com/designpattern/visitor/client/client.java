package com.hcmute.springboot.behavioralpatterns.visitor.client;

import com.hcmute.springboot.behavioralpatterns.visitor.element.IComponent;
import com.hcmute.springboot.behavioralpatterns.visitor.visitor.IVisitor;

import java.util.List;

public class client {
    public static void ClientCode(List<IComponent> components, IVisitor visitor)
    {
        for (IComponent component: components){
            component.Accept(visitor);
        }
    }
}
