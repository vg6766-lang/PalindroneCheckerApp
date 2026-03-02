//usecase8;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        LinkedList<Character> charList = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            charList.add(ch);
        }

        boolean isPalindrome = true;

        while (charList.size() > 1) {
            char first = charList.removeFirst();
            char last = charList.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}