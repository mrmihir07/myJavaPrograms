import java.util.Scanner;
import java.util.Random;
public class RPCGame
{
    public static void main(String args[])
    {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------*WELCOME TO ROCK PAPER SCISSOR GAME*----------------------------------------------");
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor : ");
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(userInput==computerInput)
        {
            System.out.println("Draw!");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1)
        {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("You Loose!");
            System.out.println("Try next time!");
        }
        if(computerInput==0)
        {
            System.out.println("Computer Choice : Rock");
        }
        else if(computerInput==1)
        {
            System.out.println("Computer choice : paper");
        }
        else if(computerInput==2)
        {
            System.out.println("Computer Choice : Scissor");
        }
    }
}
