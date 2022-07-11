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

                    System.out.println("Please enter your name: ");
                    String name = input.nextLine();
                    System.out.println("\nHello " + name + "!");
                    System.out.println("You have 10 questions to answer.");
                    System.out.println("Good luck!\n\n");
                    
                    score = getScore();

                    System.out.println("\nThe score for "+name +" is: " +score);

                    if (score > highestScore){
                        highestScore = score;
                        highestScoreName = name;
                        System.out.println("New high score: "+ highestScore);
                    }
                    else 
                        System.out.println("Your current score is: "+ score);
                    break;

                case "2":
                    System.out.println("\nThe highest score is: " + highestScore + " by " + highestScoreName);
                    break;
                    
                case "3":
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                    break;

                default:
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
                    
                System.out.println(questions.question(i));

                Instant startTime = Instant.now();
                String response = input.nextLine();
                Instant endTime = Instant.now();

                System.out.println("Your answer is " + response);
                String correct = answers.answer(i);
    
                Duration timeTaken = Duration.between(startTime, endTime);
                System.out.println("Time taken: " + timeTaken.toSeconds() + " seconds");

                if(response.equals(correct))
                    {
                        System.out.println("Correct! \n");
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