import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
           int maxMangoes=(z-y)/x;
            System.out.println(maxMangoes);
        }
    }
}
