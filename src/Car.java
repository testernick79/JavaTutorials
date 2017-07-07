/**
 * Created by nicholasfonseca on 7/3/17.
 */
public class Car {
    private String make;
    int speed;
    int gear;
    boolean gasoline;

    public Car(){
        this(10, 2);
        this.speed = 0;
        this.gear = 1;
        this.gasoline = true;
        System.out.println("This is a empty constructor without Arguments");

    }
    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("This is a constructor with Arguments");
    }

    // "this" refers to the instance of the class (Object)
    public  void setMake(String make){
        this.make = make;

    }
    public String getMake(){
        return make;
    }
}
