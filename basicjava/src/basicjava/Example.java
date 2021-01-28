package basicjava;

public class Example {
	int RollNo;
	String Name;
	Example(int RollNo,String Name)
	{
		this.Name=Name;
		this.RollNo=RollNo;
	}
	public static void main(String[] args) {
		Example e=new Example(1, "parikshit");
		Example e1=new Example(2, "vanistha");
		System.out.println(e.Name + "and" + e.RollNo);
		//System.out.println(e.RollNo);
		System.out.println(e1.Name + "and" + e1.RollNo);
		//System.out.println(e1.RollNo);
	}

}
