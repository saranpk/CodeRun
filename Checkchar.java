import java.util.*;
import java.io.*;
public class Checkchar {
	public static void main(String[] args){
		char value;
		System.out.println("Enter a character");
		Scanner s=new Scanner(System.in);
		value=s.next().charAt(0);
		if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u'||value=='A'||value=='E'||value=='I'||value=='O'||value=='U'){
			System.out.println("The given character is vowel");
		}
		else{
			System.out.println("The given character is consonant");
		}
		
	}

}
