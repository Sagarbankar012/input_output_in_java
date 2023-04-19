import java.util.*;
import java.io.*;
class demo{
	static int fact(int rem){
	int temp=1;
	while(rem>1){
		temp=temp*rem;
		rem--;
		}
	return(temp);
	}
	public static void main (String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number : ");
		int num =Integer.parseInt(br.readLine());
		int temp=num,sum=0,rem;
		while(temp!=0){
		rem=temp%10;
		int tem2=fact(rem);
		sum=sum+tem2;
		temp=temp/10;

		}
		System.out.println("Adition of factorial of each digit from "+num+" = "+sum);
	}


	

}