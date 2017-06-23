import java.util.*;
import java.io.*;
public class NumberSum {
	public static void main(String[] args){
		int i,sum=0,odd=0;
		for(i=1;i<=15;i++){
			sum=sum+i;
		}
		System.out.println("Sum of numbers from 1 to 15 is:"+sum);
		for(i=15;i<=45;i++){
			if(i%2!=0){
				odd=odd+i;
			}
		}
		System.out.println("Sum of odd numbers from 15 to 45 is:"+odd);
	}

}
