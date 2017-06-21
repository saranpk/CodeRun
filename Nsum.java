import java.util.*;
import java.io.*;
public class Nsum {
	public static void main(String[] args){
		System.out.println("Enter the value of N");
		int n,i,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=0;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("Sum of N numbers is:"+sum);
	}

}
