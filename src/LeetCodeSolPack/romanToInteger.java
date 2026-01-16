package LeetCodeSolPack;

import java.util.HashMap;

public class romanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int previousValue = 0;

        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentval = mp.get(currentChar);
            if (currentval >= previousValue) {
                result = result + currentval;
            } else {
                result = result - currentval;
            }
            previousValue = currentval;

        }
        return result;
    }

    public static void main(String[] args) {
        romanToInteger rti = new romanToInteger();
        int val = rti.romanToInt("XV");
        System.out.println(val);
    }
}
