package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    private String name="BridgeStone";
//    public BridgeStoneTyres(String name){
//        this.name=name;
//    }
    public String rotateTyres(){
        return "Rotating "+name+" tyres";
    }
}
