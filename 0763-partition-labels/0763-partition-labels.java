class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] index = new int[26];
        for (int i = 0; i < s.length(); ++i)
            index[s.charAt(i) - 'a'] = i;
        
        List<Integer> res= new ArrayList();
        int pivot=0;
        int last_index=0;
        for(int curr=0; curr <s.length(); curr++) {
            last_index = Math.max(last_index, index[s.charAt(curr) - 'a']);
            if(curr == last_index) {
                res.add(last_index-pivot+1);
                pivot=curr+1;
            }
        }
        return res;
    }
}

