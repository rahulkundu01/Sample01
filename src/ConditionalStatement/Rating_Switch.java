package ConditionalStatement;

import java.util.Scanner;

/**
 * Created by rk on 7/16/2017.
 */
public class Rating_Switch {
    public static void main(String args[]){

          int rating;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Rating from 1 - 5: ");
        rating = sc.nextInt();

        switch (rating){
            case 1: System.out.println("Poor");
            break;
            case 2: System.out.println("Average");
                break;
            case 3: System.out.println("Good");
                break;
            case 4: System.out.println("Very Good");
                break;
            case 5: System.out.println("Excellent");
                break;

        }
    }
}
