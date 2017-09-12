package ConditionalStatement;

import java.util.Scanner;

/**
 * Created by rk on 7/16/2017.
 */
public class Age_nestedif {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age :");
        age = sc.nextInt();

        if (age >= 60) {
            if(age >= 70){
                System.out.println("you are too old");
            }
            else{
                System.out.println("you are old");
            }
        }
    }
}
