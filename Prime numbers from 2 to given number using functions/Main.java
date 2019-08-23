import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(is_prime(i))
        {
          System.out.println(i);
        }
      }
	}
  public static boolean is_prime(int m)
  {
    boolean isprime=true;
    for(int num=2;num<=m/2;num++)
    {
      if(m%num==0)
      {
        isprime=false;
        break;
      }
    }
    return isprime;
  }
}