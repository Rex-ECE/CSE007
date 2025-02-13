/**
 * Movie Ticket Cost Calculator
 * Author: William Rex
 * Date: February 12, 2025
 * Description: This program calculates the cost of a movie ticket based on the user's age and time of day.
 */

import java.util.Scanner;

public class MovieTickets{
    public static void main (String[]args){
       
       Scanner input = new Scanner(System.in);
       double SALES_TAX = 0.06; //This is the double variable for sales tax
       boolean hasError = false; //This is the boolean variable for the error statement
       int age = 0; //This is the int variable for age

        System.out.println("What time of day will you be seeing the movie? (Morning, Afternoon, Evening) "); //This asks at what time of day will the person be watching the movie 
        String timeOfDay = input.nextLine(); //This is the string variable for the time of the day

        if(!timeOfDay.equals("Morning") && !timeOfDay.equals("Afternoon") && !timeOfDay.equals("Evening")) //This checks that the person input a valid string based on the times above
        {
            System.out.println("Error: Invalid time of day. Please enter Morning, Afternoon or Evening.");
            hasError = true;
        }

        System.out.println("How old are you? "); //This asks how old are the person watching the movie is
        if (!input.hasNextInt())//This checks that the person input a valid integer number for their age
        {
            System.out.println("Error: Age must be a valid integer number");
            hasError = true;
        }
        else
        {
            age = input.nextInt(); //This is the int variable for age
            if (age < 0)//This checks that the person input an integer number 0 or greater for their age
            {
            System.out.println("Error: Age must be 0 or greater");
            hasError = true;
            }
        }

        if (hasError)
        {
            input.close();
            return;
        }

        int costOfTicket = 0; //This is the variable for the cost of the ticket
        if (age <= 3){ //Anyone at or below the age of three, gets their ticket for free
            costOfTicket = 0;
        }
        else //The else leads to different prices based on your age, past three years old
        {
            switch(timeOfDay)
            {
                case "Morning": //The first case checks if the person input that they would be watching the movie in the morning
                    if(age >= 4 && age <= 10) //Anyone from the age range of 4-10 gets a free ticket during the morning
                    {
                        costOfTicket = 0;
                    }
                    else //Anyone above the age of 10 must pay $7 dollars for their ticket in the morning
                    {
                        costOfTicket = 7;
                    }
                    break;
                case "Afternoon": //The second case checks if the person input that they would be watching the movie in the afternoon
                    if(age >= 4) //Anyone at or above the age of 4 must pay $10 dollars for their ticket in the afternoon
                    {
                        costOfTicket = 10;
                    }
                    break;
                case "Evening": //The third case checks if the person input that they would be watching the movie in the evening
                    if(age >= 4 && age <= 16) //Anyone from the age range of 4-16 must pay $10 dollars for their ticket
                    {
                        costOfTicket = 10;
                    }
                    else if(age >= 17 && age <= 54) //Anyone from the age range of 17-54 must pay $20 dollars for their ticket
                    {
                        costOfTicket = 20;
                    }
                    else //Anyone at or above the age of 55 must pay $15 dollars for their ticket
                    {
                        costOfTicket = 15;
                    }
                    break;
            }
        }
        System.out.println("The cost of the movie ticket before sales tax is $" + costOfTicket + " dollars."); //This prints the initial price before sales tax for the ticket
        double ticketSalesTax = costOfTicket * SALES_TAX; //This is the double variable for the sales tax applied to the ticket
        double finalPrice = costOfTicket + ticketSalesTax; //This is the double variable for the final price of the ticket
        System.out.printf("The final cost of your movie ticket is $%.2f dollars.\n", finalPrice); //This prints the final price with sales tax for the ticket
    }
}