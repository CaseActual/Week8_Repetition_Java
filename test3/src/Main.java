/* ZCrowell_Week8_Repetition2.java
 * Gymnastics scoring program - program ends with user input of -1.0
 * For CSCI 111 Section 002
 * Last edited Nov. 8, 2020 by Zane Crowell
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        // set up scanner for user input
        Scanner kb = new Scanner(System.in);

        // define and initialize variables
        int judgeCount = 2;
        int printCount = 0;
        double listSum = 0.0;
        double avgScore = 0.0;
        double judgeScore;

        // create ArrayList for storing scores
        ArrayList<Double> scoreList = new ArrayList<Double>();

        // greet user, get first input
        System.out.println("Hello, this program prints and calculates the average of judge scores.");
        System.out.println("You can input as many scores as you like, when finished, enter \'-1.0\'.");
        System.out.println("\nJudge 1, please enter your score below: ");

        // get user input with loop, add to ArrayList
        while(kb.hasNextDouble()) {
            System.out.println("Judge " + judgeCount + ", please enter your score below: ");
            judgeScore = kb.nextDouble();
            judgeCount++;
            if (judgeScore == -1.0) {       // ends loop if -1.0 is input
                break;
            }
            else
                scoreList.add(judgeScore);      // adds input scores to ArrayList
        }

        // sum and average the input scores
        for (int i=0; i<scoreList.size(); i++) {
            listSum += scoreList.get(i);
            avgScore = (listSum/scoreList.size());
        }

        // print outputs
        System.out.println("\n" + scoreList.size() + " Judges entered scores in total:");

        for(int i=0; i<scoreList.size(); i++) {
            printCount++;
            System.out.println("Score from Judge "+ printCount +": "+ scoreList.get(i));    // for loop to print specific judge scores
        }
        System.out.printf("\nThe average score is: %.1f", avgScore);
    } // end main()
}
