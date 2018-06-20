import java.util.Scanner;

public class Armstrongnumber
{
    public static void main(String[] args)
    {
        int i, j, k, total = 0;

        System.out.println("Enter any 3 digit number");

        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        j = i;

        for (; j != 0; j = 10) {
            k = j % 10;
            total = total + k * k * k;
                    break;}

            if (total == i)
                System.out.println(i + " ia armstrong number");
            else
                System.out.println(i + " is not armstrong number");
        }
    }