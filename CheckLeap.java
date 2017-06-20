import java.util.*;
import java.io.*;
public class CheckLeap {
	public static void main(String[] args){
		int year;
		System.out.println("Enter a year");
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if(year%4==0){
			System.out.println(year+"is a leap year");
		}
		else{
			System.out.println(year+"is not a leap year");
		}
	}

}
