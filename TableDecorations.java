import java.util.*;
public class TableDecorations {
    public static void main(String agr[]){
        Scanner sc = new Scanner(System.in);
        long[] ar = new long[3];
         ar[0] = sc.nextLong();
         ar[1] = sc.nextLong();
         ar[2] = sc.nextLong();
         Arrays.sort(ar);
         long ans = Math.min(ar[0]+ar[1], (ar[0]+ar[1]+ar[2])/3);

        System.out.println(ans);
    }
}
