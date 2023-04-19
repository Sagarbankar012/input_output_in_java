import java.util.*;
import java.io.*;
class demo{
	public static void main (String args[])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter two character : ");
	String ch=br.readLine();
	char s = ch.charAt(0);
	char a=s;
	//char s =(char)br.read();
	//br.skip(1);
	//System.out.print("Enter two character : ");
	//char e =(char)br.read();
	ch =br.readLine();
	char e= ch.charAt(0);
	int	temp=0;
	if(s == e){
	System.out.print(s+" = "+ e);	
	}
	else{
	while(a!= e){
	temp++;
	//System.out.println(s);
	a++;	
	}
	}
	System.out.println("The difference between "+ s +" and "+ e+" is "+temp);
	}

}
