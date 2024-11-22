import java.util.Scanner;

public class IT24104030Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Requesting the user to enter the exam marks
        System.out.print("Enter the exam marks (out of 100): ");
        double examScore = scanner.nextDouble();

        // Checking if the entered exam marks are valid
        if (examScore < 0 || examScore > 100) {
            System.out.print("Invalid input for exam marks. Terminating program");
            return;
        } else {
            // Asking the user to input lab submission marks
            System.out.print("Enter the lab submission marks (out of 100): ");
            double labScore = scanner.nextDouble();

            // Verifying if the entered lab submission marks are valid
            if (labScore < 0 || labScore > 100) {
                System.out.print("Invalid input for lab marks. Terminating program");
                return;
            } else {
                // Requesting the user to input percentage weights
                System.out.print("Please enter the percentage given for the exam: ");
                double examWeight = scanner.nextDouble();

                System.out.print("Please enter the percentage given for the lab submission: ");
                double labWeight = scanner.nextDouble();

                // Ensuring that the percentages add up to 100
                if (examWeight + labWeight != 100) {
                    System.out.print("The percentage must add up to 100. Terminating program.");
                    return;
                } else {
                    // Computing the final marks based on the given weights
                    double overallScore = (examScore * examWeight / 100.0) + (labScore * labWeight / 100.0);

                    // Displaying the calculated final score
                    System.out.println();
                    System.out.print("Final Exam Mark is: " + overallScore);
                }
            }
        }
    }
}

