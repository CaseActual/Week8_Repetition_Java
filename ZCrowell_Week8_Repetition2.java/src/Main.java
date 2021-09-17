/* ZCrowell_Week8_Repetition1.java
 * Gymnastics scoring program
 * For CSCI 111 Section 002
 * Last edited Nov. 4, 2020 by Zane Crowell
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // define and initialize variables
        int judgeCount;
        double judgeScore;
        double scoreSum = 0;
        double avgScore = 0;
        int numJudges = 6;

        // Scanner for keyboard input
        Scanner kb = new Scanner(System.in);

        // Greet user
        System.out.println("Hello, this program will calculate the average of scores from six judges.");

        // get user input with loop
        for (judgeCount = 1; judgeCount < 7; judgeCount++) {
            System.out.println("Judge " + judgeCount + ", please enter your score below: ");
            judgeScore = kb.nextDouble();
            scoreSum += judgeScore;
            avgScore = (scoreSum/numJudges); // variable used in denominator to avoid hardcoding the int 6.
        }

        // print average
        System.out.printf("The average score is: %.1f", avgScore);
    } // end main() method
} // end Main
