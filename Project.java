import java.util.Scanner;
public class Project
{
public static void main(String args[])
{
System.out.println("Welcome");
System.out.println("1.Add student data\n2.Display Student data");
System.out.println("Enter your choice:");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
String stname;
long mob1=0;
String addr;

switch(choice)
{
case 1:

	System.out.println("Add Student data");
	System.out.println("Enter number of records you want to add:");
	Scanner sc1=new Scanner(System.in);
	int record=sc1.nextInt();
	for(int i=0;i<=record;i++)
{
	System.out.println("Enter student name:");
	Scanner s=new Scanner(System.in);
	String name=s.next();
	stname+=name;
System.out.println(stname);
	System.out.println("Enter student mobile number:");
	Scanner s1=new Scanner(System.in);
	long mob=s1.nextInt();
	mob1+=mob;
	System.out.println("Enter student Address:");
	Scanner s2=new Scanner(System.in);
	String address=s2.next();
	addr+=addr;
}

default:
System.out.println("Thank you");
}
}


}
	
	