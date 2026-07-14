import java.util.InputMismatchException;
import java.util.Scanner;

class EscapeRoom {

    private int lives = 3;
    private Scanner sc = new Scanner(System.in);

    public void startGame() {

        System.out.println("=================================");
        System.out.println("      ESCAPE ROOM GAME");
        System.out.println("=================================");
        System.out.println("You have " + lives + " lives.");
        System.out.println();

        if (!room1()) return;
        if (!room2()) return;
        if (!room3()) return;
        if (!room4()) return;

        System.out.println("\n****************************");
        System.out.println(" EXIT DOOR OPENED!");
        System.out.println(" YOU ESCAPED!");
        System.out.println("****************************");
    }

    private boolean room1() {

        while (true) {

            if (lives == 0) {
                gameOver();
                return false;
            }

            try {

                System.out.println("\n===== ROOM 1 : Guess Number =====");
                System.out.println("Guess the secret number (1-10)");

                int answer = sc.nextInt();

                if (answer == 7) {
                    System.out.println("Correct! Door Unlocked.");
                    return true;
                } else {
                    loseLife();
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input! Enter a number.");
                sc.next();
            }
        }
    }

    private boolean room2() {

        while (true) {

            if (lives == 0) {
                gameOver();
                return false;
            }

            try {

                System.out.println("\n===== ROOM 2 : Array Puzzle =====");
                System.out.println("What is the index of first element in an array?");
                System.out.println("1. 1");
                System.out.println("2. 0");
                System.out.println("3. -1");
                System.out.println("4. 2");

                int choice = sc.nextInt();

                if (choice == 2) {
                    System.out.println("Correct! Door Unlocked.");
                    return true;
                } else {
                    loseLife();
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input!");
                sc.next();
            }
        }
    }

    private boolean room3() {

        while (true) {

            if (lives == 0) {
                gameOver();
                return false;
            }

            try {

                System.out.println("\n===== ROOM 3 : String Puzzle =====");
                System.out.println("Which method returns length of a String?");
                System.out.println("1. size()");
                System.out.println("2. length()");
                System.out.println("3. getLength()");
                System.out.println("4. count()");

                int choice = sc.nextInt();

                if (choice == 2) {
                    System.out.println("Correct! Door Unlocked.");
                    return true;
                } else {
                    loseLife();
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input!");
                sc.next();
            }
        }
    }

    private boolean room4() {

        while (true) {

            if (lives == 0) {
                gameOver();
                return false;
            }

            try {

                System.out.println("\n===== ROOM 4 : Java MCQ =====");
                System.out.println("Which keyword is used for inheritance?");
                System.out.println("1. implement");
                System.out.println("2. inherit");
                System.out.println("3. extends");
                System.out.println("4. super");

                int choice = sc.nextInt();

                if (choice == 3) {
                    System.out.println("Correct! Final Door Unlocked.");
                    return true;
                } else {
                    loseLife();
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input!");
                sc.next();
            }
        }
    }

    private void loseLife() {

        lives--;

        if (lives > 0)
            System.out.println("Wrong Answer! Lives Remaining: " + lives);
    }

    private void gameOver() {

        System.out.println("\n=======================");
        System.out.println(" GAME OVER");
        System.out.println(" You Lost All Lives.");
        System.out.println("=======================");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========================");
            System.out.println(" ESCAPE ROOM");
            System.out.println("========================");
            System.out.println("1. Start Game");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            try {

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        EscapeRoom game = new EscapeRoom();
                        game.startGame();
                        break;

                    case 2:
                        System.out.println("Thanks for playing!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");

                }

            } catch (InputMismatchException e) {

                System.out.println("Please enter a valid number.");
                sc.next();
            }
        }
    }
}