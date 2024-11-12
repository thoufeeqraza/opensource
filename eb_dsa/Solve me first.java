import java.util.Scanner;
public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int result = solveMeFirst(a, b);
        System.out.println(result);
    }
    public static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
