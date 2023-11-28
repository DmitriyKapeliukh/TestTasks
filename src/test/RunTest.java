package test;

import java.util.Map;

public class RunTest {

    public static void main(String[] args) {
        String testString = "Hi my name is Dmytro";

        int count = FindSpacesInString.spaceCountWithoutSplit(testString);
        System.out.println(count);
    }
}
