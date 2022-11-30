class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int freq[]=new int[2001];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                freq[0]+=1;
            else if(arr[i]<0)
                freq[Math.abs(arr[i])]+=1;
            else
                freq[1000+arr[i]]+=1;
        }
        
        Arrays.sort(freq);
        
        int i=0;
        while(i<2001 && freq[i]==0){
            i++;
        }
        
        for(;i<2000;i++){
            if(freq[i]==freq[i+1])
                return false;
        }
        
        return true;
    }
}