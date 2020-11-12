import java.util.*;
public class Seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i=0;
        while (n>0)
        {
            n/=10;
            i++;
        }
        System.out.println(i);
    }
}