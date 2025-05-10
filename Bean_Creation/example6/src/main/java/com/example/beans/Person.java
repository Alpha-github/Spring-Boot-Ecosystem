package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Best method: Use @Autowired on constructor to ensure security by using 'final' on Bean
@Component
public class Person {

    private String name = "John";
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle){ //Constructor
        System.out.println("Person bean has been created!");
        this.vehicle = vehicle;
    }

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}
