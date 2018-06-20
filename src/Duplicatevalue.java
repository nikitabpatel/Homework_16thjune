public class Duplicatevalue
{
        public static void main(String[] args)
        {
            int[] MyArray = {11, 12, 15, 15, 17, 17, 13, 12};

            for (int i = 0; i < MyArray.length-1; i++)
            {
                for (int j = i+1; j < MyArray.length; j++) // so when we add 1 in i of array 1 it will check numbers
                {
                    if ((MyArray[i] == MyArray[j]) && (i != j))
                    {
                        System.out.println("Duplicate Element : "+MyArray[j]);
                    }
                }
            }
        }
    }
