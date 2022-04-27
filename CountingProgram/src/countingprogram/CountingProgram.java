/*
 * Stella Castura
 * 4/27/2022
 * CountingProgram.java
 * a program that lets the user count
 */
package countingprogram;
import java.util.Scanner;

/**
 *
 * @author stcas7054
 */
public class CountingProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        Scanner scan = new Scanner(System.in);
        //menu output
        System.out.println("Please enter your choice");
        System.out.println("1... Count from 0 to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... Count from 6000 to 1000 by 1000");
        //get choice
        int choice = scan.nextInt();
        //i like it as if statements more, it works fine without the error
        if (choice == 1)
        {
            System.out.println("-------------------------------------------");
            System.out.println("You have chosen to count from 0 to 10 by 1");
            //counts from 0 to 10 by 1
            for (int i = 0; i <= 10; i++)
            {
                System.out.println(i);
            }
            System.out.println("-------------------------------------------");
        }
        else if (choice == 2)
        {
            System.out.println("-------------------------------------------");
            System.out.println("You have chosen to count from 100 to 0 by 10");
            //counts from 100 to 0 by 10
            for (int i = 100; i >= 0; i -= 10)
            {
                System.out.println(i);
            }
            System.out.println("-------------------------------------------");
        }
        else if (choice == 3)
        {
            System.out.println("-------------------------------------------");
            //counts from 50 to 500 by 50
            System.out.println("You have chosen to count from 50 to 500 by 50");
            for (int i = 50; i <= 500; i += 50)
            {
                System.out.println(i);
            }
            System.out.println("-------------------------------------------");
        }
        else if (choice == 4)
        {
            System.out.println("-------------------------------------------");
            //counts from 6000 to 1000 by 1000
            System.out.println("You have chosen to count from 6000 to 1000 by 1000");
            for (int i = 6000; i >= 1000; i -= 1000)
            {
                System.out.println(i);
            }
            System.out.println("-------------------------------------------");
        }
        else 
        {
            System.out.println("Please restart the program and imput a number from 1-4");
        }
    }
    
}
