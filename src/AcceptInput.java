/**
 * Created by rk on 6/7/2017.
 * Accepting Input from User using Scanner class
 */

import java.util.Scanner;                                // importing Scanner class from java.util package.

public class AcceptInput {                              // declaring a class

    public static void main(String args[]){              // main method

    Scanner sc = new Scanner(System.in);                // Creating object for scanner class.

    int x; //declaring a variable
        System.out.println("Enter value of x:");       //simple sentence print.
        x=sc.nextInt();                               // assigning value to x

        System.out.println("Value of x is: "+x);    //printing the value of x

    }
}
