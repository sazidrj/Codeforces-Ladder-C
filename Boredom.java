import java.util.*;
import java.math.BigInteger;
public class Boredom {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[100001];
         int max = -1;
        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            ar[temp]++;
            max = Math.max(max,temp);

        }



       long [] res = new long[max+1];
        res[0] = 0;
        res[1] = ar[1];
        BigInteger b1 = BigInteger.valueOf(0);
        BigInteger b2 = BigInteger.valueOf(ar[1]);
        BigInteger b3 = new BigInteger("0");
        for(int i=2; i<=max; i++){
            b3 = b2.max(b1.add(BigInteger.valueOf(ar[i]).multiply(BigInteger.valueOf(i))));
            b1 = b2;
            b2 = b3;
        }


        System.out.println(b3);




    }
}
