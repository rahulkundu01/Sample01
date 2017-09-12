package Multiple1;

/**
 * Created by rk on 7/8/2017.
 */
public class myClass {
    public static void main(String args[]){

        myNewClass onj1 = new myNewClass();
        onj1.displayMessage();

        print();
    }

    private static void print(){
        System.out.println("This is second method from private block");
    }
}
