/**
 * String Practice
 * Author: William Rex
 * Date: February 12, 2025
 * Description: This program takes two user-inputed phrases and compares them. 
 *              It checks if the phrases are exactly the same, 
 *              if one phrase is found within another 
 *              or if they are completely different.
 */

import java.util.Scanner;

public class StringPractice
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in); //Creates a Scanner object to read user input

        System.out.println("Enter first phrase:"); //Prompts user to enter their first phrase
        String phraseOne = input.nextLine();

        System.out.println("Enter second phrase:"); //Prompts user to enter their second phrase
        String phraseTwo = input.nextLine();

        if(phraseOne.equals(phraseTwo)) //Checks if both phrases are exactly the same
        {
            System.out.println("Both phrases match");
        }
        else if(phraseTwo.indexOf(phraseOne) != -1) //Checks if phraseOne is found within phraseTwo
        {
            System.out.println("Output: " + phraseOne + " is found within " + phraseTwo);
        }
        else if(phraseOne.indexOf(phraseTwo) != -1) //Checks if phraseTwo is found within phraseOne
        {
            System.out.println("Output: " + phraseTwo + " is found within " + phraseOne);
        }
        else //If none of the conditions are met above, the phrases do not match
        {
            System.out.println("No matches");
        }
        
        input.close(); //Closes scanner
    }
}