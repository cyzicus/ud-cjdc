package us.cyzic.dataTypes;

import java.util.ArrayList;
import java.util.List;

public class CharsAndStrings {

    private static char[] columns = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static String[] rowPrefixes = {"30", "31"};

    public static void main(String[] args) {
        printTable();
    }

    private static void printTable() {

        for(String rowPrefix : rowPrefixes) {
            for (char row : columns) {
                List<Character> charRow = new ArrayList<>();
                for (char column : columns) {
                    int hexVal = Integer.parseInt(rowPrefix + row + column, 16);
                    charRow.add((char) hexVal);
                }
                System.out.println(charRow);
            }
        }
    }
}
