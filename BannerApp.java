import java.util.*;

public class BannerApp {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private List<String> pattern;

        public CharacterPatternMap(char character, List<String> pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public List<String> getPattern() {
            return pattern;
        }
    }

    // ✅ DECLARE THIS FIRST
    private static Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

    // ✅ THEN STATIC BLOCK
    static {
        patternMap.put('O', new CharacterPatternMap('O', Arrays.asList(
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        )));

        patternMap.put('P', new CharacterPatternMap('P', Arrays.asList(
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        )));

        patternMap.put('S', new CharacterPatternMap('S', Arrays.asList(
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        )));
    }

    public static void printBanner(String text) {
        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : text.toCharArray()) {
                CharacterPatternMap cp = patternMap.get(ch);

                if (cp != null) {
                    sb.append(cp.getPattern().get(row)).append("  ");
                }
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}