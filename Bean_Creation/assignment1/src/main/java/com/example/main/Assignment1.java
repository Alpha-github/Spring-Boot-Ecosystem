package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        System.out.println(Arrays.toString(persons));

        Person person = context.getBean(Person.class);

        String[] names = context.getBeanNamesForType(Vehicle.class);
        System.out.println(Arrays.toString(names));

        Vehicle vehicle = context.getBean(Vehicle.class);

//        vehicle.getVehicleServices().playMusic();
//        vehicle.getVehicleServices().moveVehicle();

        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
