class Student
{
int sid;
String sname,Schoolname;
Parent pnt;
Marks mark;
Address addr;
Student(int sid,String sname,String Schoolname,Parent pnt,Marks mark,Address addr)
{
this.sid=sid;
this.sname=sname;
this.Schoolname=Schoolname;
this.pnt=pnt;
this.mark=mark;
this.addr=addr;
}
void Status()
{
int sum;
sum=mark.m1+mark.m2+mark.m3;
if(sum>=150)
{
System.out.println("You are pass");
System.out.println("Student Id:"+sid);
System.out.println("Student name:"+sname);
System.out.println("Student Schoolname:"+Schoolname);
System.out.println("Student Parents:"+pnt.fname+" "+pnt.mname);
System.out.println("Student marks:"+mark.m1+" "+mark.m2+" "+mark.m3);
System.out.println("Student Address:"+addr.dno+" "+addr.pincode+" "+addr.street+" "+addr.state+" "+addr.country);
}
else
{
System.out.println("You are Fail");
System.out.println("Student Id:"+sid);
System.out.println("Student name:"+sname);
System.out.println("Student Schoolname:"+Schoolname);
System.out.println("Student Parents:"+pnt.fname+" "+pnt.mname);
System.out.println("Student marks:"+mark.m1+" "+mark.m2+" "+mark.m3);
System.out.println("Student Address:"+addr.dno+" "+addr.pincode+" "+addr.street+" "+addr.state+" "+addr.country);
}
}
public static void main(String args[])
{
Parent p=new Parent("Vijay","Sarita");
Marks m=new Marks(50,50,50);
Address a=new Address(25,416216,"Kop","Maharashtra","India");
Student s=new Student(111,"Sanika","JJMCOE",p,m,a);
s.Status();
System.out.println("***************************************************************");
Student s1=new Student(222,"Tushar","KLE",new Parent("Mangesh","Minakshi"),new Marks(30,35,25),new Address(07,416001,"TS","Kernataka","India"));
s1.Status();
}
}
