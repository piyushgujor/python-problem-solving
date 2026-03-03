import java.util.*;

public class BannerAppUC8 {

    // Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    // Load patterns into map
    public static void loadPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Render function
    public static void renderBanner(String word) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = Character.toUpperCase(word.charAt(i));

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        loadPatterns();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String input = sc.nextLine();

        renderBanner(input);
    }
}