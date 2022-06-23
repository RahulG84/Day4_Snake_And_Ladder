package com.bl.SnakeAndLadder;
/*
   Snake and Ladder game played with single player at start position 0
    */
public class SnakeAndLadderUC1 {
        int playerPosition = 0;      // Declaring Instance Variable

        //Method to display player position
        public void showPosition() {
            System.out.println("Player Start Position is " + playerPosition);
        }

        public static void main(String[] args) {
            // Displaying welcome message
            System.out.println("Welcome to Snake and Ladder Game");
            // Creating object for Player
            SnakeAndLadderUC1 UC = new SnakeAndLadderUC1();
            // Showing player position
            UC.showPosition();

        }
    }

