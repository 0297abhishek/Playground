import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last=n%10;
      while(n>=100)
      {
        n=n/10;
      }
      int second=n%10;
        
      System.out.println(second);
      
	}
}