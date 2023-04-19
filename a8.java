import java.util.*;
import java.io.*;
class Demo {
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of rows :");
		int row = Integer.parseInt(br.readLine());
		int num = 1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++ ){
				if ((num-1)%4 == 0)
					num=1;
				if(num == 1)
					System.out.print("$");
				if(num == 2)
					System.out.print("@");
				if(num == 3)
					System.out.print("&");
				if(num == 4)
					System.out.print("#");
			
			}
		num++;	
		System.out.println();
		}
	}

}

