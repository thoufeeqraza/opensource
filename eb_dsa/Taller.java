import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
    }
}
