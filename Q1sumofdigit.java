//Q 1 WAP to ask a number and print sum and count and average  of digits .
import java.util.Scanner;
public class Q1sumofdigit {
	public static void main (String[] args) {
		
		
		System.out.println("enter the number = ");
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		int digit, sum=0;
		float i=0;
		{
		for(sum=0 ; number!=0 ; number=number/10) 
		{
				sum = sum + number%10;
			    i++;
		}
		System.out.println("sum of digit = "+sum);
		System.out.println("number count = "+i);
		System.out.println("Average of digit = "+(sum/i));
}

}
}