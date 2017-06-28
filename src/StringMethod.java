import java.util.Locale;

/**
 * Created by nicholasfonseca on 6/27/17.
 */
public class StringMethod {
    public static void main(String[] args){
        String str = "This is my string";

        String str1 = "Hello";
        String str2 = "Wrold";
        String str3 = "Monkey";
        String str4 = "";
        String str5 = "                  meeeee tooo             ";
        String str6 = "Hello";


        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.concat(" Goooooooooooooose!"));
        System.out.println(str.contains("is"));
        System.out.println(str.contains("si"));
        System.out.println(str.startsWith("this"));
        System.out.println(str.startsWith("is"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str.indexOf('h'));
        System.out.println(str.isEmpty());
        System.out.println(str4.isEmpty());
        System.out.println(str5.trim());

        System.out.println("Check Empty1: " + str.isEmpty());
        System.out.println("Check Empty2: " + str4.isEmpty());
        System.out.println("Trim leading and trailing space " + str5.trim());
        System.out.println("Replace: " + str6.replace('e', 'a'));

        System.out.println("SubString 1: " + str.substring(5));
        System.out.println("SubString 1: " + str.substring(5, 10));

        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
