public class Main {
    public static void main(String[] args) {
        // --- INPUT DATA ---
        // An array of 5 arcade scores
        int[] scores = { 85, 92, 78, 99, 88 };
        
        // --- YOUR TASK ---
        int highestScore = 0;
        double averageScore = 0.0;
        int totalSum = 0;

        // 1. Write a for-loop to iterate through the 'scores' array
        // 2. Inside the loop, add each score to 'totalSum'
        // 3. Inside the loop, check if the current score is greater than 'highestScore'
        
        // TODO: Write your loop here!


        // 4. After the loop, calculate the average (Hint: be careful with integer division!)
        // TODO: Calculate averageScore here!

        // --- OUTPUT ---
        System.out.println("The highest score is: " + highestScore);
        System.out.println("The average score is: " + averageScore);
    }
}
