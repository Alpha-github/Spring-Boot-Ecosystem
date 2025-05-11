package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpearkers implements Speakers {
    private String name="Bose";
//    public BoseSpearkers(String name){
//        this.name=name;
//    }
    public String makeSound() {
        return name + " speakers are playing music";
    }
}
