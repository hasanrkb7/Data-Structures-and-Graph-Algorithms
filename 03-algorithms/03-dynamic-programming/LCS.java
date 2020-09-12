public class LCS{
    public static int[][] longestCommon (int [][] L, char [] gn, char [] pn, int m, int n){
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if (i == 0 || j == 0){
                    L[i][j] = 0;
                }
                else if(gn[i-1] == pn[j-1]){
                    L[i][j] = L[i-1][j-1] + 1;
                }
                else{
                    L[i][j] = Math.max(L[i][j-1],L[i-1][j]);
                }
            }
        }
        return L;
    }

    public char [] longestSub(int [][] L, char [] pn, int m, int n){
        char [] longestSub = new char [L[m][n]];
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
                longestSub[x] = pn[j-1];
                x--;
                i = i-1;
                j = j-1;
            }
        }
        return longestSub;
    }
}