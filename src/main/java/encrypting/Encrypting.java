package encrypting;

/**
 * Created by RENT on 2017-03-04.
 */
public class Encrypting {
    public static String caesar(String text, int offset) {

        if (text == null) {
            return null;
        }
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += offset;

        }


        return new String(chars);
    }

    public static String vigenere(String text, String password) {

        char[] textChars = text.toCharArray();
        char[] correctLengthPasswor = new char[textChars.length];
        char[] originalPassword = password.toCharArray();


        int passwordIndex = 0;
        for (int i = 0; i < correctLengthPasswor.length; i++) {
            if (passwordIndex >= originalPassword.length) {
                passwordIndex = 0;
            }

            correctLengthPasswor[i] = originalPassword[passwordIndex];
            passwordIndex++;

        }


        return new String(textChars);

    }

    public static char[][] generateVigenereArray() {
        char[][] array = new char[26][26];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (char) (97 + (j + i) % 26); // modulo jest dobre na zapetlanie

            }


        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(caesar("abc", -2));
        char[][] chars = generateVigenereArray();



    }
}

