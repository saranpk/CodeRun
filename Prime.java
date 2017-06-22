import java.util.*;
import java.io.*;
public class Prime {
	public static void main(String[] args){
		int num,i,m=0;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(i=2;i<num;i++){
			if(num%i==0){
				m=0;
				break;
			}
			else{
				m=1;
			}
		}
		if(m==1){
			System.out.println(num+"is a prime number");
		}
		else{
			System.out.println(num+"is not a prime number");
		}
	}

}
