
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Example:

//Given nums = [2, 7, 11, 15], target = 9,

//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr= new int[2];
        for(int i=1; i<nums.length; i++){
            if(nums[i]+nums[i-1]==target){
                arr[0]=i-1;
                arr[1]=i;
                return arr;
            }
        }
        return arr;
        
    }
}
