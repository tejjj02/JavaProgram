import java.util.Scanner;

public class gradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of subjects: ");
        int numSubject; 
        numSubject= sc.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numSubject; i++) {
            System.out.println("Enter marks obtained in subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / numSubject;
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade you got: " + grade);
    }
}

