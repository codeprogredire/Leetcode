class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder("");
        int n=s.length();
        s=s.toLowerCase();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch>='a'&& ch<='z') || (ch>='0'&& ch<='9'))
                str.append(ch);
        }
        n=str.length();
        int start=0,end=n-1;
        
        while(start<end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}