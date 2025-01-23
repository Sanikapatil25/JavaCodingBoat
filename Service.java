import java.util.Scanner;
class Test
{
void voteRegister(String name,long mobile,int age,int sscrollNo,String location)
{
if(age>=18 && location.equals("Kagal"))
{
	System.out.println("You are eligiblie for vote Your vote id is:"+mobile+sscrollNo);
}
else if(age<18 || location!="kagal")
{
	System.out.println("You are not eligible for the voting");
}
}
static void marry(String name,int age1)
{
if(age1<18)
{
	System.out.println("Hi"+name+" "+"Try after some time");
}
else if(age1>35)
{
	System.out.println("Hi"+" "+name+" "+"You are tooo late");
}
else
{
	System.out.println("Hi"+" "+name+" "+"You are eligible for marriage");
}
}
}
class Service
{
public static void main(String[] args)
{
	Test t=new Test();
	t.voteRegister("Sanika",9323,19,2508,"Kagal");
	//Test.marry("Abhishekh",21);
	String nwname;
	int nwage;
	System.out.println("Enter Name:");
	Scanner sc=new Scanner(System.in);
	nwname=sc.next();
	System.out.println("enter age:");
	Scanner s=new Scanner(System.in);
	nwage=sc.nextInt();
	Test.marry(nwname,nwage);
	
}
}