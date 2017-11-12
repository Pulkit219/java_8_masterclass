package com.pulkit.composition2;

public class Bed {
    private double dimensionLength;
    private double dimensionWidth;

    public Bed(double dimensionLength, double dimensionWidth) {
        this.dimensionLength = dimensionLength;
        this.dimensionWidth = dimensionWidth;


    }

    public void BedContructor(){
        System.out.println("contructing bed of" + this.dimensionLength  + " by " + this.dimensionWidth);
        System.out.println("Bed ready");
    }
}
