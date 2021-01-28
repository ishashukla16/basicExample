package basicjava;

public class Detail {
	Detail(int a)
	{
		System.out.println("the roll no is=");
	}

	public static void main(String[] args) {
		Employee e=new Employee(1,"ram");//here we are intilizing values using constructor
		Employee e2=new Employee(2,"ravi");//same as above but for every new value we have to create different object
		//Detail d=new Detail();
		//e.setRollNo(101);
		//e.setName("om");
		
		System.out.println(e.getName());
		System.out.println(e.RollNo);
		System.out.println(e2.getName());
		System.out.println(e2.RollNo);
		//qwerty
	    //d.Detail();
		
		
	}
}
