import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
	   private static Scanner in;

	public static void main(String[] args) {
	        in = new Scanner(System.in);
	        long a = in.nextLong();
	        long b = in.nextLong();
	        long c = in.nextLong();
	        long d = in.nextLong();
	        long e = in.nextLong();
	        long[] array = {a,b,c,d,e};
	        Arrays.sort(array);
	        System.out.print(a+b+c+d);
	        System.out.print(" ");
	        System.out.print(b+c+d+e);
	    }
	}
