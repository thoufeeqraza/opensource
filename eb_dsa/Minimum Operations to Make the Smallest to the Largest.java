import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for(int t=0;t<T;t++){
            int N =sc.nextInt();
            int[]A=new int[N];
            for(int i=0;i<N;i++){
                A[i]=sc.nextInt();
            }
            int M=A[0];
            for(int i=1;i<N;i++){
                if(A[i]<M){
                    M=A[i];
                }
            }
            int operations=0;
            for(int i=0;i<N;i++){
                if(A[i]>M){
                    operations++;
                }
            }
            output.append(operations).append("\n");
        }
        System.out.println(output);
    }
}
