/**************************************
 * File        =    StringTokeniser.java
 * Name        =    Steve_M_Thomas
 * version     =    1.0
 * Description =    Using String Tokenizer find the sum of no.s
 ***************************************/
package Student;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokeniser {
	public static void main(String[]args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String contains no.s");
		String str=sc.nextLine();
		StringTokenizer string=new StringTokenizer(str);
		while(string.hasMoreTokens()) {
			int data=Integer.parseInt(string.nextToken());
			sum=sum+data;
		}
		System.out.println("The Sum of numbers in String="+sum);	}

}
