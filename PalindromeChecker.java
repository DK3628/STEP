import java.util.*;

class PalindromeChecker
{
    boolean isPalindromeIterative(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        while(start < end)
        {
            if(text.charAt(start) != text.charAt(end))
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    boolean isPalindromeRecursive(String text)
    {
        if(text.length() <= 1)
        {
            return true;
        }

        if(text.charAt(0) != text.charAt(text.length() - 1))
        {
            return false;
        }

        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    boolean isPalindromeArrayReversal(String text)
    {
        char arr[] = text.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String reversed = new String(arr);

        return text.equals(reversed);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        PalindromeChecker obj = new PalindromeChecker();

        boolean iterative = obj.isPalindromeIterative(text);
        boolean recursive = obj.isPalindromeRecursive(text);
        boolean arrayReversal = obj.isPalindromeArrayReversal(text);

        System.out.println("Iterative: " +
                           (iterative ? "Palindrome" : "Not Palindrome") +
                           " | Recursive: " +
                           (recursive ? "Palindrome" : "Not Palindrome") +
                           " | Array Reversal: " +
                           (arrayReversal ? "Palindrome" : "Not Palindrome"));
    }
}