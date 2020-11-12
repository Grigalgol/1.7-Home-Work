import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=1;
        int i=0;
        while (x%5!=0)
        {
            x = in.nextInt();
            if(x>10) i+=x;
        }
        System.out.println(i);
    }
}