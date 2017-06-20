import java.util.*;
import java.io.*;
public class LargeNumber {
	public static void main(String[] args){
		int a,b,c;
		System.out.println("Enter 3 numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b&&a>c){
			System.out.println(a+ "is a greater number");
		}
		else if(b>c){
			System.out.println(b+ "is a greater number");
		}
		else{
			System.out.println(c+ "is a greater number");
		}	
	}
}
