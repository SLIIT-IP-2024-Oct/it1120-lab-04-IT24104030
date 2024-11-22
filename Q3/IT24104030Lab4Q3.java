import java.util.Scanner;

public class IT24104030Lab4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user to input a number
        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        // Utilizing a ternary operator to classify the number as positive, negative, or zero
        String numberClassification = (number>0) ? "The number is: Positive" : (number<0) ? "The number is: Negative" : "The number is Zero";

        // Outputting the classification of the number
        System.out.print(numberClassification);
    }
}
