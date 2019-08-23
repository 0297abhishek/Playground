import java.util.Scanner;
class Main{
  public static int sum_of_numbers(int num)
  {
    int sum=0;
    for(int i=01;i<=num;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(sum_of_numbers(n)); 
    }
}

