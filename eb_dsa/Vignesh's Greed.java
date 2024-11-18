import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]sticks=new int[N];
        for(int i=0;i<N;i++){
            sticks[i]=sc.nextInt();
        }
        Arrays.sort(sticks);
        for(int i=N-1;i>=2;i--){
            if(sticks[i-2]+sticks[i-1]>sticks[i]){
                System.out.println(sticks[i-2]+sticks[i-1]+sticks[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
