package com.example.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* This is EAGER Instantiation of Singleton bean, where the bean is created
 when the application context is created before the bean is called or used. */

/* This is LAZY Instantiation of Singleton bean, where the bean is created
 when the bean is called or used. This can be used to create beans which aren't used often. */

@Component(value="person")
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class Person {
    private String name = "John";

    public Person() {
        System.out.println("Person created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
