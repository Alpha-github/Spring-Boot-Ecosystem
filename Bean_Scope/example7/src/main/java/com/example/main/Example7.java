package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
In Singleton Bean, multiple beans can be created from same object
but only one instance will be returned.
* */
public class Example7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("The print statement before this is executed through EAGER Instantiation");
        Person p1 = context.getBean(Person.class);
        Person p2 = context.getBean("person", Person.class);
        System.out.println("The print statement before this is executed through LAZY Instantiation");
        System.out.println("The hashcode for object p1 is " + p1.hashCode());
        System.out.println("The hashcode for object p2 is " + p2.hashCode());
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("Both objects are referring the same bean instance");
        }
    }
}
