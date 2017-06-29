import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by nicholasfonseca on 6/27/17.
 */
public class ClassesMethods {
    public static void main(String[] args) {
        String str1 = "Hello Shithead!";

        System.out.println(str1);

        //for (int i=0; i > args.length; i++){
            //System.out.println(args[i]);

            System.out.println("--------------------GOAT OBJECT---------------------------------------");

// 3 create Object
            Goat g1 = new Goat();
            Goat g2 = new Goat();

// 4 create Object attributes
            g1.age = 30;
            g1.alive = true;
            g1.goatname = "Rick James";
            g1.horns = false;

// 5 print Object's age
            System.out.println(g1.age);
            System.out.println(g1.getAge());
        }

    }
//}
// 1 create class for Object
class Goat{
    // 2 create unique attributes
    int age;
    String goatname;
    boolean alive;
    boolean horns;

    // 6 make Object accessable outside of goat class
    public int getAge() {
        // 7 return Object age value
        return age;
    }
}
