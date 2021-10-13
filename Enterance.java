package com.company;

public class Enterance implements Door{

    private String doorhandle;
    private String lock;
    private String material;
    public Enterance(String doorhandle, String lock, String material){
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
     @Override
    public String toString(){
        return "doorhandle= "+this.getDoorhandle()+", lock="+this.getLock()+", material="+this.getMaterial();
    }
}
