import java.io.*;
import java.util.*;
public class EvenOdd {
	public static void main(String[] args){
		String str;
		char even,odd;
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		str=s.next();
		int i;
		int l=str.length();
		for(i=0;i<l;i++){
			if(i%2==0){
				even=str.charAt(i);
				//i=i+1;
				System.out.println(str.charAt(i+1));
			}
			else{
			odd=str.charAt(i);
			//i=i+1;
			System.out.println(str.charAt(i-1));
		}
			
	}
		
}
}
