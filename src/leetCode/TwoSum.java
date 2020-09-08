package leetCode;

/**
 * Problem statement : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.
 * This is the first leetCode problem that I solved, it was a good analytical question
 *
 */

class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] solution = new int[2];
		for(int i=0; i<nums.length && 1 <= nums.length && nums.length <= Math.pow(10, 5); i++){
			if(Math.pow(-10, 5)<= nums[i] && nums[i]<=Math.pow(10, 9) ){
				for(int j=i+1; j<nums.length; j++){
					if(nums[i]+nums[j]==target){
						solution[0]= i;
						solution[1] =j;
						break;
					}
				}
			}
		}
		return solution;
	}
}
