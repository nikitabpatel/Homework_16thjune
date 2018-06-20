
import java.util.Arrays;

public class Sort_numericandstring
{
        public static void main(String[] args)
        {

            int[] Array1 = {
                    17, 20, 18, 14, 22,
                    13, 24, 12, 10, 23,}; // integer array

            String[] Array2 = {
                    "Baroda",
                    "Ahmedabad",
                    "Surat",
                    "Nadiyad",
                    "Savali",
                    "Dakor" }; // string array

            // first lets put original array before sorted
            System.out.println("Original numeric array : "+Arrays.toString(Array1));
            Arrays.sort(Array1); // thats code to sort out the array
            System.out.println("Sorted numeric array : "+Arrays.toString(Array1));

            System.out.println(" "); // for creating line betwwen 2 arrays

            System.out.println("Original string array : "+Arrays.toString(Array2));
            Arrays.sort(Array2);
            System.out.println("Sorted string array : "+Arrays.toString(Array2));
        }
    }
