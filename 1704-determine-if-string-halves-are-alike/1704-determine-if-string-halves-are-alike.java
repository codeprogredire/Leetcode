class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int p=s.length()/2;
        int count1=0,count2=0;
        for(int i=0;i<p;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count1++;
        }
        
        for(int i=p;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count2++;
        }
        
        return count1==count2;
    }
}