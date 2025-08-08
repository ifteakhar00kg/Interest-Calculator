package org.example;
import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args){
        //Scanner declaration
        Scanner sc = new Scanner(System.in);

        //Principal amount input
        System.out.print("\nEnter the principal amount: ");
        int principalAmount = sc.nextInt();

        //Interest rate input
        System.out.print("Enter the interest rate: ");
        float interestRate = sc.nextFloat();

        //Time input
        sc.nextLine();
        System.out.print("Enter time: ");
        String timeString1 = sc.nextLine();

        //Converting string time to float time
        String timeString2 = timeString1.substring(0, timeString1.length()-1);
        float timeFloat = Float.parseFloat(timeString2);

        // Get the last character
        char lastChar = timeString1.charAt(timeString1.length() - 1);

        //Showing final interest
        if (lastChar == 'y'){
            float interestOnly = (principalAmount * interestRate * timeFloat / 100);      //Counting

            System.out.println("Total Interest: " + interestOnly + " Taka");        //Output
        } else if (lastChar == 'm') {
            timeFloat = timeFloat/12;
            float interestOnly = (principalAmount * interestRate * timeFloat / 100);     //Counting

            System.out.println("Total Interest: " + interestOnly + " Taka");      //Output
        }
        else {
            System.out.println("Invalid Input!!");      //Output
        }
    }
}
