import java.util.*;
public class DopOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        int t;
        int flag =0;
        int N = in.nextInt();
        for (i=1; i<=N; i++) {
            t= in.nextInt();
            if(t<=437) {
                System.out.println("Crash " + i);
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("No crash");
        }
    }
}
