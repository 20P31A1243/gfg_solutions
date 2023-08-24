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
    int convertfive(int num) {
        int i=0;
        int val=num;
        while(val!=0)
        {
            int r=val%10;
            if(r==0){
                num=num+(int)(5*Math.pow(10,i));
            }
            i=i+1;
            val=val/10;
        }
        return num;
    }
}