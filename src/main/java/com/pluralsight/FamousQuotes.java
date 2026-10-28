package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String userText = "";
        int answer = 0;

        String[] famousQuotes = new String[10];
        famousQuotes[0] = "Motivation Quote";
        famousQuotes[1] = "Motivation Quote";
        famousQuotes[2] = "Motivation Quote";
        famousQuotes[3] = "Motivation Quote";
        famousQuotes[4] = "Motivation Quote";
        famousQuotes[5] = "Motivation Quote";
        famousQuotes[6] = "Motivation Quote";
        famousQuotes[7] = "Motivation Quote";
        famousQuotes[8] = "Motivation Quote";
        famousQuotes[9] = "Motivation Quote";

        do {
            try {
                System.out.println("Choose a number 1-10 or random for a quote: ");
                userText = userInput.nextLine();
                if (userText.equalsIgnoreCase("random")){
                    answer = (int) ((Math.random() * (10 - 1 + 1)) + 1);
                    System.out.println(answer);
                } else {
                    answer = Integer.parseInt(userText);
                }
                if (answer == 0) {
                    answer++;
                }
                System.out.println(famousQuotes[answer - 1]);
            } catch (ArrayIndexOutOfBoundsException indexError) {
                System.err.println("Bad index: " + indexError.getMessage());
            }
            System.out.println("Want another quote? (Yes/No)");
            userText = userInput.nextLine();
        } while (userText.equalsIgnoreCase("yes"));
        userInput.close();
    }
}
