import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = in.nextInt();
      }
      int element_1 = in.nextInt();
      int element_2 = in.nextInt();
      
      int element1 = -1;
      int element2 = -1;
      for(int i = 0; i < n; i++)
      {
        if(arr[i] == element_1)
        {
          element1 = i;
        }
        if (arr[i] == element_2)
        {
          element2 = i;
        }
      }
      System.out.println(element1);
      System.out.println(element2);
      
    }
}