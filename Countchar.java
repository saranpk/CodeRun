import java.util.*;
import java.io.*;
public class Countchar {
	public static void main(String[] args){
		String str="hello123@#";
		int i,count=0,digit=0,num=0;
		for(i=0;i<str.length();i++){
			char c1=str.charAt(i);
			if(c1>='a'&&c1<='z'){
				count++;	
			}		
		}
		System.out.println("No.of characters in a string:"+count);
		for(i=0;i<str.length();i++){
			char c1=str.charAt(i);
			if(c1>='0'&&c1<='9'){
				digit++;
			}
		}
		System.out.println("No.of numbers in a string:"+digit);	
		for(i=0;i<str.length();i++){
			char c1=str.charAt(i);
			if(!(c1>='a'&&c1<='z')&&!(c1>='0'&&c1<='9')){
				num++;
			}
		}
		System.out.println("No.of alphanumeric characters in a string:"+num);	
			
	}
}
