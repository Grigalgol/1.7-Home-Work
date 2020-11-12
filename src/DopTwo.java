import java.util.*;
public class DopTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        int i;
        int s=0;
        if(b>=0)
        {
            for (i=1; i<=b; i++)
            {
                s=s+a;
            }
            System.out.println(s);
        }

        else

        if(b<0)
        {
            for (i=-1; i>=b; i--)
            {
                s=s+Math.abs(a);
            }
            if(a<0) System.out.println(s);
            else
                System.out.println(-s);
        }
    }
}
