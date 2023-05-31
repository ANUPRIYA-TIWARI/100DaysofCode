class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
      Map<Integer, Integer> dic = new HashMap<>();
        for(int num : nums){ dic.put(num, dic.getOrDefault(num, 0) + 1); }
        
        Queue<Integer> max_heap = new PriorityQueue<>((a, b) -> dic.get(b) - dic.get(a));
        for(int key : dic.keySet()){ max_heap.add(key); }
        
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = max_heap.poll();
        }
        
        return result;
    } 
}