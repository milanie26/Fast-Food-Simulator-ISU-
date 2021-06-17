package isu_game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Orders {

    private int score = 0;
    private int strike = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public static int getRandomInt(int maxNum) {
        int rng = new Random().nextInt((maxNum - 1) + 1) + 1;
        return rng;
    }

    public String determineOrder(int[] orderArray) {
        String order = "";
        for (int i = 0; i < orderArray.length; i++) {
            if (orderArray[i] == 1) {
                order = (order + "Burger, ");
            } else if (orderArray[i] == 2) {
                order = (order + "Fries, ");
            } else if (orderArray[i] == 3) {
                order = (order + "Soda, ");
            } else if (orderArray[i] == 4) {
                order = (order + "Milkshake, ");
            } else if (orderArray[i] == 5) {
                order = (order + "Cookie, ");
            } else if (orderArray[i] == 6) {
                order = (order + "Sandwich, ");
            }
        }
        if (order.endsWith(", ")) {
            order = order.substring(0, order.length() - 2);
        }
        return order;
    }

    public void round1() {

        Scanner scan = new Scanner(System.in);

        int number = getRandomInt(8);

        int[] randomorder1 = {1,2,3,4};
        int[] randomorder2 = {2,3,4,2};
        int[] randomorder3 = {3,4,4,1};
        int[] randomorder4 = {1,2,4,3};
        int[] randomorder5 = {4,5,1,2};
        int[] randomorder6 = {6,2,1,2};
        int[] randomorder7 = {3,2,6,4};
        int[] randomorder8 = {5,5,4,4};
        
        System.out.println("_______________________________________________________________\n");

        if (number == 1) {
            System.out.println(determineOrder(randomorder1));
        } else if (number == 2) {
            System.out.println(determineOrder(randomorder2));
        } else if (number == 3) {
            System.out.println(determineOrder(randomorder3));
        } else if (number == 4) {
            System.out.println(determineOrder(randomorder4));
        } else if (number == 5) {
            System.out.println(determineOrder(randomorder5));
        } else if (number == 6) {
            System.out.println(determineOrder(randomorder6));
        } else if (number == 7) {
            System.out.println(determineOrder(randomorder7));
        } else if (number == 8) {
            System.out.println(determineOrder(randomorder8));
        }
        
        System.out.println("_______________________________________________________________");

        System.out.println("\nSelect the correct items in order.\n " +
            "\n1 = Burger\r\n" +
            "2 = Fries \r\n" +
            "3 = Soda\r\n" +
            "4 = Milkshake\r\n" +
            "5 = Cookie\r\n" +
            "6 = Sandwich");

        int a1 = 0, a2 = 0, a3 = 0, a4 = 0;

        for (int i = 1; i <= 4; i++) {
            if (i == 1) {
                a1 = scan.nextInt();
            } else if (i == 2) {
                a2 = scan.nextInt();
            } else if (i == 3) {
                a3 = scan.nextInt();
            } else if (i == 4) {
                a4 = scan.nextInt();
            }
        }

        int inputOrder[] = {a1,a2,a3,a4};

        if (number == 1) {
            boolean result = Arrays.equals(inputOrder, randomorder1);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 2) {
            boolean result = Arrays.equals(inputOrder, randomorder2);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 3) {
            boolean result = Arrays.equals(inputOrder, randomorder3);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 4) {
            boolean result = Arrays.equals(inputOrder, randomorder4);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 5) {
            boolean result = Arrays.equals(inputOrder, randomorder5);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 6) {
            boolean result = Arrays.equals(inputOrder, randomorder6);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 7) {
            boolean result = Arrays.equals(inputOrder, randomorder7);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 8) {
            boolean result = Arrays.equals(inputOrder, randomorder8);
            if (result == true) {
                System.out.println("\nOrder Correct! +1 Point\n");
                score += 1;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        }
    }

    public void round2() {

        Scanner scan = new Scanner(System.in);

        int number = getRandomInt(8);

        int[] randomorder1 = {1,2,3,4,5,6};
        int[] randomorder2 = {2,3,4,2,4,3};
        int[] randomorder3 = {3,4,4,1,1,2};
        int[] randomorder4 = {1,2,4,3,4,3};
        int[] randomorder5 = {4,5,1,2,1,2};
        int[] randomorder6 = {6,2,1,2,5,4};
        int[] randomorder7 = {3,2,6,4,6,1};
        int[] randomorder8 = {5,5,4,4,1,3};
        
        System.out.println("_______________________________________________________________\n");


        if (number == 1) {
            System.out.println(determineOrder(randomorder1));
        } else if (number == 2) {
            System.out.println(determineOrder(randomorder2));
        } else if (number == 3) {
            System.out.println(determineOrder(randomorder3));
        } else if (number == 4) {
            System.out.println(determineOrder(randomorder4));
        } else if (number == 5) {
            System.out.println(determineOrder(randomorder5));
        } else if (number == 6) {
            System.out.println(determineOrder(randomorder6));
        } else if (number == 7) {
            System.out.println(determineOrder(randomorder7));
        } else if (number == 8) {
            System.out.println(determineOrder(randomorder8));
        }
        
        System.out.println("_______________________________________________________________");

        System.out.println("\nSelect the correct items in order.\n " +
            "\n1 = Burger\r\n" +
            "2 = Fries \r\n" +
            "3 = Soda\r\n" +
            "4 = Milkshake\r\n" +
            "5 = Cookie\r\n" +
            "6 = Sandwich");

        int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0;

        for (int i = 1; i <= 6; i++) {
            if (i == 1) {
                a1 = scan.nextInt();
            } else if (i == 2) {
                a2 = scan.nextInt();
            } else if (i == 3) {
                a3 = scan.nextInt();
            } else if (i == 4) {
                a4 = scan.nextInt();
            } else if (i == 5) {
                a5 = scan.nextInt();
            } else if (i == 6) {
                a6 = scan.nextInt();
            }
        }

        int inputOrder[] = {a1,a2,a3,a4,a5,a6};

        if (number == 1) {
            boolean result = Arrays.equals(inputOrder, randomorder1);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }

        } else if (number == 2) {
            boolean result = Arrays.equals(inputOrder, randomorder2);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 3) {
            boolean result = Arrays.equals(inputOrder, randomorder3);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 4) {
            boolean result = Arrays.equals(inputOrder, randomorder4);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 5) {
            boolean result = Arrays.equals(inputOrder, randomorder5);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 6) {
            boolean result = Arrays.equals(inputOrder, randomorder6);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 7) {
            boolean result = Arrays.equals(inputOrder, randomorder7);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        } else if (number == 8) {
            boolean result = Arrays.equals(inputOrder, randomorder8);
            if (result == true) {
                System.out.println("\nOrder Correct! +2 Points\n");
                score += 2;
            } else {
                System.out.println("\nOrder Incorrect. +1 Strike\n");
                strike += 1;
            }
        }
    }
}