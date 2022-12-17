package string;

class string {
    public static String[] ascii_lowercase() {
        String[] ascii_lowercase = new String[26];

        for (int i = 0, c = 'a'; i < 26; i++) {
            ascii_lowercase[i] = String.valueOf((char) c++);
        }

        return  ascii_lowercase;
    }


    public static String[] ascii_uppercase() {
        String[] ascii_uppercase = new String[26];
        String[] ascii_lowercase = ascii_lowercase();

        for (int i = 0; i < ascii_uppercase.length; i++) {
            ascii_uppercase[i] = ascii_lowercase[i].toUpperCase();
        }

        return ascii_uppercase;
    }


    public static String[] ascii_letters() {
        String[] ascii_letters = new String[52];

        System.arraycopy(ascii_lowercase(), 0, ascii_letters, 0, 26);
        System.arraycopy(ascii_uppercase(), 0, ascii_letters, 26, 26);

        return  ascii_letters;
    }


    public static String[] digits() {
        String[] digits = new String[10];

        for (int i = 0; i < 10; i++) {
            digits[i] = String.valueOf(i);
        }

        return  digits;
    }


    public static String[] hexdigits() {
        String[] hex_ascii_lowercase = new String[6];
        String[] hex_ascii_uppercase = new String[6];
        String[] hexdigits = new String[digits().length + hex_ascii_uppercase.length + hex_ascii_lowercase.length];

        for (int i = 0; i < 6; i++) {
            hex_ascii_lowercase[i] = ascii_lowercase()[i];
            hex_ascii_uppercase[i] = ascii_uppercase()[i];
        }

        System.arraycopy(digits(), 0, hexdigits, 0, 10);
        System.arraycopy(hex_ascii_lowercase, 0, hexdigits, 10, 6);
        System.arraycopy(hex_ascii_uppercase, 0, hexdigits, 16, 6);

        return  hexdigits;
    }


    public static String[] octdigits() {
        String[] octdigits = new String[8];

        for (int i = 0; i < 8; i++) {
            octdigits[i] = digits()[i];
        }

        return  octdigits;
    }


    public static String[] printable() {
        String[] digits = digits();
        String[] ascii_letters = ascii_letters();
        String[] printable = new String[digits.length + ascii_letters.length];

        System.arraycopy(digits, 0, printable, 0, digits.length);
        System.arraycopy(ascii_letters, 0, printable, digits.length, ascii_letters.length);

        return  printable;
    }


    public static String[] punctuation() {
        String s = "!\"#$%&\\'()*+,-./:;<=>?@[\\\\]^_`{|}~";

        return s.split("");
    }


    public static String[] whitespace() {
        String[] whitespace = {" ", "\t", "\n", "\r", "\\x0b", "\\x0c"};

        return whitespace;
    }


    public static String[][] __all__() {
        String[][] all = {ascii_letters(), ascii_lowercase(), ascii_uppercase(), digits(), hexdigits(), octdigits(), printable(), punctuation(), whitespace()};

        return all;
    }
}