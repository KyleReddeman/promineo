import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodingQuestion {

	static void reverseArray(int a, int b, int c, int d, int e) {
		// Write your code below this line 
		
		int [] arr = {a, b, c, d, e};
		int [] revArr = new int[arr.length];
		for(int el : arr) {
		    System.out.println(el);
		}
		for(int i = 0; i < arr.length; i++) {
		    revArr[i] = arr[arr.length - 1 - i];
			
		}
		for(int el : revArr) {
		    System.out.println(el);
		}
		
		
		
		// Write your code above this line 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		reverseArray(a, b, c, d, e);
	}
}