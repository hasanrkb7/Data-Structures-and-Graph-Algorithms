import java.util.*;
import java.io.*;
public class task1{
    public static void main (String[]args){
        try{
            FileReader fr = new FileReader("G:\\Summer20\\CSE221\\LAB\\Lab 03\\problem1.txt");
            BufferedReader obj = new BufferedReader(fr);
            String g = "";
            String p = "";
            int count = 0;
            String string;
            while((string = obj.readLine()) != null){
                StringTokenizer st = new StringTokenizer(string, " ");
                while(st.hasMoreTokens()){
                    if(count==0){
                        g += st.nextToken();
                    }
                    else{
                        p += st.nextToken();
                    }
                }
                count++;
            }
            char [] gn = g.toCharArray();
            char [] pn = p.toCharArray();
            int m = gn.length;
            int n = pn.length;
            int [][] L = new int[m+1][n+1];
            LCS o1 = new LCS ();
            L = o1.longestCommon(L, gn, pn, m, n);
            char [] longestSub = o1.longestSub(L, pn, m, n);
            for(int i = 0; i < longestSub.length; i++){
                System.out.print(longestSub[i]+" ");
            }
            System.out.println();
            System.out.println((L[m][n]*100/m)+"% PASSED");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
