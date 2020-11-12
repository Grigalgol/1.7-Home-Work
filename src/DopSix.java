import java.util.*;
public class DopSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int s=10;
        int flag=0;
        while (x>0)
        {
            if (x%10==s) {
                System.out.println("YES");
                flag++;
                break;
            }
            s=x%10;
            x/=10;
        }
        if(flag==0) System.out.println("NO");
    }
}