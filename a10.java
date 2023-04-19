import java.util.*;
import java.io.*;
class demo{
	public static void main (String args[])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter starting number : ");
	int s =Integer.parseInt(br.readLine());
	System.out.print("Enter ending number : ");
	int e =Integer.parseInt(br.readLine());
	System.out.print("Series = ");
	for(int i=s;i<=e;i++){
	int temp=prime(i);
	if(temp==1)
		System.out.print(i+" ");
	
	}
	}
	static int prime(int n){
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			return 1;
		else
			return 0;
	}


}