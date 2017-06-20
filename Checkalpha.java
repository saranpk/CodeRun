import java.util.*;
import java.io.*;
public class Checkalpha {
	public static void main(String[] args){
		char value;
		System.out.println("Enter a character");
		Scanner s=new Scanner(System.in);
		value=s.next().charAt(0);
		if(value>='a'&&value<='z'||value>='A'&&value<='Z'){
			System.out.println("The given character is alphabet");
		}
		else{
			System.out.println("The given character is not an alphabet");
		}
		
	}

}
