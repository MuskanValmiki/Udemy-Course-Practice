public class Quiz3 {
   public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        // TODO: Check pass or fail
        if(score>=50){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        // TODO: Determine grade based on score
        if(score>=90){
            System.out.println("Grade: " + grade);
        }
        else if(score >= 75 && score <= 89){
            System.out.println("Grade: " + grade);
        }
        else if(score >= 60 && score <= 74){
            System.out.println("Grade: " + grade);
        }
        else if(score <60){
            System.out.println("Grade: " + grade);
        }
   }
}

//Write a Java program to evaluate a student's performance using if-else and else-if statements.

// You are given the following:

// An integer variable score = 75

// A character variable grade = 'B'

// Your task is to:

// Use if-else to check if the student passed or failed.

// A score of 50 or above is considered a pass.

// Print "Passed" or "Failed" accordingly.

// Use else-if conditions to assign and print a grade based on the score:

// A for 90 and above

// B for 75 to 89

// C for 60 to 74

// D for below 60

// Use System.out.println() to clearly display the output.

// Instructions:

// The variables score and grade are already declared for you.

// Use if-else to evaluate pass/fail status.

// Use else-if to assign and print the grade based on the score.

// Ensure the output formatting matches the example output.

// Do not use ternary or switch statements in this exercise.



// Expected Output:

//   Passed

//   Grade:  B