// nim.java
//
// This program simulates the game of nim.

import java.util.*;

public class nim
{
    public int getCompMove (int maxChips)
    {
        return (int)(Math.random()*3)+1;
    }

    public void play()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n\t\t\t\t-- Welcome to the game of Nim! --");
        System.out.print("Enter number of elements to start: ");
        int maxChips = scan.nextInt();

        while (maxChips > 0)
        {
            int compTurn = getCompMove(maxChips);

            System.out.println("Computers turn..");
            System.out.println("The computer takes: " + compTurn);
            maxChips -= compTurn;

            if (maxChips < 0)
            {
                maxChips = 0;
            }

            System.out.println("\nThere are " + maxChips + " chips left.\n");
            
            if (maxChips <= 0)
            {
                System.out.println("\n -- Computer wins! Im sorry you lose. --\n");
                return;
            }

            System.out.println("Players turn..");
            System.out.print("Enter how many you would like to take (1 - 3): ");
            int player = scan.nextInt();

            while (player!= 1 && player != 2 && player != 3)
            {
                System.out.println("Please choose another number 1 - 3");
                player = scan.nextInt();
            }

            maxChips -= player;

            if (maxChips < 0)
            {
                maxChips = 0;
            }

            System.out.println("\nThere are " + maxChips + " chips left.\n");

            if (maxChips <= 0)
            {
                System.out.println("\n-- You win! Congratulations! --\n");
                return;
            }

        }
    }

    public static void main(String[] args)
    {
        nim game = new nim();
        game.play();
    }
}


