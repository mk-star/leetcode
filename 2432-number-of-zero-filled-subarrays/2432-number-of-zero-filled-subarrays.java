class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, sub = 0;
        for (int num : nums) {
            sub = (num == 0) ? sub + 1 : 0;
            cnt += sub;
        }
        return cnt;
    }
}
