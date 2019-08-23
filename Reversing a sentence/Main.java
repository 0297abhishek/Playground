import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        // Reverse a given string
        reverse_string(sb, 0, str_len - 1);
        int start_idx = 0;
        for(int i = 0; i < str_len; i++)
        {
            if(sb.charAt(i) == ' ')
            {
                
                reverse_string(sb, start_idx, i - 1);
                start_idx = i + 1;
            }
            else if(i == (str_len - 1))// Last word
            {
                reverse_string(sb, start_idx, i);
                start_idx = i + 1;
            }
        }
        System.out.print(sb);
    }
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        int end = end_idx;
        int front = start_idx;
        while(front < end)
        {
            char tmp_ch = sb.charAt(front);
            sb.setCharAt(front, sb.charAt(end));
            sb.setCharAt(end, tmp_ch);
            front++;
            end--;
        }
    }
}