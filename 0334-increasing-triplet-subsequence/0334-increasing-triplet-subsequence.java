class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n= nums.length;
        int left=Integer.MAX_VALUE;
        int middle=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int right=nums[i];
            if(right<left){
                left=right;
            }
            else if(right<middle && right > left){
                middle = right;
            }
            else if(right>middle&& right>left)return true;
        }
        return false;
    }
    
}
        
    
