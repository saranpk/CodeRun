import java.util.*;
import java.io.*;
public class StringRev {
	public static void main(String[] args){
		String str,rstr="";
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		str=s.next();
		int i,l;
		l=str.length();
		for(i=l-1;i>=0;i--){
			rstr=rstr+str.charAt(i);
		}
		System.out.println("Reversed string is:"+" "+rstr);
	}
}
