package basicjava;

import java.util.Scanner;

public class Electrcity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int unit;
		int bill;
		System.out.println("enter the unit you want to calculate");
		unit=sc.nextInt();
		if(unit<=100)
		{
			bill=unit*2;
			System.out.println("the calculated bill is"+bill);
		}
		else if(unit<=200)
		{
			bill=unit*3;
			System.out.println("the calculated bill is"+bill);
		}
		else if(unit<=300)
		{
			bill=unit*4;
			System.out.println("the calculated bill is"+bill);
		}
		else
		{
			bill=unit*5;
			System.out.println("the calculated bill is"+bill);
		}

	}

}
