
import java.util.*;

public class number_guessing {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int count = 1;

        System.out.println("Let's start the Game");
        System.out.println("You can leave the game by entering 0");
        System.out.println("Enter the Number from 1-100 : ");
        int ran_num = scr.nextInt(); // Change 'sc' to 'scr'

        if (ran_num == 0) {
            System.out.println("Exit Game");
        } else {
            if (ran_num > 0 && ran_num < 101) {
                Random random = new Random();
                int compareNumber = random.nextInt(100);

                while (compareNumber != ran_num) {
                    if (count <= 5) {
                        if (ran_num > compareNumber) {
                            System.out.println("Enter The Smaller Number ");
                            ran_num = scr.nextInt(); // Change 'sc' to 'scr'
                            count++;
                        } else if (ran_num < compareNumber) {
                            System.out.println("Enter The Larger Number ");
                            ran_num = scr.nextInt(); // Change 'sc' to 'scr'
                            count++;
                        }
                        if (ran_num == compareNumber) {
                            System.out.println("Congratulations! You Guessed The Correct Number ");
                            System.out.println("Your Guessed Number is " + ran_num);
                            System.out.println("No of Attempts: " + count);
                            int per = 100 / count;
                            System.out.println("Points based on the Number of Attempts: " + per);
                        }
                    } else {
                        System.out.println("You have reached the maximum number of attempts.");
                        break;
                    }
                }
            } else {
                System.out.println("Please Enter a Valid Number between 1 and 100.");
                System.out.println("Restart the Game ");
            }
        }
    }
}

