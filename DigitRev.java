import java.util.*;
import java.io.*;
public class DigitRev {
	public static void main(String[] args){
		int digit,rdigit=0;
		System.out.println("Enter a digit to reverse");
		Scanner s=new Scanner(System.in);
		digit=s.nextInt();
		System.out.println("Reversed digit is");
		while(digit>0){
			rdigit=rdigit*10;
			rdigit=rdigit+digit%10;
			digit=digit/10;
			//System.out.println(digit);
		}
		System.out.println(rdigit);
	}

}
