package com.bl.SnakeAndLadder;
import java.util.Random;
/*
 * #Developer : Rahul Girgals
 * The Player then checks for a Option. They are No Play, Ladder or Snake.
 *  - Use ((RANDOM)) to get the number between 1 to 6
 */
public class SnakeAndLadderUC3 {

        // Constant
        public static final int IS_NO_PLAY = 1;
        public static final int IS_LADDER = 2;
        public static final int IS_SNAKE = 3;

        // Declaring Instance Variable
        int playerPosition = 0;
        int newPosition = 0;

        // Random Class Object for Generating Random Numbers
        Random randomNo = new Random();

        //Method to display player position
        public void showPosition() {
            System.out.println("Player Position: " + playerPosition);
        }

        // Method to Roll the die and get no between 1 to 6
        public int rollDie() {
            int dieNo = randomNo.nextInt(6) + 1;
            return dieNo;
        }


        //Method to check for rolling option
        public void optionPlay(int dieNo) {
            int optionNo = randomNo.nextInt(3) + 1;
            System.out.println("Option No : " + optionNo);

            switch (optionNo) {
                case IS_NO_PLAY  :
                    System.out.println("Player got NO PLAY");
                    newPosition = 0;
                    break;
                case IS_LADDER :
                    System.out.println("Yahoo!!! Player got LADDER");
                    playerPosition += dieNo;
                    break;
                case IS_SNAKE :
                    System.out.println("OOPS!!! Player got SNAKE");
                    playerPosition -= dieNo;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }
        }

        public static void main(String[] args) {
            // Displaying welcome message
            System.out.println("Welcome to Snake and Ladder Game");
            // Creating object for Player
            SnakeAndLadderUC3 player = new SnakeAndLadderUC3();
            // Showing player position
            player.showPosition();
            // Showing Die Rolling number
            int dieNo = player.rollDie();
            System.out.println("Die Number for Player: " + dieNo);
            // Player options
            player.optionPlay(dieNo);
            player.showPosition();
        }
    }
