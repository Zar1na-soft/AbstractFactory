package com.company;

public class Interior extends Door{
    private String doorhandle;
    private String lock;
    private String material;

    public Interior(String doorhandle, String lock, String material){
        this.doorhandle = doorhandle;
        this.lock = lock;
        this.material = material;
    }
    @Override
    public String getDoorhandle() {
        return this.doorhandle;
    }

    @Override
    public String getLock() {
        return this.lock;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}