import java.util.*;
import java.io.*;
public class StringtoIn {
	public static void main(String[] args){
		String str;
		int i;
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		str=s.next();
		i=Integer.parseInt(str);
		System.out.println("Converted String"+i);
	}

}
