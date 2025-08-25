class Solution {
    public int longestSubarray(int[] nums) { 
        int max = 0;
        int cnt = 0, temp = 0;
        boolean isOnly1 = true;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                max = Math.max(cnt + temp, max);
                temp = cnt;
                cnt = 0;
                isOnly1 = false;
            } else {
                cnt++;
            }
        }
        max = Math.max(cnt + temp, max);
        if(isOnly1) return max - 1;
        else return max;
    }
}