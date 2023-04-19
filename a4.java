import java.util.*;
import java.io.*;
class demo{
	public static void main (String args[])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter start number : ");
	int s =Integer.parseInt(br.readLine());
	System.out.print("Enter end number : ");
	int e =Integer.parseInt(br.readLine());
	int temp=e;
	while(temp>=s){
	if(temp%2==0)
	System.out.print(temp+" ");
	temp--;	
	}
	System.out.println();
	temp=s;
	while(temp<=e){
	if(temp%2==1)
	System.out.print(temp+" ");
	temp++;	
	}

	}
}
