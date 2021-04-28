import java.util.*;
public class FixingTypos {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        char[] ans = new char[200001];
        char[] str = sc.nextLine().toCharArray();
        int len = str.length;
        int j = 0;
        for(int i = 0; i<len; i++){
            char ch = str[i];
            if(i>=2 && ch==ans[j-1] && ans[j-1]==ans[j-2] || (i>=3 && ch==ans[j-1] && ans[j-2]==ans[j-3]))
                continue;
            else
            {
                ans[j] = str[i];
                j++;
            }
        }

        String res = "";
        for(int i = 0; i<j; i++)
            res += String.valueOf(ans[i]);
        System.out.println(res);
    }
}
