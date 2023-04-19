import java.util.*;
import java.io.*;
class demo{
	public static void main (String args[])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of rows: ");
	int row =Integer.parseInt(br.readLine());
	int a=0,b=1,c;
	int temp=0;
	for(int i=1;i<=row;i++){
		
		for(int j=1 ;j<=i;j++){
			if(temp<=1){
				System.out.print(temp+" ");
				temp++;
			}
			else{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			}
		}
		
		System.out.println();
	}
	}
}
