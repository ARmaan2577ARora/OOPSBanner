import java.util.HashMap;

public class OOPSBanner5 {
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> map = new HashMap<>();
        map.put('O', new String[] {
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
        map.put('P', new String[] {
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
        map.put('S', new String[] {
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
        return map;
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charmap){
        int patternheight = charmap.get('O').length;
        for (int row = 0; row < patternheight; row++) {
            for (char ch : message.toUpperCase().toCharArray()) {
                String[] pattern = charmap.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HashMap<Character, String[]> charmap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charmap);
    }
}
