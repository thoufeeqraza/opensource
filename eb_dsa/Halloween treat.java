import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X= sc.nextInt();
        int Y = sc.nextInt();
        int totalTreats = (N*X)+(M*Y);
        System.out.println(totalTreats);
    }
}
