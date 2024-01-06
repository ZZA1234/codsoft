import java.util.*;
class NumberGame
{
    public static void main (String[] args)
    {
        System.out.println("******NUMBER GAME******");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int res = rd.nextInt(101); //Generates an integer between 1 and 100
        System.out.println("Guess the Number Generated. You have only 10 attempts to do so");
        int i=1;
        do
        {
            System.out.println("Enter a number between 1 and 100, Guess Number "+i);
            int guess1=sc.nextInt();
            if(guess1==res)
            {
                System.out.println("CONGRATULATIONS !! Your guess is correct.");
                System.out.println("You Win the Game :)");
                break;
            }
            if(guess1<res)
            {
                System.out.println("Your guess is lower than expected.");
            }
            if(guess1>res)
            {
                System.out.println("Your guess is higher than expected.");
            }
            i++;
            if(i>10)
            {
                System.out.println("Commiserations. Your chances are over. The correct answer was: "+res);
            }
        }while(i<=10);
    }
}