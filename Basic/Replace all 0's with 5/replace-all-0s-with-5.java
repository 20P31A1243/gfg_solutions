//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int n) {
        // Your code here
        int result=0;
        int place=1;
        while(n!=0)
        {
            int r=n%10;
            if(r==0)
             r=5;
        
            result=result+(r*place);
            n=n/10;
            place=place*10;
            
            
        }
        return result;
    }
}