package ConditionalStatement;

import java.util.Scanner;

/**
 * Created by rk on 7/16/2017.
 */
public class Age_elseif {

    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age :");
        age = sc.nextInt();

        if(age >= 60){
            System.out.println("you are in your 60's");
        }
        else if(age >= 50){
            System.out.println("you are in your 50's");
        }
        else if(age >= 40) {
            System.out.println("you are in your 40's");
        }
            else {
                System.out.println("your age is below 40");
            }
        }
    }

