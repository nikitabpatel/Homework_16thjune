import java.util.Scanner;

public class Insertelement
{
        public static void main(String[] args)
        {
            int n, position, x;

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter how many elements do you want in array :");
            n = scan.nextInt();

            int a[] = new int[n+1];

            System.out.println("Enter all the elements below :");

            for(int i = 0; i < n; i++)
            {
                a[i] = scan.nextInt();
            }

            System.out.println("Enter the position where do you want to insert an element :");
            position = scan.nextInt();

            System.out.println("Enter the element number which you want to insert:");
            x = scan.nextInt();

            for(int i = (n-1); i >= (position-1); i--)// to adjust position for element
            {
                a[i+1] = a[i];
            }
            a[position-1] = x;

            System.out.println("your insertion is ready to view:");
            for(int i = 0; i < n; i++)
            {
                System.out.print(a[i]+",");
            }
            System.out.print(a[n]);
        }
    }
