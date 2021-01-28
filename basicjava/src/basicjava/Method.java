package basicjava;
import java.util.Scanner;
public class Method {
int multipication(int a,int b)
	{
		System.out.println("the multipication of two number is=");
		return (a*b);
	}
	void square(int a)
	{
		System.out.println("the square is="+(a*a));
	}
	static void cube(int a)
	{
		System.out.println("the cube is="+(a*a*a));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Method m=new Method();
		System.out.println("enter the values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		m.multipication(num1, num2);
		System.out.println("enter number :");
		int num3=sc.nextInt();
		m.square(num3);
		System.out.println("enter the value for cube");
		int num4=sc.nextInt();
		cube(num4);//its an static method so we can call it directly without using any object	
	}
	}
