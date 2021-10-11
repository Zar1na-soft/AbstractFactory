package com.company;

public class InteriorFactory implements DoorAbstractFactory{
    private String doorhandle;
    private String lock;
    private String material;

    public InteriorFactory(String doorhandle, String lock, String material){
        this.doorhandle = doorhandle;
        this.lock = lock;
        this.material = material;
    }

    @Override
    public Door makeDoor() {
        return new Interior(doorhandle,lock,material);
    }
}
