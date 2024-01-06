import java.util.*;

public class StudentCalculator
{
    public static void main(String[]args)
    {
        System.out.println("******STUDENT GRADE CALCULATOR******");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Subjects :");
        int subjects = sc.nextInt();
        int total_marks=0;

        for(int i=1;i<=subjects;i++)
        {
            System.out.println("Enter the Marks for Subject "+i);
            int marks = sc.nextInt();
            total_marks=total_marks+marks;
        }

        double percentage=total_marks/subjects;
        System.out.println("******\nYour Result is as Follows******");
        System.out.println("The Total Marks obtained is: "+total_marks);
        System.out.println("The Average Percentage is: "+percentage+"%");
        System.out.println("\nYour Grade is:");
        if(percentage>80)
        {
            System.out.println("Grade O: Outstanding");
        }
        else if(percentage>=70 && percentage<80)
        {
            System.out.println("Grade A+: Excellent");
        }
        else if(percentage>=60 && percentage<70)
        {
            System.out.println("Grade A: Very Good");
        }
        else if(percentage>=55 && percentage<60)
        {
            System.out.println("Grade B+: Good");
        }
        else if(percentage>=50 && percentage<55)
        {
            System.out.println("Grade B: Above Average");
        }
        else if(percentage>=45 && percentage<50)
        {
            System.out.println("Grade C: Average");
        }
        else if(percentage>=40 && percentage<45)
        {
            System.out.println("Grade P: Pass");
        }
        else if(percentage>=0 && percentage<40)
        {
            System.out.println("Grade F: Fail");
        }
    }
}
