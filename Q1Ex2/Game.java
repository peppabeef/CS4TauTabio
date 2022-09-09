package q1ex2;
import java.util.Scanner;
import java.util.Random;

public class Game {
    private int tries = 3;
    private int upperLimit = 10;
    private int lowerLimit = 0;
    private int number;
    private int userInput;
    private Random rand = new Random();
    private Scanner sc = new Scanner(System.in);
    private void getRandomNum() {
        number = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
    }
    public void play() {
        System.out.println("Welcome to Higher or Lower! Choose a number to decide!\n\n[1] Start game\n[2] Change Settings\n[3] End Application\n\n");
        userInput = Integer.parseInt(sc.nextLine());
        switch(userInput) {
            case 1:
                startGame();
                break;
            case 2:
                changeSettings();
                break;
            case 3:
                System.exit(0);
        }
    }
    private void startGame() {
        getRandomNum();
        for(int i = 0; i < tries; i++) {
            System.out.printf("You have %d guess(es) left, What is your guess? ", tries - i);
            userInput = Integer.parseInt(sc.nextLine());
            if(userInput > upperLimit) {
                System.out.println("Your guess is greater than the upper limit. Guess is not valid");
                i--;
            } else if (userInput < lowerLimit) {
                System.out.println("Your guess is less than the lower limit. Guess is not valid");
                i--;
            } else if (userInput > number) {
                System.out.println("Your guess is higher than the number");
            } else if (userInput < number) {
                System.out.println("Your guess is lower than the number");
            } else {
                System.out.println("Your answer is correct!");
                System.out.println("Play Again?\n[1] yes\n[2] no");
                userInput = Integer.parseInt(sc.nextLine());
                if (userInput == 1) {
                    return;
                } else if (userInput == 2) {
                    System.exit(0);
                }
            }
        }
        
        System.out.printf("The correct answer was %d\n", number);
    }
    
    private void changeSettings() {
        System.out.println("What is the upper limit: ");
        userInput = Integer.parseInt(sc.nextLine());
        upperLimit = userInput;
        System.out.println("What is the lower limit: ");
        userInput = Integer.parseInt(sc.nextLine());
        lowerLimit = userInput;
        System.out.println("What is the number of guesses: ");
        userInput = Integer.parseInt(sc.nextLine());
        tries = userInput;
        System.out.printf("Settings Changed!\nUpper limit: %d\nLower limit: %d\nNumber of Guess: %d\n", upperLimit, lowerLimit, tries);
    }
}
