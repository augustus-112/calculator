import java.util.Scanner;
import java.util.*;

public class Division {
	
	int res,mod;
	void dv()
	{
		System.out.print("Please input two numbers : " );
		Scanner a=new Scanner(System.in);
		int aa=a.nextInt();
		Scanner b=new Scanner(System.in);
		int bb=b.nextInt();
		
		mod=aa%bb;
		res=aa/bb;	
		
	}
	void show(){
		System.out.println("Your result " + res);
		System.out.println("Mod is " + mod);
	}
}
