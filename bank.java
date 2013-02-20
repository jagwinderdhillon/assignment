class bankaccount
{
 String name;
 String accountno;
 float accountbalance;
 int mobile;
   
void set_acc_details(String n,String a,float b,int m)
	{
  name=n;
 accountno=a;
 accountbalance=b;
 mobile=m;
System.out.print("account name is ="+name);
System.out.print("acCount no is ="+accountno);
System.out.print("account balance is="+accountbalance);
System.out.print("mobile no is="+mobile);
}
void deposit(float c)
{
  accountbalance=accountbalance+c;
}
void withdraw (float c)
{
if (c>accountbalance)
{
System.out.println("insufficient balance");
return;
}
else
{
accountbalance-=c;
}
}
void changename(String Name)
{
name=Name;
}
void printbalance()
{
System.out.println("account balance is ="+accountbalance);
}
void printaccountno()
{
System.out.println("account no is ="+accountno);
}
void printmobileno()
{
System.out.println("mobile no is ="+mobile);
}
}

public class bank
{
public static void main(String[] args)
{
bankaccount p=new bankaccount();
p.set_acc_details("dhillon","hdfc1233",10000000,1);
}
}