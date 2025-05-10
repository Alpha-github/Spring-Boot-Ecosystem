package com.example.config;


import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.

To tell Spring it needs to search for classes annotated
with stereotype annotations, we use the @ComponentScan annotation over the
configuration class.
* */
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    /*
    @Bean annotation indicates that the method produces a bean to be managed by Spring.
    We use @Bean annotation over the methods that produce the beans.

    Since we want to create multiple beans of same class in this program, we use this.
    * */

    @Bean
    public Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    public Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    @Primary
    public Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }

}
