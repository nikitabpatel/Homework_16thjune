import java.util.Scanner;

public class Firstandlastnumber
{
    public static void main(String[] args)
    {
                int i, j, a = 0, k, l, m;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a Number :");
                j = sc.nextInt();

                l = j % 10;

                while (j > 0)  // so it will be always positive number
                {
                    i = j % 10;
                    a = a * 10 + i;
                    j = j / 10;
                }

                k = a % 10;
                m = k + l;

                System.out.println("\nThe Sum of First and Last Digit is :" + m);
            }
        }