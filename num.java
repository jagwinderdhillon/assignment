class numbers
{  
    boolean prime_num(int a)
  { 
    for(int i=2;i<=a/2;i++)
     {
            if(a%i==0)
            {
              return false;
            }
	}
           return true;
      
	}
      
      boolean even_num(int n)
      {
           if(n%2==0)  
         
           { 
               return true;
           }
           return false;
       }
       boolean divisibleby5(int n)
       {
           if(n%5==0)
           {
               return true;
           }
           return false;
        }

}
public class num
{
       public static void main(String[] args)
       {
           numbers p=new numbers();
           System.out.println(p.prime_num(10));
           System.out.println(p.even_num(10));
           System.out.println(p.divisibleby5(10));
       }
}                   
        






