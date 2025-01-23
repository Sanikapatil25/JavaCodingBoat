import java.util.Scanner;
public class Login
{
public static void main(String args[])
{
int password;
//String name;
System.out.println("Enter name:");
Scanner sc=new Scanner(System.in);
String name=sc.next();
System.out.println("Enter password:");
Scanner sc1=new Scanner(System.in);
password=sc1.nextInt();
if(password==2500&&name.startswith("s"))
{
	System.out.println("Login Successful");
}
else
{
	System.out.println("Login Failed");
}
}
}
