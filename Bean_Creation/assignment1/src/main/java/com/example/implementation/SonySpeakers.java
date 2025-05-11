package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {
    private String name = "Sony";
//    public SonySpeakers(String name) {
//        this.name = name;
//    }
    public String makeSound() {
        return name+" speakers are playing music";
    }
}