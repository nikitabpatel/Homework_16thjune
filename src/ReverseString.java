public class ReverseString
{
    public static void main(String[] args)
    {
        String input = "Abcdefg";

        StringBuilder input1 = new StringBuilder();

        input1.append(input); // append usually use with stringbuilder. its keyword

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}

