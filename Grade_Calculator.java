import java.util.Scanner;

public class Grade_Calculator {

    public static void main(String[] args)
    {
        int sum = 0;
        // String grade;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No. Of Subjects : ");
        int subjects = sc.nextInt();

        try
        {
            // float average_percentage = sum / subjects;
            // System.out.println("Average Percentage is : " +average_percentage);
        }

        catch (ArithmeticException e)
        {
            System.out.println("The Value of Subjects Can not be Zero.");
            System.out.println("So that Sum Can not Divided By Zero");
        }

        int [] marks = new int [subjects];

        for (int i = 0 ; i<subjects ; i++) {
            System.out.print("Enter Marks For " + (i+1) + " Subjects : " );
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        float average_percentage =  sum / subjects;

        System.out.println("Total Marks of student : " +sum);
        System.out.println("Average Percentage is : " +average_percentage + " %");

        if(average_percentage >= 85)
        {
            System.out.println("Grade is A");
        }

        else  if(average_percentage >= 75 && average_percentage <90)
        {
            System.out.println("Grade is B");
        }

        else if (average_percentage >= 60 && average_percentage <75)
        {
            System.out.println("Grade is C");
        }

        else if (average_percentage >= 45 && average_percentage<60)
        {
            System.out.println("Grade is D");
        }

        else
        {
            System.out.println("Fail");
        }
    }
}