package com.pulkit.composition2;

public class Lamp {
    private boolean battery;
    private boolean powerOn;

    public Lamp(boolean battery, boolean powerOn) {
        this.battery = battery;
        this.powerOn = powerOn;
    }

    public void lampReady(){
        System.out.println("lamp is ready powered on " +  this.powerOn + " has a Battery " + this.battery);
    }
}
