package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example3 {

    public static void main(String[] args) { //shortcut: psvm
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Vokswagen");
        Supplier<Vehicle> VolkswagenSupplier = () -> volkswagen; // -> indicates that it is a lambda function
        // Supplier provides a method to create a new object and add it to spring context

        Supplier<Vehicle> AudiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNum = random.nextInt(10);
        System.out.println(randomNum);
        if(randomNum%2==0){
            context.registerBean("volkswagen",Vehicle.class,VolkswagenSupplier);
            // registerBean(name of bean, class data type, supplier lambda function)
        } else {
            context.registerBean("audi",Vehicle.class,AudiSupplier);
        }

        // Check if bean is being loaded into context
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try{
            volksVehicle = context.getBean("volkswagen",Vehicle.class);
        }catch(NoSuchBeanDefinitionException e){
            System.out.println("Volkswagen not loaded");
        }

        try{
            audiVehicle = context.getBean("audi",Vehicle.class);
        }catch(NoSuchBeanDefinitionException e){
            System.out.println("Audi not loaded");
        }

        if(null != volksVehicle){
            System.out.println(volksVehicle.getName());
        }

        if(null != audiVehicle){
            System.out.println(audiVehicle.getName());
        }
    }
}
