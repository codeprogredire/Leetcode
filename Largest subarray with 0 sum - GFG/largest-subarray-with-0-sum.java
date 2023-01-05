//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer>hm=new HashMap<>();
        int ans=0,prefixSum=0;
        
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            
            if(prefixSum==0)
                ans=i+1;
                
            if(hm.containsKey(prefixSum))
                ans=Math.max(ans,i-hm.get(prefixSum));
            else
                hm.put(prefixSum,i);
        }
        return ans;
    }
}