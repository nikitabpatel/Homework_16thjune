import java.util.Scanner;

public class Sumofeachdigit
{
        public static void main(String args[])
        {
            int i, j, sum = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter any number to calculate sum of all numbers: ");
            i= scan.nextInt();

            // using module and division for sum calculation
            while(i > 0) // so i always be in positive number
            {
                j = i % 10; // first last digit will get seprate with module
                i = i / 10; // again dividing to get another numbers seprate
                sum = sum + j;
            }
            System.out.println("Total Sum of Digits: "+sum);
        }
    }
