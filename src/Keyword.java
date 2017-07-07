/**
 * Created by nicholasfonseca on 7/3/17.
 */
public class Keyword {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        c1.setMake("Audi");
        System.out.println(c1.getMake());
        c2.setMake("VW");
        System.out.println(c2.getMake());

    }
}
