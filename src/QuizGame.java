import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        //java quiz game
        //Questions array[]
        //options array[]
        //declare variables
        //welcome message
        //question loop
        //options
        //get guess from user
        //check out guess
        //display final code
    String[] questions = {
            "What is the capital of Kyrgyzstan?",
            "How many planets are there?",
            "what is the biggest ocean?",
            "What is the largest country?",
            "What is the chemical formula for table salt?"};
    String[][] options = {
            {"1. Balykchy", "2. Bishkek", "3. Osh", "4. Almaty"},
            {"1. Five", "2. Nine", "3. Seven", "4. Eight"},
            {"1. Pacific Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Atlantic Ocean"},
            {"1. Canada", "2. Brazil", "3. USA", "4. Russia"},
            {"1. KCL", "2. NaCL", "3. CaCO3", "4. MgSO4"}
    };

        int[] answers = {2, 4, 1, 4, 2};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("*****************************");

        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            System.out.println("*******");
            if(guess == answers[i]){
                System.out.println("Correct!");
                System.out.println("*******");
                score++;

            }else{
                System.out.println("Wrong!");
                System.out.println("*******");
            }
        }
        System.out.println("Your final score is: "+ score+ " out of "+ questions.length);

        scanner.close();
    }


}
