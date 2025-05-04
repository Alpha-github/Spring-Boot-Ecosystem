package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) { //shortcut: psvm
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println(veh1.getName()); // Uses default value from PostConstruct
        veh1.setName("Audi 8");
        System.out.println(veh1.getName());
        context.close();
    }
}
