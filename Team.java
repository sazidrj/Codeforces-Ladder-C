import java.util.*;
public class Team {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String res = "";
        if(m<n-1 || m>2*(n+1))
        {
            System.out.println("-1");
            System.exit(0);
        }
        if(m==n-1){
            for(int i =0; i<m; i++){
                res += "01";
            }
            res+="0";
            System.out.println(res);
            System.exit(0);
        }


           while(m>0 && n>0){
               if(m<2*n) {
                   res += "10";
                   m = m-1;
                   n = n-1;
               }
               else {
                   res += "110";
                   m = m - 2;
                   n = n - 1;
               }
           }

           for(int i =0; i<m; i++){
               res += "1";
           }
           System.out.println(res);



        }




    }

