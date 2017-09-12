/**
 * Created by rk on 6/8/2017.
 */

import  java.util.Scanner;
public class UserName {
    public static void main(String args[]){

        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you name:");
        name = sc.next();

        System.out.println("Hello "+name+", nice to meet you");
    }
}
