package com.bl.SnakeAndLadder;
import java.util.*;
/*
The Player rolls the die to get a number between 1 to 6. - Use ((RANDOM)) to get the number between 1 to 6
 */
public class SnakeAndLadderUC2 {
        int playerPosition = 0;      // Declaring Instance Variable

        //Method to display player position
        public void showPosition(){
            System.out.println("Player Position is " +playerPosition);
        }
        // Method to Roll the die and get no between 1 to 6
        public int rollDie() {
            int dieNo = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            return dieNo;
        }

        public static void main(String[] args) {
            // Displaying welcome message
            System.out.println("Welcome to Snake and Ladder Game");
            // Creating object for Player
            SnakeAndLadderUC2 UC = new SnakeAndLadderUC2();
            // Showing player position
            UC.showPosition();
            // Showing Die Rolling number
            System.out.println("Die Number for Player: " + UC.rollDie());

        }
    }