import java.util.Scanner;

import java.time.Instant;
import java.time.Duration;
import QuesandAns.Questions;
import QuesandAns.Answers;


public class Main{
    public static void main(String[] args) {
        Float score = 0.0f;
        Float highestScore = 0.0f;
        String highestScoreName = "";

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n\nWelcome to the Quiz Game! \n Please select an option.");
            System.out.println("1. Start the Quiz");
            System.out.println("2. See the highest score.");
            System.out.println("3. Exit");

            String userOption = input.nextLine();

            switch (userOption) {
                case "1":
                // Start the quiz

                    System.out.println("Please enter your name: ");
                    String name = input.nextLine();
                    System.out.println("\nHello " + name + "!");
                    System.out.println("Let's start the quiz!");
                    System.out.println("Good luck!\n\n");
                    
                    score = getScore();

                    System.out.println("\nThe score for "+name +" is: " +score);

                // Check if the score is the highest score

                    if (score > highestScore){
                        highestScore = score;
                        highestScoreName = name;
                        System.out.println("New high score: "+ highestScore);
                    }
                    else 
                        System.out.println("Your current score is: "+ score);
                    break;

                case "2":
                // See the highest score
                    System.out.println("\nThe highest score is: " + highestScore + " by " + highestScoreName);
                    break;
                    
                case "3":
                // Exit
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                    break;

                default:
                // Invalid option
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }



    public static float getScore(){
        Float score = 0.0f;

        Questions questions = new Questions();
        Answers answers = new Answers();
    
        Scanner input = new Scanner(System.in);
    
        for(int i=0; i<10; i++)
            {
                // Get the question
                System.out.println(questions.question(i));
                
                // Get the time before the user answers the question
                Instant startTime = Instant.now();

                // Get the answer from the user
                String response = input.nextLine();

                // Get the time after the user answers the question
                Instant endTime = Instant.now();

            
                System.out.println("Your answer is " + response);
                String correct = answers.answer(i);

                // Calculate the time taken to answer the question in seconds
                Duration timeTaken = Duration.between(startTime, endTime);
                System.out.println("Time taken: " + timeTaken.toSeconds() + " seconds");

                // Check if the answer is correct
                if(response.equals(correct))
                    {
                        System.out.println("Correct! \n");

                        // Add the time taken to the score
                        score = score + 2 * (60 - timeTaken.toSeconds()) / 40;                        
                    }
                else
                    {
                        System.out.println("Incorrect! \n");
                    }    
            }
        return score;
        
    }
}