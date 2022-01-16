package pa.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class UniqueChar {

    public static void main(String[] args) {
        String a = "QualityAssuranceIsQuiteCool";

        String b = "adda";

        boolean pal = isPalindromeUsingIntStream(a);
        System.out.println(pal);
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

    public static boolean isPalindromeUsingIntStream(String text) {
        String temp = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
    }

    public boolean isPalindromeUsingStringBuilder(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
}
