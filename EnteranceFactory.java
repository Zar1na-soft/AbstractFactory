package com.company;

public class EnteranceFactory implements DoorAbstractFactory{
    private String doorhandle;
    private String lock;
    private String material;

    public EnteranceFactory(String doorhandle, String lock, String material){
        this.doorhandle = doorhandle;
        this.lock = lock;
        this.material = material;
    }

    @Override
    public Door makeDoor() {
        return new Enterance(doorhandle,lock,material);
    }
}
