/**
 * Created by rk on 7/22/2017.
 * program to swap the number between two variables
 */
public class Swap {

    public static void main(String args[]) {
        int a, b, c;

        a = 10;
        b = 20;

        System.out.println("Before Swapping");
        System.out.println("Value of a & b: "+a+ "&" +b);
        c = a;
        a = b;
        b = c;

        System.out.println("After Swapping");
        System.out.println("Value of a & b: "+a+ "&" +b);


    }
}
