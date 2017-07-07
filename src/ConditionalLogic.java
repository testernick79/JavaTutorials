/**
 * Created by nicholasfonseca on 7/3/17.
 */
public class ConditionalLogic {
    public static void main(String[] args) {

        int Score = 81;
        String Grade;

        if (Score > 90){
            Grade = "A";
        }
        else if(Score > 80){
            Grade = "B";
        }
        else {
            Grade = "C";
        }
        System.out.println("Score is: " + Score);
        System.out.println("Grade is: " + Grade);
    }
}
