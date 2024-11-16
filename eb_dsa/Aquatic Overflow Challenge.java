import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int totalWater = w+(y*z);
            if(totalWater > x){
                System.out.println("overflow");
            }else if (totalWater == x){
                System.out.println("filled");
            }else{
                System.out.println("unfilled");
            }
        }
    }
}
