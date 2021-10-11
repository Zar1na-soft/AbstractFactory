package com.company;

public class DoorFactory {
    public static Door getDoor(DoorAbstractFactory factory){
        return factory.makeDoor();
    }
}
