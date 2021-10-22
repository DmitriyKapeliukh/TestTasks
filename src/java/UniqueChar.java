package java;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {

    public static void main(String[] args) {
        String a = "QualityAssuranceIsQuiteCool";

        System.out.println(unique(a));
    }

    private static Map<Character, Integer> unique(final String value) {
        Map<Character, Integer> valueMap = new HashMap<>();
        char[] a = value.toCharArray();
        for (char c : a) {
            int count = 0;
            for (char b : a) {
                if (b == c) {
                    count++;
                    valueMap.put(b, count);
                }
            }
        }
        return valueMap;
    }
}
