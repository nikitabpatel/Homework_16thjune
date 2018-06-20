import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class commonin2strings
{
        public static void main(String[] args)
        {
            String [] array1 = {"Sunday", "Monday", "Tuesday", "Wednesday" , "Thursday"};
            String [] array2 = {"Wednesday", "Thursday", "Friday", "Saturday"};

            HashSet<String> set = new HashSet<String>(); //using Hashset string

            System.out.println("Array1 : "+Arrays.toString(array1));
            System.out.println("Array2 : "+Arrays.toString(array2));


            for (int i = 0; i < array1.length; i++)
            {
                for (int j = 0; j < array2.length; j++)
                {
                    if(array1[i] == (array2[j]))
                    {
                        set.add(array1[i]);
                    }
                }
            }
            System.out.println("Common element is : "+(set));
        }
    }
