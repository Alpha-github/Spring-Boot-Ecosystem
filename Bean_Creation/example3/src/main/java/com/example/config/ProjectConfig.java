package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is a part of the spring core framework.
Spring configuration annotation indicates that the class has @Bean definition
methods. So spring container can process the class and generate Spring Beans to be
used in the application.
 */

@Configuration
@ComponentScan(basePackages = "com.example.beans") //This wont create any bean coz @Component is missing in Vehicle.java
public class ProjectConfig { }
