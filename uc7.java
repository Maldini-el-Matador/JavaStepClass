public class uc7 {

    public static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }

        public String[] getPattern() { return pattern; }
    }

    public static void main(String[] args) {
        CharacterPatternMap oMap = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap pMap = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap sMap = new CharacterPatternMap('S', getSPattern());

        CharacterPatternMap[] word = { oMap, oMap, pMap, sMap };

        displayBanner(word);
    }

    private static void displayBanner(CharacterPatternMap[] word) {
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap charObj : word) {
                lineBuilder.append(charObj.getPattern()[i]).append("  ");
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