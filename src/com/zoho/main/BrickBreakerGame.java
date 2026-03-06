package com.zoho.main;

import java.util.Scanner;

import com.zoho.model.Ball;
import com.zoho.model.Board;
import com.zoho.service.GameService;

public class BrickBreakerGame {

    public static void main(String[] args) {

        Board board = new Board(7);
        Ball ball = new Ball(6, 3, 5);

        board.placeBrick(2,2,1);
        board.placeBrick(2,3,1);
        board.placeBrick(2,4,1);
        board.placeBrick(3,2,1);
        board.placeBrick(3,3,1);
        board.placeBrick(3,4,1);

        GameService gameService = new GameService(board, ball);

        Scanner sc = new Scanner(System.in);

        while (ball.getLives() > 0) {

            board.printBoard(ball);
            System.out.println("Ball count: " + ball.getLives());
            System.out.println("Enter Command (St / Lt / Rt / Exit): ");

            String cmd = sc.next();

            if (cmd.equalsIgnoreCase("Exit"))
                break;

            gameService.move(cmd);
        }

        System.out.println("Game Over!");
    }
}