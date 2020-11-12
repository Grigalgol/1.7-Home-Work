import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int i=0;
        while (a>=1)
        {
            a/=2;
            i++;
        }
        System.out.println(i);
    }
}
