public class Specificvalue
{
    public static void main(String[] args)
    {
        int[] i = {1, 2, 3, 4, 5};
        int find = 3;
        boolean found = false; // boolean to find out is it true or false

        for (int n : i) // for-each loop for array
        {
            if (n == find)
            {
                found = true; // so if selected number is in array it will execute this
                break;
            }
        }

        if (found) // so if found = true excute this code
            System.out.println(find + " is found.");
        else // and if not than jvm will run this code
            System.out.println(find + " is not found.");
    }
}
