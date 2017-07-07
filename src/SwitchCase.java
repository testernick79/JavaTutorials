/**
 * Created by nicholasfonseca on 7/5/17.
 */
public class SwitchCase {
    public static void main(String[] args) {

        int numOfDays = numDays(2020, 6);
        System.out.println("number of days in month: " + numOfDays);
    }
        static int numDays(int year, int month){
        int numDays = 0;

        switch (month){
            case 1:
                numDays = 31;
                break;

            case 2:
                if (year % 400 == 0){
                    numDays = 29;
                }
                else {
                    numDays = 28;
                }
                break;
            case 3:
                numDays = 31;
                break;
            case 4:
                numDays = 30;
                break;
            case 5:
                numDays = 30;
                break;
            case 6:
                numDays = 31;
                break;
            case 7:
                numDays = 30;
                break;
            case 8:
                numDays = 31;
                break;
            case 9:
                numDays = 31;
                break;
            case 10:
                numDays = 30;
                break;
            case 11:
                numDays = 30;
                break;
            case 12:
                numDays = 30;
                break;
            default:
                System.out.println("Invalid Request, Please Try Again");
        }


        return numDays;
    }
}
