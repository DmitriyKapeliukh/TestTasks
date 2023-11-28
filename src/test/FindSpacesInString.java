package test;

public class FindSpacesInString {

    public static int spaceCount(String value) {
        return value.split(" ").length - 1;
    }

    public static int spaceCountWithoutSplit(String value) {
        int count = 0;
        if (value != null) {
            for (int i = 0; i < value.length(); i++) {

                if (value.charAt(i) == ' ') {
                    count++;
                }

            }
        }
        return count;
    }

    public static int containsWithCharacter(final String value){
        int count = 0;
        if(value != null){
            for(int i = 0; i < value.length(); i++){
                if(Character.isWhitespace(value.charAt(i))){
                    count++;
                }
            }
        }
        return count;
    }
}
