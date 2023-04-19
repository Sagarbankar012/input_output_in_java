import java.util.*;
import java.io.*;
class demo{
	public static void main (String args[])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number of rows: ");
	int row =Integer.parseInt(br.readLine());
	char ch ='D';
	int num = 4;
	for(int i=1;i<=row;i++){
		for(int j=1 ;j<=row;j++){
			System.out.print(ch);
			System.out.print(num+" ");
			if(i%2==0){
			ch++;
			num++;
			}
			else{
			ch--;
			num--;
			}
		}
		System.out.println();
		if(i%2==1){
		ch++;
		num++;
		}
		else{
		ch--;
		num--;
		}
	}
	}
}
