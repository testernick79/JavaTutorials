/**
 * Created by nicholasfonseca on 7/6/17.
 */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 10;

        /*while (i < 20){
            if (i == 17){
                continue;
            }
            System.out.print(i);
            i++;
        }
        System.out.println("Outside of Loop");*/

        do {
            System.out.println(i);
            i++;


        } while (i < 200000);

    }
}
