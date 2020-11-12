import java.util.*;
public class DopFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int s=0;
        while (x>0)
        {
            s+=(x%10);
            x/=10;
        }
        System.out.println(s);
    }
}