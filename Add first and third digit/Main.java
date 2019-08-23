import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last=n%10;
      int first=(n/100)%10;
      int sum=first+last;
      System.out.println(sum);
	}
}