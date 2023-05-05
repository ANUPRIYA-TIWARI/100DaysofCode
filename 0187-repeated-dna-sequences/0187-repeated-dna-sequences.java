public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new LinkedList<String>();
        if (s == null || s.length() < 10)
            return result;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A',0);
        map.put('C',1);
        map.put('T',2);
        map.put('G',3);
        Set<Integer> appear = new HashSet<Integer>();
        Set<Integer> added = new HashSet<Integer>();
        int tmp = 0;
        for (int i = 0; i < s.length(); i ++){
            tmp = (tmp << 2) + map.get(s.charAt(i)); 
            if (i >= 9){
                tmp = tmp & ((1 << 20) - 1); 
                if (appear.contains(tmp) && !added.contains(tmp)){ 
                    added.add(tmp); 
                    result.add(s.substring(i - 9, i + 1)); 
                } 
                else{ 
                    appear.add(tmp); 
                } 
            }//if i >= 9
        }//for i
        return result;
    }
}