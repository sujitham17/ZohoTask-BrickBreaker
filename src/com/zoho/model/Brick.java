package com.zoho.model;

public class Brick {

    private int strength;

    public Brick(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void hit() {
        strength--;
    }

    public boolean isDestroyed() {
        return strength <= 0;
    }
}