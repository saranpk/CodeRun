import java.util.*;
import java.io.*;
public class Primenumber {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i,n1,n2,m=0,j;
		System.out.println("Enter the lower limit");
		n1=s.nextInt();
		System.out.println("Enter the upper limit");
		n2=s.nextInt();
		System.out.println("Prime numbers between the range");
		for(i=n1;i<=n2;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					m=0;
					break;
				}
				else{
					m=1;
				}
			}
			if(m==1){
				System.out.println(i);
			}
		}
		
	}

}
