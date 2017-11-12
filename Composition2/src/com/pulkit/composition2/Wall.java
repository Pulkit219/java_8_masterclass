package com.pulkit.composition2;

public class Wall {
    private int dimension;

    public Wall(int dimension) {
        this.dimension = dimension;

    }
    public void wallContructor(){
        System.out.println("contructing wall of" + this.dimension);
    }
}
