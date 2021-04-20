import java.util.*;
public class NumberOfWays {
 public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     long sum = 0;
     int[] ar = new int[n];
     for(int i =0 ; i<n; i++){
         ar[i] = sc.nextInt();
         sum += ar[i];
     }

     if(sum%3!=0)
     {
         System.out.println(0);
         System.exit(0);
     }

     sum = sum/3;
     long countSumBy3 = 0;
     long count2SumBy3 = 0;
     long sum2 = 0;
     for(int i = 0; i<n-1; i++){
         sum2+=ar[i];
         if(sum2==2*sum)
             count2SumBy3 += countSumBy3;

         if(sum2 == sum)
             countSumBy3++;

     }


     System.out.println(count2SumBy3);







 }
}
