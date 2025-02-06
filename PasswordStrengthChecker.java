import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        String strength = checkPasswordStrength(password);
        System.out.println("Password Strength: " + strength);
    }

    public static String checkPasswordStrength(String password) {
        if (password.length() >= 12 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")) {
            return "Strong";
        } else if (password.length() >= 8) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }
}
