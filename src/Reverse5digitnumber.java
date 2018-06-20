import java.util.Scanner;

public class Reverse5digitnumber
{
    public static void main(String args[])
    {
        int i= 0;
        int j =0;

        System.out.println("Input any number to see reverse number of that: ");

        Scanner in = new Scanner(System.in);
        i = in.nextInt();

        //While Loop method to find out the reverse number
        while( i != 0 )
        {
            j = j* 10;
            j = j + i % 10; //switch method
            i = i/10;
        }

        System.out.println("Reverse of input number is: "+j);
    }
}
