package test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class UniqueChar {
    public static Map<Character, Integer> getMapOfRepeatedChars(final String value) {
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
