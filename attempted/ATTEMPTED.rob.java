class Solution {
    public static void main(String[] args) {
        rob(new int[]{2,7,9,3,1});
    }
    public static int rob(int[] nums) {
        return helper(nums,0);
    }
    public static int helper(int[]nums, int index){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            return Math.max(branch(sum,nums, i), branch(sum,nums,i+1));
        }
        return 0;
    }
    public static int branch(int sum, int []nums, int index){
        return branch(nums[index]+sum, nums, index++);
    }
}