import java.io.*;
import java.util.*;
public class Amstrong {
	public static void main(String[] args){
		int num,temp,c=0,a;
		System.out.println("Enter a digit");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		temp=num;
		while(num>0){
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(temp==c){
			System.out.println("The number is amstrong number");
		}
		else{
			System.out.println("The number is not an amstrong number");
		}
	}

}
