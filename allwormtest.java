class worm1
{
int power(int base,int p)
{
int res=1;	
if(p==0)
{
return 1;
}
for(int i=1;i<=p;i++)
{
res=res*base;
}
return res;
}

void testnum(int num,int sep)
{
int temp=0,count;
while(num!=0)
{
count=0;
if(num%10==sep)
{
num=num/10;
continue;
}
while((num%10)!=sep)
{
temp=((num%10)*power(10,count))+temp;
num=num/10;
count++;
break;

}
}
System.out.println(temp);
}	
}

class allwormtest
{
public static void main(String args[])
{
  worm1 w=new worm1();
  w.testnum(8086,8);
}
}