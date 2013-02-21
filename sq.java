class square
{
	int square_num(int a)
	{
 	  int c;

  	 c=a*a;
  	 
	return c;
	}
}
public class Sq
{
public static void main(String[] args)
 {
     square p=new square();  
	for(int i=1;i<=5;i++)
	{
     	System.out.println("square is"+p.square_num(i) );
		}
   
}
}