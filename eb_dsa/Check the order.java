import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            int[] difficulties = new int[N];
            for(int i=0;i<N;i++){
                difficulties[i]=sc.nextInt();
            }
            boolean isNonDecreasing =true;
            for(int i=0;i<N-1;i++){
                if(difficulties[i]>difficulties[i+1]){
                    isNonDecreasing = false;
                    break;
                }
            }
            if(isNonDecreasing){
                result.append("Yes\n");
            }else{
                result.append("No\n");
            }
        }
        System.out.println(result);
    }
}
