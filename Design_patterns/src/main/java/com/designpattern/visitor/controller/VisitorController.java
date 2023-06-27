package com.hcmute.springboot.behavioralpatterns.visitor.controller;

import com.hcmute.springboot.behavioralpatterns.visitor.client.client;
import com.hcmute.springboot.behavioralpatterns.visitor.element.IComponent;
import com.hcmute.springboot.behavioralpatterns.visitor.element.component.ConcreteComponentA;
import com.hcmute.springboot.behavioralpatterns.visitor.element.component.ConcreteComponentB;
import com.hcmute.springboot.behavioralpatterns.visitor.visitor.IVisitor;
import com.hcmute.springboot.behavioralpatterns.visitor.visitor.visitor.ConcreteVisitor1;
import com.hcmute.springboot.behavioralpatterns.visitor.visitor.visitor.ConcreteVisitor2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/visitor")
public class VisitorController {
    @GetMapping
    public ResponseEntity getVisitor() {
        List<IComponent> components = new ArrayList<>();
        components.add(new ConcreteComponentA());
        components.add(new ConcreteComponentB());
        System.out.println("The client code works with all visitors via the base Visitor interface:");
        IVisitor visitor1 = new ConcreteVisitor1();
        client.ClientCode(components, visitor1);

        System.out.println();

        System.out.println("It allows the same client code to work with different types of visitors:");
        IVisitor visitor2 = new ConcreteVisitor2();
        client.ClientCode(components, visitor2);


        return ResponseEntity.noContent().build();
    }
}
