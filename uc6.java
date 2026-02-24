public class uc6 {

    public static void main(String[] args) {
        // UC6: Array Initialization via Methods
        // We call the helper methods directly within the array declaration.
        String[] bannerLines = {
            getLine(0),
            getLine(1),
            getLine(2),
            getLine(3),
            getLine(4),
            getLine(5),
            getLine(6)
        };

        // Loop-Based Rendering (Enhanced for-loop)
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Helper method to assemble a specific line index for the full "OOPS" word.
     * This abstracts the concatenation of O, O, P, and S.
     */
    private static String getLine(int index) {
        return getOPattern()[index] + "  " + 
               getOPattern()[index] + "  " + 
               getPPattern()[index] + "  " + 
               getSPattern()[index];
    }

    // --- Helper Methods for Character Patterns ---

    private static String[] getOPattern() {
        return new String[] {
            "   *****   ",
            "  *     *  ",
            "  *     *  ",
            "  *     *  ",
            "  *     *  ",
            "  *     *  ",
            "   *****   "
        };
    }

    private static String[] getPPattern() {
        return new String[] {
            "  *******  ",
            "  *      * ",
            "  *      * ",
            "  *******  ",
            "  *        ",
            "  *        ",
            "  *        "
        };
    }

    private static String[] getSPattern() {
        return new String[] {
            "    ******  ",
            "   *        ",
            "   *        ",
            "    *****   ",
            "         *  ",
            "         *  ",
            "   ******   "
        };
    }
}