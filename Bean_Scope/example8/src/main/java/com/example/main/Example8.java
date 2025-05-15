package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
In Singleton Bean, multiple beans can be created from same object
but only one instance will be returned.
* */
public class Example8 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p1 = context.getBean(Person.class);
        Person p2 = context.getBean("person", Person.class);
        System.out.println("The hashcode for object p1 is " + p1.hashCode());
        System.out.println("The hashcode for object p2 is " + p2.hashCode());
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("The person bean is a Prototype scoped bean");
        }
        else{
            System.out.println("The person bean is a Singleton scoped bean");
        }
    }
}
