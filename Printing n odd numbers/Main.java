import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1;
      for(int i=1;i<=2*n;i++)
      {
        if(count%2==1)
        {
          System.out.println(count);
        }
        count++;
      }
      
	}
}
