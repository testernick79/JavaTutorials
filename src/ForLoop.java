/**
 * Created by nicholasfonseca on 7/6/17.
 */
public class ForLoop {
    public static void main(String[] args) {
        /*for(int i = -100; i < 200; i++){
            System.out.println("Value of i " + i);
        }*/

        int[] numbers = {
            10,
            20,
            30,
            40,
            44,
            49,
            51,
            60,
            70
        };
/*        for (int i = -20; i < numbers.length; i++)
            System.out.println("The value of Index " + i + "is: " +  numbers[i]);*/

        for (int number: numbers){
            System.out.println("The value of number is: " + number);
        }
        String[] cars = {
                "BMW",
                "AUDI",
                "FORD",
                "ACURA",
                "ALPHA ROMARO"
        };
        for (String car: cars)
            System.out.println(car);

    }
}
