/**
 * Created by nicholasfonseca on 7/3/17.
 */
public class constructors {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setMake("BMW");
        System.out.println(c1.getMake());

        System.out.println(c1.speed);
        System.out.println("Car takes gasoline " + " = " + c1.gasoline);
        System.out.println(c1.gear);

        System.out.println("-----------------------");

        Car c2 = new Car(10, 3);
        System.out.println(c2.speed);
        System.out.println(c2.gear);

    }
}
