public class uc6 {

    public static void main(String[] args) {

        String[] bannerLines = {
            getLine(0),
            getLine(1),
            getLine(2),
            getLine(3),
            getLine(4),
            getLine(5),
            getLine(6)
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }


    private static String getLine(int index) {
        return getOPattern()[index] + "  " + 
               getOPattern()[index] + "  " + 
               getPPattern()[index] + "  " + 
               getSPattern()[index];
    }



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