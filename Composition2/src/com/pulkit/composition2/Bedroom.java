package com.pulkit.composition2;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Lamp lamp;
    private Bed bed;

    public Bedroom(String name,Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Bed bed) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
        this.name =name;
        BedroomInProgress();
    }
public void BedroomInProgress()
{

    this.bed.BedContructor();
    this.lamp.lampReady();
}

}
