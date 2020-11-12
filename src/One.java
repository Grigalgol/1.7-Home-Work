import java.util.*;
 class One {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int x=1;
         int i=-1;
         while (x>0)
         {

             i++;
             x = in.nextInt();
             if(x<0) System.exit(0);
         }
         System.out.println(i);
     }
}
