import java.util.*;
import java.io.*;
public class Sum {
	public static void main(String[] args){
		System.out.println("Enter the count of natural numbers");
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers is:"+sum);
	}

}
