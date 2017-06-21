import java.util.*;
import java.io.*;
public class CountDigit {
	public static void main(String[] args){
		int digit,no=0,i;
		System.out.println("Enter a digit");
		Scanner s=new Scanner(System.in);
		digit=s.nextInt();
		while(digit>0){
			digit/=10;
			no++;
		}
		System.out.println("Number of digits in given number is"+no);
	}

}
