import java.util.*;
import java.io.*;
public class Odd {
	public static void main(String[] args){
		int n1,n2,i;
		System.out.println("Enter first interval");
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		System.out.println("Enter second interval");
		n2=s.nextInt();
		System.out.println("Odd numbers between intervals");
		for(i=n1;i<=n2;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}

}
