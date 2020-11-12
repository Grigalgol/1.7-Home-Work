import java.util.*;
public class DopFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int flag=0;
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        for(i=10000; i<=99999; i++)
        {
            if(i%a==b && i%c==d) { System.out.print(i + " "); flag++; }
        }
            if(flag==0) System.out.println(-1);
    }
}
