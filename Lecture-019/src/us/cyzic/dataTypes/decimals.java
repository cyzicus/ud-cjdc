package us.cyzic.dataTypes;

/**
 * Created by jasoncmiller on 2/11/16.
 */
public class Decimals {
    private static int myInt = 5;
    private static float myFloat = 5f;
    private static double myDouble1 = 5d; // Explicitly tells Java that value is a double
    private static double myDouble2 = 5.4; // But, Java assumes that any decimal entered is a double

    public static void main(String[] args) {
        printDecimals();
        printDivisions();
    }

    private static void printDecimals() {
        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble1 = " + myDouble1);
        System.out.println("myDouble2 = " + myDouble2);
    }

    private static void printDivisions() {
        int myInt2 = 5/3;
        float myFloat2 = myFloat / 3;
        double myDouble3 = myDouble1 / 3;
        System.out.println("myInt2 = " + myInt2);
        System.out.println("myFloat2 = " + myFloat2);
        System.out.println("myDouble3 = " + myDouble3);
    }
}
