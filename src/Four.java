import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt(), b= in.nextInt();
        int i=0;
        while (a>=6b)
        {
            a-=b;
            i++;
        }
        System.out.println(i + " " + a);
    }
}
