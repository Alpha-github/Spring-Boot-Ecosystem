package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is a part of the spring core framework.
Spring configuration annotation indicates that the class has @Bean definition
methods. So spring container can process the class and generate Spring Beans to be
used in the application.
 */

@Configuration
public class ProjectConfig {

    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes it's context and adds the returned
    value to the context
     */

    @Bean(name="Audi")
    Vehicle vehicle1(){
        /* Noun type (vehicle) of naming is used instead of the
        normal Verb type (move_vehicle), because these methods
        will be converted to bean names inside spring context. */

        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(value="Honda")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda Civic");
        return veh;
    }

    /*
    When you have multiple beans of the same kind inside the Spring context,
    you can make one of them primary by using @Primary annotation. Primary bean is
    the one which Spring will choose if it has multiple options and you don’t specify a name.
    In other words, it is the default bean that Spring Context will consider in case of
    confusion due to multiple beans present of same type.
    * */

    @Primary
    @Bean("Ferrari")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari 488");
        return veh;
    }



    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 16;
    }

}
