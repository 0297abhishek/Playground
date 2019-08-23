import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int length = s.length();
        double afterDecimal = 0;
        double beforeDecimal = 0;
        int flag =0;
        for(int i = 0; i<length; i++)
        {
            if(s.charAt(i)=='.')
            flag = 1;
        }
        if(flag == 1)
        {
            for (int i = length - 1 ; s.charAt(i)!= '.' && i >= 0; i--)
            {
                afterDecimal = afterDecimal/10 + (s.charAt(i)-'0');
            }
            afterDecimal = afterDecimal/10;
            for (int i = 0 ; s.charAt(i)!= '.' ; i++)
            {
                beforeDecimal = beforeDecimal*10 + (s.charAt(i)-'0');
            }
        }
        else
        {
            for (int i = 0 ; i<length ; i++)
            {
                beforeDecimal = beforeDecimal*10 + (s.charAt(i)-'0');
            }
        }
        double sum = (afterDecimal + beforeDecimal);
        System.out.printf("%.2f",sum);
    }
}