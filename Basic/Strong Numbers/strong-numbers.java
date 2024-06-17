//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isStrong(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here\
        int n=N;
        int sum=0;
        
        while(n!=0)
        {
           int r=n%10;
           int m=1;
           for(int i=1;i<=r;i++)
           {
                m=m*i;
           }
           sum=sum+m;
           n=n/10;
           
        }
        if(sum==N)
         return 1;
        else
         return 0;
    }
    
};