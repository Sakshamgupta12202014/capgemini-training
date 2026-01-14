import java.util.Scanner;

public class ExamResultAnalyzer
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks is maths: ");
        float math_marks = sc.nextDouble();

        System.out.print("Marks is physics: ");
        float physics_marks = sc.nextDouble();
        
        System.out.print("Marks is chemistry: ");
        float chemistry_marks = sc.nextDouble();

        String result = checkEligibility(math_marks, physics_marks, chemistry_marks);
        System.out.println(result);
    }

    static String checkEligibility(float marksInMath, float marksInPhysics, float marksInChemistry) {
        if(marksInMath >= 60.0 && marksInPhysics >= 60.5 || marksInChemistry >= 61.4 ) {
            System.out.println("The Student is eligible for Placement training");
        }
        else{
            System.out.println("Sorry!, the student is not eligible for the training ");
        }
    }
}