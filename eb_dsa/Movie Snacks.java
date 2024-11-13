import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int y =sc.nextInt();
     int z = sc.nextInt();
     int costIndividually = 2*x+3*y;
     int costTwoCombosOneDrink = 2*z+y;
     int costOneComboRestIndividually = z+x+2*y;
     int minCost = Math.min(costIndividually,Math.min(costTwoCombosOneDrink,costOneComboRestIndividually));
     System.out.println(minCost);
	}
}
