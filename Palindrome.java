import java.util.*;
import java.io.*;
public class Palindrome {
	public static void main(String[] args){
		int num,rnum=0,tnum;
		System.out.println("Enter a digit");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		tnum=num;
		while(num>0){
			rnum=rnum*10;
			rnum=rnum+num%10;
			num=num/10;
		}
		if(rnum==tnum){
			System.out.println("The number is palindrome");
		}
		else{
			System.out.println("The number is not a palindrome");
		}
		
	}

}
