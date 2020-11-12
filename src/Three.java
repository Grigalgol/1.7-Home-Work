import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=10;
        int i=-1;
        while (x>=10 && x<=99)
        {
            i+=(x%10+x/10);
            x = in.nextInt();
        }
        System.out.println(i);
    }
}