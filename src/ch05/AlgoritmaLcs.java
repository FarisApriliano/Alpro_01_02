package ch05;

public class AlgoritmaLcs {
    int AlgoritmaLcs(char[] X, char[] Y, int m, int n) { 
        int L[][] = new int[m + 1][n + 1]; 
        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++) { 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
                else if (X[i - 1] == Y[j - 1]) 
                    L[i][j] = L[i - 1][j - 1] + 1; 
                else
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]); 
            } 
        } 
        return L[m][n]; 
    } 
    int max(int a, int b) 
    { 
        return (a > b) ? a : b; 
    } 
    public static void main(String[] args) 
    { 
        AlgoritmaLcs lcs = new AlgoritmaLcs(); 
        String s1 = "ABCDEFGH"; 
        String s2 = "FGHIJKLM"; 
  
        char[] X = s1.toCharArray(); 
        char[] Y = s2.toCharArray(); 
        int m = X.length; 
        int n = Y.length; 
  
        System.out.println("Length of LCS " +"''"+ 
        s1 +"''"+" "+"''"+ s2 +"''"+ " =" + " " 
        + lcs.AlgoritmaLcs(X, Y, m, n)); 
    } 

}