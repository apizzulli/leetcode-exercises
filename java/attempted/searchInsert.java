class Solution {
    public static void main(String[] args) {
        searchInsert(new int[]{1,3,4,6, 7, 9, 12, 17, 26, 27, 28}, 1);
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int mid = nums.length/2;
        int right = nums.length-1;
        while(true){
            if(target == nums[mid]){
                System.out.println("Found @ " + mid);
                return mid;
            }
            if(left==mid && mid+1 == target){
                System.out.println("Found @ " + mid);
                return mid+1;
            }
            if(left==mid && mid-1 == target){
                return mid-1;
            }
            else if(nums[mid-1]<target && nums[mid+1]>target){
                System.out.println("Found @ " + mid);
                return mid;
            }
            else if(target < nums[mid]){
                //left = mid;
                mid = mid/2;
                right = (right-mid)/2;
            }
            else if (target>nums[mid]){
                left = mid+mid/2;
                mid = ((right-left)/2)+left;
            }
        }
    }
}