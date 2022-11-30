class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        
        List<List<Integer>> ans=new ArrayList<>();
        
        int val=nums[0];
        
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int target=0-nums[i];

            int start=i+1,end=n-1;

            while(start<end){
                if(nums[start]+nums[end]==target){
                    List<Integer> sAns=new ArrayList<>();
                    sAns.add(nums[i]);
                    sAns.add(nums[start]);
                    sAns.add(nums[end]);
                    ans.add(sAns);
                    int temp=nums[start];
                    while(start<end && nums[start]==temp){
                        start++;
                    }
                }
                else if(nums[start]+nums[end]>target)
                    end--;
                else
                    start++;
                }
        }
    
        return ans;
        
        
    }
}