package basicjava;

public class Employee {
int RollNo;
String Name;
Employee(int RollNo,String Name)
{
	this.Name=Name;
	this.RollNo=RollNo;
}
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
}
