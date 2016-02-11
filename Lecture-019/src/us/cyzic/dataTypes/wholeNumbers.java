package us.cyzic.dataTypes;

public class wholeNumbers {

    public static void main(String[] args) {
        // Integers
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        System.out.println("minInt = " + minInt);
        System.out.println("maxInt = " + maxInt);

        // Bytes
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println("minByte = " + minByte);
        System.out.println("maxByte = " + maxByte);

        // Shorts
        short minShort = -32_768;
        short maxShort = 32_767;
        System.out.println("minShort = " + minShort);
        System.out.println("maxShort = " + maxShort);

        // Longs
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);
    }
}
