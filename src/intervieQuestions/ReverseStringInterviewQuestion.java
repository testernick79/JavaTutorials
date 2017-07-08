package intervieQuestions;

/**
 * Created by nicholasfonseca on 7/6/17.
 */
public class ReverseStringInterviewQuestion {
    public static void main(String[] args) {
        String input = "";//"This is a String";
        String output = reverse(input);
        System.out.println(output);

    }

    private static String reverse(String input) {
        String reverse = "";

        if (input.isEmpty() || input == null)
            System.out.println("Empty or Null Values, Please try again");

        if (input.length() <= 1) {
            reverse = input;
        } else {
            String[] originalArray = input.split("\\s+");

            for (String item : originalArray)//This, is, a, string
                reverse = item + " " + reverse;// This + "", is + this, a + is this, test + a is this, String + test a is this
        }

        return reverse.trim();
    }
}
