package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    private String name = "Michelin";
//    public MichelinTyres(String name){
//        this.name=name;
//    }
    public String rotateTyres(){
        return "Rotating" + name + " tyres";
    }
}
