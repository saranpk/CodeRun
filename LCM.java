import java.util.*;
import java.io.*;
public class LCM {
	public static void main(String[] args){
		int a,b,max,min,x,l=1;
		System.out.println("Enter first number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter second number");
	    b=s.nextInt();
	    if(a>b){
	    	max=a;
	    	min=b;
	    }
	    else{
	    	max=b;
	    	min=a;
	    }
	    for(int i=1;i<=min;i++){
	    	x=max*i;
	    	if(x%min==0){
	    		l=x;
	    		break;
	    	}
	    }
	    System.out.println("LCM of two numbers is"+l);
	}

}
