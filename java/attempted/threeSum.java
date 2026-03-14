import java.util.*;

class Solution {
    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfTriples = new ArrayList();
        for(int i =0; i < nums.length-2; i++){
            for (int j= 0; j < nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    List<Integer> triplet = new ArrayList();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    listOfTriples.add(triplet);
                }
            }
        }
        int counter = 1;
        for(List<Integer> list: listOfTriples){
            for(Integer n: list){
                System.out.print(n + " ");
            }
            counter++;
            // if(!(list.get(0)!= list.get(1) && list.get(0) != list.get(2) && list.get(1) != list.get(2)
            //     && (list.get(0) + list.get(1) + list.get(2) == 0))){
            //         listOfTriples.remove(list);
            //     }
        } 
        return listOfTriples;
    }
}