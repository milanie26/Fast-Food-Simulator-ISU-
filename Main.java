package isu_game;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Orders order = new Orders();

    public static void main(String[] args) {

        System.out.println("             _____________________________________\n             |                                    |" +
            "\n             |  Welcome to Fast Food Simulator    |             \n" +
            "             |____________________________________|");
        System.out.println("\nInstructions: A customer will order items off the menu " +
            "\nand you must select the correct items in order." +
            "\nEach order in round 1 is worth 1 point. \nEach order in round 2 is worth 2 points." +
            "\nIf you get the order wrong, you will recieve 1 strike. \nIf you get 3 strikes, you lose." +
           
        		"\n\nObjective: Try to score as many points as possible without \ngetting 3 strikes.\n");

        start1();
    }

    public static void start1() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~|Round 1|~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 5; i++) {
        	order.round1();
        	System.out.println("Strikes: " + order.getStrike());
            if (order.getStrike() == 3) {
                break;
            }
        }
        
        if (order.getStrike() == 3) {
            System.out.println("You got 3 strikes. You Lose.");
            exit();
        } else {
        	start2();
        }  
    }

    public static void start2() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~|Round 2|~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 5; i++) {
        	order.round2();
        	System.out.println("Strikes: " + order.getStrike());
            if (order.getStrike() == 3) {
                break;
            }
        }
        if (order.getStrike() == 3) {
            System.out.println("You got 3 strikes. You Lose.\n");
        } else {
        	System.out.println("You win!\n");
        }
        exit();
    }

    public static void exit() {

        System.out.println("Your Final Score is: " + order.getScore());
        System.out.println("\nPlay Again? \n\n1 = Yes \n2 = No\n");

        int choice = scan.nextInt();
        
        do {
        	if (choice == 1) {
                System.out.println("             _____________________________________\n             |                                    |" +
                        "\n             |  Welcome to Fast Food Simulator    |             \n" +
                        "             |____________________________________|");
                    System.out.println("\nInstructions: A customer will order items off the menu " +
                        "\nand you must select the correct items in order." +
                        "\nEach order in round 1 is worth 1 point. \nEach order in round 2 is worth 2 points." +
                        "\nIf you get the order wrong, you will recieve 1 strike. \nIf you get 3 strikes, you lose." +
                       
                    		"\n\nObjective: Try to score as many points as possible without \ngetting 3 strikes.\n");
                order.setScore(0);
                order.setStrike(0);
                start1();
            } else if (choice == 2) {
                System.out.println("\nThank you for playing!");
            } else {
                System.out.println("\nError.");
            }
        } while(choice != 1 && choice!= 2);  
    }
}