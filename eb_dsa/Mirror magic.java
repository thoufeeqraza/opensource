import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][]matrix=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=N-1;j>=0;j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
