import java.util.*;
public class GivenLengthAndSumOfDigits {
  public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int s = sc.nextInt();
      String minNum = "";
      String maxNum = "";

      if(s==0){
          if(m==1)
              System.out.println("0 0");
          else
              System.out.println("-1 -1");
          System.exit(0);
      }

      for(int i = 0; i<m; i++){
          int temp = Math.min(s,9);
          maxNum +=temp;
          s = s-temp;
      }




      if(s>0) {
          System.out.println("-1 -1");
          System.exit(0);
      }



      for(int i = m-1; i>=0; i--){
          minNum += String.valueOf(maxNum.charAt(i));
      }

      int i;
      for(i = 0; minNum.charAt(i)=='0'; i++);

      if(i!=0) {
          StringBuilder stb = new StringBuilder("");
          stb.append("1");
          stb.append(minNum.substring(1, i));
          stb.append(Character.getNumericValue(minNum.charAt(i)) - 1);
          if(i<minNum.length()-1)
              stb.append(minNum.substring(i+1,minNum.length()));
          System.out.println(stb.toString()+" "+maxNum);

      }
      else{
          System.out.println(minNum+" "+maxNum);
      }








      }
}
