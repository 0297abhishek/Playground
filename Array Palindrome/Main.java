import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int i= 0; i <= arr_size - 1; i++)
        {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr_size - 1;
        boolean is_palindrome = true;
        while(left <= right)  
        {
            if(arr[left] != arr[right])
            {
                is_palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(is_palindrome == true){
            System.out.print("Yes");
        }
        else{
             System.out.print("No");
        }
    }
}
