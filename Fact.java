import java.io.*;
import java.util.*;
public class Fact {
	public static void main(String[] args){
		int i,n,fact=1;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Factorial of number:");
		for(i=1;i<=n;i++){
			if(n==0||n==1){
				fact=1;
				System.out.println(fact);
			}
			else{
				fact=fact*i;
			}	
		}
		System.out.println(fact);
	}

}
