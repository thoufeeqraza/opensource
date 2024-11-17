import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


    public class DiagonalDifference {
    
        public static int diagonalDifference(int[][]arr){
            int n = arr.length;
        int primaryDiagonal=0;
        int secondaryDiagonal=0;
        for(int i=0;i<n;i++){
            primaryDiagonal+=arr[i][i];
            secondaryDiagonal+=arr[i][n-i-1];
        }
       return Math.abs(primaryDiagonal-secondaryDiagonal);
    }
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][]arr=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println(diagonalDifference(arr));
}}
