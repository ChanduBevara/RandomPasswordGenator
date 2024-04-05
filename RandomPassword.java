import java.security.SecureRandom;

public class RandomPasswordCreator {

    // Define characters for password generation
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";

    public static void main(String[] args) {
        int passwordLength = 12; // You can adjust the desired password length

        // Generate a random password
        String randomPassword = generateRandomPassword(passwordLength);

        // Print the generated password
        System.out.println("Random Password: " + randomPassword);
    }

    public static String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}