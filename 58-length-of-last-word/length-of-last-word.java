class Solution {
    public int lengthOfLastWord(String s) {
        // String str=s.trim();
        // String arr[]= str.split(" ");
        // return arr[arr.length-1].length();
        int first=0;
        String ans="";
        for(int i=s.length()-1;i>0;i--)
        {
            if(s.charAt(i)!=' ' && s.charAt(i-1)==' ')
            {
                first=i;
                break;
            }
            
        }
        ans=s.substring(first).trim();
        return ans.length();
    }}