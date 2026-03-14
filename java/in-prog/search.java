class Solution {
    public static void main(String[] args) {
        firstMissingPositive(new int[]{3,4,-1,1});
    }
    public static int firstMissingPositive(int[] nums) {
        int smallest = Math.pow(2,31)-1);
        int missing = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==missing)
                missing++;
            }
        return missing;
    }
}
