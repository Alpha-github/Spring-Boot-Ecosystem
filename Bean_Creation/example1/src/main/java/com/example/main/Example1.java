package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) { //shortcut: psvm
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("Audi",Vehicle.class);
        System.out.println(veh1.getName());

        Vehicle veh2 = context.getBean(Vehicle.class);
        System.out.println(veh2.getName());

        Vehicle veh3 = context.getBean("Honda",Vehicle.class);
        System.out.println(veh3.getName());



        var hello = context.getBean(String.class);
        // We can use var datatype on LHS,
        // coz the datatype is passed from the bean
        System.out.println(hello);
        Integer num = context.getBean(Integer.class);
        System.out.println(num);
    }
}
