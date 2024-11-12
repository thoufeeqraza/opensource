import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reduceString(input));
    }
    public static String reduceString(String input){
        StringBuilder result=new StringBuilder();
        int length = input.length();
        for(int i=0;i<length;i++){
            int count=1;
            while(i+1<length && input.charAt(i)==input.charAt(i+1)){
                count++;
                i++;
            }
            result.append(input.charAt(i)).append(count);
        }
        return result.toString();
    }
}
