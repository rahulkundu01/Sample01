package ConditionalStatement;

import java.util.Scanner;

/**
 * Created by rk on 7/16/2017.
 */
public class MultipleSubjects_logicaloperator {
    public static void main(String args[]){
        int phy,chem,maths;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Enter marks obtain in Physics: ");
        phy=sc1.nextInt();
        System.out.print("Enter marks obtain in Chemistry: ");
        chem=sc2.nextInt();
        System.out.print("Enter marks obtain in Maths: ");
        maths=sc3.nextInt();

        if (phy>=40 && chem >= 40 && maths >=40){
            System.out.println("Result : Pass");
        }
        else{
            System.out.println("Result : Fail");
        }

        int Total = 0;

        Total = phy + chem + maths;
        System.out.println("Total Marks Obtain : " +Total);

        double per;
        per = Total/300;
        System.out.println("Percentage Obtain : " +per);

        if(Total >= 150){
            System.out.println("You have obtain "+Total+" in PCM, hence you are eligible to take admission in Engineering");
        }
        else {
            System.out.println("You have obtain "+Total+" in PCM, hence you are not eligible to take admission in Engineering");
        }


    }
}
