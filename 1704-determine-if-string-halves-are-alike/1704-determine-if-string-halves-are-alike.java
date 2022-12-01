class Solution {
    public int count(String s,int start,int end){
        int ans=0;
        for(int i=start;i<end;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                ans++;
        }
        return ans;
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int mid=s.length()/2;
        int count1=count(s,0,mid);
        int count2=count(s,mid,s.length());
        
        return count1==count2;
    }
}