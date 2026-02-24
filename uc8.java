import java.util.HashMap;
import java.util.Map;

public class uc8 {

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        displayBanner("OOPS", patternMap);
    }

    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();
        map.put('O', getOPattern());
        map.put('P', getPPattern());
        map.put('S', getSPattern());
        return map;
    }

    private static void displayBanner(String word, Map<Character, String[]> map) {
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = map.get(c);
                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("  ");
                }
            }
            System.out.println(lineBuilder.toString());
        }
    }

    private static String[] getOPattern() {
        return new String[]{
            "  *****  ", 
            " *     * ", 
            " *     * ", 
            " *     * ", 
            " *     * ", 
            " *     * ", 
            "  *****  "
        };
    }

    private static String[] getPPattern() {
        return new String[]{
            " *******  ", 
            " *      * ", 
            " *      * ", 
            " *******  ", 
            " *        ", 
            " *        ", 
            " *        "
        };
    }

    private static String[] getSPattern() {
        return new String[]{
            "  ****** ", 
            " *       ", 
            " *       ", 
            "  *****  ", 
            "       * ", 
            "       * ", 
            " ******  "
        };
    }
}