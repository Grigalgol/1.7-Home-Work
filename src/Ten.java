import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        int c, d;
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        for (c = x+1; c < 1010; c++)
        {
            d = 0;
            for (int i = 1; i <= c; i++)
            {
                if (c % i == 0)
                    d++;
            }
            if (d <= 2) {
                System.out.println(c);
                break;
            }
        }
    }
}