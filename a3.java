import java.util.*;
import java.io.*;
class demo{
	public static void main (String args[])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of rows: ");
	int row =Integer.parseInt(br.readLine());
	int temp1=1;
	for(int i=1;i<=row;i++){
		int temp=row-i+1;	
		for(int j=row ;j>=i;j--){
			System.out.print(temp1*temp+" ");
			temp--;

		}
		temp1++;
		System.out.println();
	}
	}
}
