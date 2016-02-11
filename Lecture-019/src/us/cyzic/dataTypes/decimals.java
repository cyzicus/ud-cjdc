package us.cyzic.dataTypes;

/**
 * Created by jasoncmiller on 2/11/16.
 */
public class decimals {
    private static int myInt = 5;
    private static float myFloat = 5f;
    private static double myDouble1 = 5d; // Explicitly tells Java that variable is a double
    private static double myDouble2 = 5.4; // But, Java assumes that any decimal entered is a double

    public static void main(String[] args) {
        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble1 = " + myDouble1);
        System.out.println("myDouble2 = " + myDouble2);
    }
}
