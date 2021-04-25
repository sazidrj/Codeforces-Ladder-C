import javafx.util.Pair;

import java.util.*;
public class BeautifulSetsOfPoints {
 public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     HashMap<Integer,Integer> hm = new HashMap<>();
     int x = 0;
     int k = Math.min(n,m);

     while(true){

         if(x>k/2)
             break;
         hm.put(x,k-x);
         hm.put(k-x,x);
         x++;
     }
     int size = hm.size();
     System.out.println(size);

     for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
         System.out.println(entry.getKey() +" "+entry.getValue());
     }

 }
}
