import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter Mathematics marks: ");
        double math = input.nextDouble();

        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();

        System.out.print("Enter FOP marks: ");
        double fop = input.nextDouble();

        System.out.print("Enter Java marks: ");
        double java = input.nextDouble();

        System.out.print("Enter DSA marks: ");
        double dsa = input.nextDouble();

        studentInfo student = new studentInfo(
                name,
                math,
                physics,
                fop,
                java,
                dsa
        );

        System.out.println("\n----- STUDENT RESULT -----");

        student.displayResult();

        input.close();
    }
}