import java.util.*;
import java.io.*;
public class RevNum {
	public static void main(String[] args){
		int num,rnum=0;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num>0){
			rnum=rnum*10;
			rnum=rnum+num%10;
			num=num/10;
		}
		System.out.println("Reversed number is:"+rnum);
	}

}
