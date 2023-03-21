//  O(n^2)time  O(1)space
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums != null && nums.length > 1) {
            for (int i = 0; i < nums.length; i++){
                // if(nums[i] > target){
                //     continue;
                // }
                for(int j = 0; j < nums.length ; j++){
                    if (i == j) {
                        continue;
                    }
                    if (nums[i] + nums[j] == target){
                        int [] res = new int[2];
                        res[0] = i;
                        res[1] = j;
                        return res;
                    }
                }
            }
            return null;
        } else {
            return null;
        }
    }
}