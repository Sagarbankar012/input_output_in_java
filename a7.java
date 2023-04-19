import java.util.*;
import java.io.*;
class demo{
	public static void main (String args[])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of rows: ");
	int row =Integer.parseInt(br.readLine());
	int a=row;
	int sum =fun(a);
	int num=1+sum;
	char ch=(char)(65+sum);
	for(int i=1;i<=row;i++){
		
		for(int j=1 ;j<=i;j++){
			if(a%2==1){
				
				System.out.print(ch+" ");
				
			}
			else{
			System.out.print(num+" ");

			}
			ch--;
			num--;
		}
		a--;
		System.out.println();
	}
	}
	static int fun(int row){
	int sum=0;
	while(row>1){
	sum=sum+row;
	row--;
	}
	return sum;
	}
}
