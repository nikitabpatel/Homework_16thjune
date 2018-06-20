import java.util.Scanner;

public class Palindromenumber
{
    public static void main(String args[])
    {
        int i,j,k;

        Scanner scan=new Scanner(System.in);

        //input any integer number
        System.out.println("Enter any Number: ");
        i= scan.nextInt();

        //find reverse number. palindrome number should be same when we reverse it.
        j=i;
        k=0;
        while(j>0)
        {
            k = (k*10) + (j%10); // calculation to find out reverse number
            j/=10;
        }

        //to check entered number with reversed number
        if(i==k)
            System.out.println(i + " is a Palindrome Number.");
        else
            System.out.println(i+ " is not a Palindrome Number.");
    }
}
