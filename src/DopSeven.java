import java.util.*;
public class DopSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int d=0;
        int flag=0;
        for (int i = 1; i <x; i++) {
            if (x % i == 0) d++;
            if (d >= 2) {
                System.out.println("composite");
                flag++;
                break;
            }
        }
        if(flag==0 || x==1) System.out.println("prime");
    }
}
