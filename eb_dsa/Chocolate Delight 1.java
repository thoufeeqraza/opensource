import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int chocolatesToBuy = Math.max(0,c-x);
            int cost = chocolatesToBuy*y;
            System.out.println(cost);
        }
    }
}
