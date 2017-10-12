import java.util.Scanner;
import java.util.*;
public class Subtraction extends Division{
	
	int res;
	void sub(){
		System.out.print("please input two numbers: ");
		Scanner a= new Scanner (System.in);
		int val1=a.nextInt();
		Scanner b=new Scanner(System.in);
		int val2=b.nextInt();
		res=val1-val2;
	}
	void show(){
		System.out.print("Your result is " + res);
	}
	Subtraction(){}
	
}
