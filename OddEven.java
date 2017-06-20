import java.util.*;
import java.io.*;
public class OddEven {
	public static void main(String[] args){
		int a;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0){
			System.out.println("The given number is even number");
		}
		else{
			System.out.println("The given number is odd number");
		}
}
}
