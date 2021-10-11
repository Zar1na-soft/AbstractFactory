package com.company;

public abstract class Door {
    public abstract String getDoorhandle();
    public abstract String getLock();
    public abstract String getMaterial();

    @Override
    public String toString(){
        return "doorhandle= "+this.getDoorhandle()+", lock="+this.getLock()+", material="+this.getMaterial();
    }
}
