import java.util.Scanner;
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine().trim();
    if (isValidNumber(input)) {
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }
    scanner.close();
  }
  private static boolean isValidNumber(String input) {
    if (input.length() == 10 && isAllDigits(input)) {
      return true;
    } else if (input.startsWith("+") && input.contains(" ")) {
      String[] parts = input.split("\\s+");
      if (parts.length == 2 && isValidCountryCode(parts[0]) && isAllDigits(parts[1]) && parts[1].length() == 10) {
        return true;
      }
    }
    return false;
  }
  private static boolean isAllDigits(String str) {
    for (char c : str.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
  }
  private static boolean isValidCountryCode(String code) {
    return code.charAt(0) == '+' && code.length() == 3;
  }
}
