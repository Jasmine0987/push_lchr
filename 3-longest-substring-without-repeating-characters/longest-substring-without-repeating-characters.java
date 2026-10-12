class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, m=0;
        Set <Character> set=new HashSet<>();
        for(int r=0; r<s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l)); l++;
            }set.add(s.charAt(r));
            if(r-l+1>m) m=r-l+1;
        }return m;
    }
}