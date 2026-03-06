package com.zoho.model;

public class Ball {

    private int row;
    private int col;
    private int lives;

    public Ball(int row, int col, int lives) {
        this.row = row;
        this.col = col;
        this.lives = lives;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getLives() {
        return lives;
    }

    public void decreaseLife() {
        lives--;
    }

    public void resetPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }
}