package com.capgemini.access;
class For
{
void method()
	{
		System.out.println("hello");
	}
}
public class First extends For {
	
	void methodd()
	{
		System.out.println("hey");
		
	}
public static void main(String[] args) {
	First f=new First();
	f.methodd();
	f.method();
	
}
}
