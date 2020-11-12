import java.util.*;
public class DopThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0;
        int n= in.nextInt();
        while (n>0){
            i+=2;
            System.out.print(i + " ");
            n--;
        }
    }
}