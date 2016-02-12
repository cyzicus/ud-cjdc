package us.cyzic.dataTypes;

import java.util.ArrayList;
import java.util.List;

public class CharsAndStrings {

    private static char[] columns = {'0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static String[] rows = {"2F0", "2F1", "2F2", "2F3",
            "2F4", "2F5", "2F6", "2F7", "2F8", "2F9", "2FA", "2FB"};

    public static void main(String[] args) {
        printTable();
    }

    private static void printTable() {
        for(String row : rows) {
            List<Character> charRow = new ArrayList<>();
            for(char column: columns) {
                int hexVal = Integer.parseInt(row + column, 16);
                charRow.add((char)hexVal);
            }
            System.out.println(charRow);
        }
    }
}
