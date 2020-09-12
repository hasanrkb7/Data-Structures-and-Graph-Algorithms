import java.util.*;
import java.io.*;
public class task2{
    public static void main(String[]args){
        try{
            FileReader fr = new FileReader("G:\\Summer20\\CSE221\\LAB\\Lab 03\\problem2.txt");
            BufferedReader obj = new BufferedReader(fr);
            String ross = "";
            String chandler = "";
            int count = 0;
            String string;
            while((string = obj.readLine()) != null){
                StringTokenizer st = new StringTokenizer(string, " ");
                while(st.hasMoreTokens()){
                    if(count==0){
                        ross += st.nextToken();
                    }
                    else{
                        chandler += st.nextToken();
                    }
                }
                count++;
            }
            LinkedHashMap<Character,String> hm=new LinkedHashMap<Character,String>();
            FileReader fr2 = new FileReader ("G:\\Summer20\\CSE221\\LAB\\Lab 03\\problem2Index.txt");
            BufferedReader obj2 = new BufferedReader (fr2);
            String string2;
            while((string2 = obj2.readLine()) != null)
            {
                StringTokenizer st2 = new StringTokenizer (string2, "--");
                char token1 = st2.nextToken().charAt(0);
                String token2 = st2.nextToken();
                hm.put(token1, token2);
            }
            char [] rossJoke = ross.toCharArray();
            char [] chandlerJoke = chandler.toCharArray();
            int m = rossJoke.length;
            int n = chandlerJoke.length;
            int [][] L = new int[m+1][n+1];
            L = lcs(L, rossJoke, chandlerJoke, m, n);
            char [] longestSub = longestSubstring(L, chandlerJoke, m, n);
            System.out.println(L[m][n]);
            for(int i = 0; i < longestSub.length; i++){
                System.out.print(hm.get(longestSub[i]) + " ");
            }
            System.out.println();
        }
        catch(Exception e){
            System.err.println("Error: "+e);
        }
    }
    public static int[][] lcs (int [][] L, char [] rossJoke, char [] chandlerJoke, int m, int n)
    {
        for(int i = 0; i <= m; i++)
        {
            for(int j = 0; j <= n; j++){
                if (i == 0 || j == 0){
                    L[i][j] = 0;
                }
                else if(rossJoke[i-1] == chandlerJoke[j-1]){
                    L[i][j] = L[i-1][j-1]+1;
                }
                else{
                    L[i][j] = Math.max(L[i][j-1],L[i-1][j]);
                }
            }
        }
        return L;
    }
    public static char [] longestSubstring(int [][] L, char [] chandlerJoke, int m, int n){
        char [] longestSubstring = new char [L[m][n]];
        int x = L[m][n] - 1;
        int i = m;
        int j = n;
        while(i != 0 && j != 0){
            if(L[i][j] == L[i][j-1] || L[i][j] == L[i-1][j]){
                if(L[i][j] == L[i][j-1]){
                    j = j-1;
                }
                else{
                    i = i-1;
                }
            }
            else{
                longestSubstring[x] = chandlerJoke[j-1];
                x--;
                i = i-1;
                j = j-1;
            }
        }
        return longestSubstring;
    }
}