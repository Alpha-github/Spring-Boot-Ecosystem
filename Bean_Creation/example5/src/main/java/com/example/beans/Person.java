package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//public class Person {
//    public Person(){ //Constructor
//        System.out.println("Person bean has been created!");
//    }
//
//    private String name  = "John";
//
//    /*
//    The @Autowired annotation marks on a field, constructor, Setter method
//    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
//    by Spring Dependency Injection mechanism
//    * */
//
////    @Autowired(required = false) //The FALSE, makes the existence of the vehicle bean optional
//    private Vehicle vehicle;
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Vehicle getVehicle() {
//        return vehicle;
//    }
//
////    @Autowired
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
//}


// Best method: Use @Autowired on constructor to ensure security by using 'final' on Bean
@Component
public class Person {

    @Autowired
    public Person(Vehicle vehicle){ //Constructor
        System.out.println("Person bean has been created!");
        this.vehicle = vehicle;
    }

    private String name  = "John";

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */

    private Vehicle vehicle;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
