import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=gcd_of_2_number(n1,n2);
      System.out.println(gcd_of_2_number(result,n3));
	}
       public static int gcd_of_2_number(int num1,int num2)
         {
           int min=0;
           if(num1>num2)
           {
             min=num2;
           }
           else
           {
             min=num1;
           }
           while(min>=1)
           {
             if((num1%min==0) && (num2%min==0))
             {
               return min;
             }
             min--;
           }
         return 0;
           }
}