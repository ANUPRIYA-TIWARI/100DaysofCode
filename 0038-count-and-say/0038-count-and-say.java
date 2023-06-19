class Solution {
    public String Count(String s){
        int cnt = 1;
        char ch = s.charAt(0);
        StringBuilder curr = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch){
                cnt++;
            }
            else{
                curr.append(cnt);
                curr.append(ch);
                ch = s.charAt(i);
                cnt = 1;
            }
        }
        curr.append(cnt);
        curr.append(ch);
        return curr.toString();
    }
    public String countAndSay(int n) {
        String s = "1";
        for(int i=1;i<n;i++){
            s = Count(s);
        }
        return s;
    }
}
        
    
