package tg.lt.utilities.classes;
import java.security.SecureRandom;
import java.util.Random;

public class RandomString {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final String _CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int STRING_LENGTH = 10;

    public static String generateRandomString(int length) {
        Random random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }

        return sb.toString().toUpperCase();
    }

}
