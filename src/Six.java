import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i=0;
        n--;
        while (n>25)
        {
            i+=n;
            n-=2;
        }
        System.out.println(i);
    }
}