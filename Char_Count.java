import java.util.Scanner;

public class Char_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        String inputString = "";
        while (inputString.isEmpty()) {
            System.out.println("Enter a non-empty string:");
            inputString = sc.nextLine();
            if (inputString.isEmpty()) {
                System.out.println("Please enter a valid string!");
            }
        }

        String inputChar = "";
        while (inputChar.isEmpty() || inputChar.length()>1) {
            System.out.println("Enter a single character to count:");
            inputChar = sc.nextLine();
            if (inputChar.isEmpty() || inputChar.length()>1) {
                System.out.println("Please enter exactly one character!");
            }
        }
        
        for(int i=0; i<inputString.length(); i++) {
            if (Character.toLowerCase(inputString.charAt(i)) == Character.toLowerCase(inputChar.charAt(0))) {
                count++;
            }
        }

        System.out.println("The character " + inputChar + " appears " + count + " time(s) in the string.");

        sc.close();
    }
}