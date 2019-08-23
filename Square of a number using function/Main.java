import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int square=num*num;
    return square;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int square1=square(n);
      System.out.println(square1);
    }
}