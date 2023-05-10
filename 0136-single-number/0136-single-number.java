class Solution { 
    public int singleNumber(int[] numbers) {
   // Brute Force -- O(n**2),  Space Complexity O(1)
    int len = numbers.length;
    boolean isTwice = false; 
    for (int i=0; i < len; i++) { 
       isTwice = false;
       for (int j=0; j<len; j++) {
         if (isTwice) break;
         if (i != j)
            if(numbers[i] == numbers[j]) 
                isTwice = true;
       }         
       if(!isTwice) return numbers[i];
     }
     return numbers[len - 1];
  }
}