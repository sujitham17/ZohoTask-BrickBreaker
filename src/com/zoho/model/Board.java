package com.zoho.model;

public class Board {

    private int size;
    private Brick[][] bricks;
    private char[][] layout;

    public Board(int size) {
        this.size = size;
        bricks = new Brick[size][size];
        layout = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i == 0 || j == 0 || j == size - 1) {
                    layout[i][j] = 'w';
                }
                else if (i == size - 1) {
                    layout[i][j] = 'g';
                }
                else {
                    layout[i][j] = ' ';
                }
            }
        }
    }

    public void placeBrick(int row, int col, int strength) {
        bricks[row][col] = new Brick(strength);
    }

    public Brick getBrick(int row, int col) {
        return bricks[row][col];
    }

    public void removeBrick(int row, int col) {
        bricks[row][col] = null;
    }

    public char getCell(int row, int col) {
        return layout[row][col];
    }

    public void printBoard(Ball ball) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i == ball.getRow() && j == ball.getCol()) {
                    System.out.print("o ");
                }
                else if (bricks[i][j] != null) {
                    System.out.print(bricks[i][j].getStrength() + " ");
                }
                else {
                    System.out.print(layout[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}