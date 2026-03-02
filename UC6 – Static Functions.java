import java.util.*;

class BannerApp {

    // Static helper for O
    public static List<String> getO() {
        return Arrays.asList(
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        );
    }

    // Static helper for P
    public static List<String> getP() {
        return Arrays.asList(
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        );
    }

    // Static helper for S
    public static List<String> getS() {
        return Arrays.asList(
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        );
    }

    public static void main(String[] args) {

        // Get character patterns using static methods
        List<String> O = getO();
        List<String> P = getP();
        List<String> S = getS();

        // Loop-based rendering
        for (int i = 0; i < O.size(); i++) {
            System.out.println(O.get(i) + "   "
                    + P.get(i) + "   "
                    + S.get(i));
        }
    }
}
