import java.util.*;
import java.io.*;
public class StringtoCamel {
	public static void main(String[] args){
		String str;
		 String result = "";
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		str=s.next();
		char firstChar = str.charAt(0);
        result = result + Character.toUpperCase(firstChar);
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i - 1);
            if (previousChar == ' ') {
                result = result + Character.toUpperCase(currentChar);
            } else {
                result = result + Character.toLowerCase(currentChar);
            }
        }
        System.out.println(result);
	}

}
