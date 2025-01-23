class Operation
{
void wish()
{
	System.out.println("Good Morning..");
}
void add(int num1,int num2)
{
	int res;
	res=num1+num2;
	System.out.println("Sum is:"+res);
}
static void login(String username,String password)
{
	if(username.equals("Sanu") && password.equals("Patil"))
	{
		System.out.println("Login Successful..."+username);
	}
	else
	{
		System.out.println("Login Fail.."+username);
	}
}
static void info(String name,String cource)
{
	if(cource=="java")
	{
		System.out.println("Hi"+" "+name+" "+"Your cource teacher is Mr.ratan Sir");
	}
	else if(cource=="python")
	{
		System.out.println("Hi"+" "+name+" "+"Your cource teacher is Mr.ram Sir");
	}
	else
	{
		System.out.println("Hi"+" "+name+" "+"Your cource is not available");
	}
}
static void disp(int a,boolean b,char ch,double d)
{
	System.out.println(a+" "+b+" "+ch+" "+d);
}
}
class Test
{
public static void main(String[] args)
{
	Operation op=new Operation();
	op.wish();
	op.add(10,20);
	Operation.login("Sanu","Patil");
	Operation.info("SAnika","java");
	Operation.disp(25,true,'S',25.08);
}
}


