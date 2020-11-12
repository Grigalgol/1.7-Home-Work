import java.util.*;
public class Nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i=10;
        int g;
        while (n>0)
        {
            g=n%10;
            n/=10;
            if(g<i && g>0) i=g;

        }
        if(i==10) System.out.println("NO");
        else System.out.println(i);
    }
}