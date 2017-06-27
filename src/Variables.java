public class Variables {
    int myGlobalInt = 1000;

    public static void main(String[] args){



        byte myByte = 100;
        System.out.println("byte Value: " +myByte);

        short myShort = 10000;
        System.out.println("Short Value: "+myShort);

        int Myint = 10000000;
        System.out.println("int Value: "+Myint);

        long myLong = 100000;
        System.out.println("long Value: "+myLong);

        float myFloat = 20.0f;
        System.out.println("float Value: " + myFloat);

        double myDouble = 21.0;
        System.out.println("double Value: " + myDouble);

        boolean myBoolean = true;
        System.out.println("boolean Value: " + myBoolean);

        char myChar = 'a';
        System.out.println("char Value: " +myChar);




    }
    public void test(){
        myGlobalInt = 1000;
        System.out.println("global Int Valur: " + myGlobalInt);

    }
}
