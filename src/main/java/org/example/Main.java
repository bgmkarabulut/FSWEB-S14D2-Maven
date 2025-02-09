package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp=new Lamp(LampType.NORMAL,true,15);
        System.out.println(lamp.getGlobRating());
        System.out.println(lamp.getStyle());
        System.out.println(lamp.isBattery());
        lamp.turnOn();

        Bedroom bedroom =new Bedroom("Bella",new Wall("kuzey"),new Wall("güney"),new Wall("doğu"),new Wall("batı"),
                new Ceiling(12, PaintColor.RED),new Bed("King",3,180,2,1),
                new Lamp(LampType.NEON,true,14),new Wardrobe(5,6,8.5),new Carpet(100,90,PaintColor.RED));
        bedroom.getBed();
        bedroom.getCarpet();
        bedroom.getCeiling();
        bedroom.getLamp();
        bedroom.getName();
        bedroom.getWall1();
        bedroom.getWall2();
        bedroom.getWall3();
        bedroom.getWall4();
        bedroom.getWardrobe();
    }
}