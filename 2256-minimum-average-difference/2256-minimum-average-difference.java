class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long prefixsum[]=new long[n];
        prefixsum[0]=(long)nums[0];
        
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        
        long mindiff=Integer.MAX_VALUE;
        int index=-1;
        long diff;
        
        for(int i=0;i<n;i++){
            if(i==n-1)
                diff=prefixsum[i]/n;
            else
                diff=Math.abs(prefixsum[i]/(i+1) - (prefixsum[n-1]-prefixsum[i])/(n-i-1));
            
            if(diff<mindiff){
                mindiff=diff;
                index=i;
            }
        }
        
        return index;
    }
}