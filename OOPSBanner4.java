public class OOPSBanner4 {
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap o =new CharacterPatternMap('O',new String[] {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });
        CharacterPatternMap p = new CharacterPatternMap('P', new String[] {
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       ",
        });
        CharacterPatternMap s = new CharacterPatternMap('S', new String[] {
            "   *****   ",
            " **        ",
            "**         ",
            " **        ",
            "   *****   ",
            "        ** ",
            "         **",
            "        ** ",
            "   *****   "
        });
        return new CharacterPatternMap[] {o,p,s};
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charmaps) {
        for (CharacterPatternMap charmap : charmaps) {
            if (ch == charmap.getCharacter()) {
                return charmap.getPattern();
            }
        }
        return new String[]{};
    }
    public static void printMessage(String message, CharacterPatternMap[] charmaps) {
        int height = charmaps[0].getPattern().length;
        for (int row = 0; row < height; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charmaps);
                if (pattern.length > 0) {
                    System.out.print(pattern[row] + "  ");
            }
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charmaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charmaps);
    }
}
