import java.util.*;

class MovieReviewWordLengthProfiler
{
    void classifyWordLengths(String review)
    {
        String words[] = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];

            if(word.length() >= 1 && word.length() <= 4)
            {
                shortWords++;
            }
            else if(word.length() >= 5 && word.length() <= 8)
            {
                mediumWords++;
            }
            else
            {
                longWords++;
            }
        }

        System.out.println("Short: " + shortWords +
                           " | Medium: " + mediumWords +
                           " | Long: " + longWords);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        MovieReviewWordLengthProfiler obj = new MovieReviewWordLengthProfiler();

        obj.classifyWordLengths(review);
    }
}