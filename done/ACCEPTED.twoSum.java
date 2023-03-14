class Solution {
    // public static void main(String[] args) {
    // twoSum(new int[]{3,3}, 6);
    // }
    public static int[] twoSum(int[] nums, int target) {
        for(int firstIndex = 0; firstIndex < nums.length; firstIndex++){
            for(int secondIndex = firstIndex+1; secondIndex < nums.length; secondIndex++){
                if(nums[firstIndex] + nums[secondIndex] == target)
                    return new int[]{firstIndex, secondIndex};
            }
        }
        return new int[]{};
    }
}