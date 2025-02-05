import java.util.Scanner;

public class fivefeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int uppercaseCount = 0, lowercaseCount = 0, specialCharCount = 0;
        
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (!Character.isDigit(ch)) {
                specialCharCount++;
            }
        }
        
        System.out.println("Up : " + uppercaseCount);
        System.out.println("Low : " + lowercaseCount);
        System.out.println("Special : " + specialCharCount);
        
        scanner.close();
    }
}
