package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLast {
	public static void main(String[] args) {
		int[] nums = new int[]{1};
		System.out.println(searchRange(nums , 1)[0]);
	}
	public static int[] searchRange(int[] nums, int target) {
		//0 <= nums.length <= 10^5
		//-10^9 <= nums[i] <= 10^9
		//nums is a non decreasing array.
		//-10^9 <= target <= 10^9
		System.out.println(nums.length);
		if(nums.length==0) {
			return new int[]{-1,-1};
		}
	else if((0 <= nums.length && nums.length <= Math.pow(10, 5)) &&
				(Math.pow(-10, 9) <= target &&  target <= Math.pow(10, 9)) &&
				(Math.pow(-10, 9) <= nums[0] && nums[nums.length-1] <= Math.pow(10, 9) )) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		HashSet<Integer> indexSet = new HashSet<Integer>();
		int[] solu = new int[2];
		solu[0] = list.indexOf(target);
		if(solu[0]>-1) {
		for(int i=solu[0]; i<list.size(); i++) {
			//System.out.println(list.get(i)+" at index "+i);
			if(list.get(i)==target) {
				indexSet.add(i);
			}

		}
		//System.out.println(indexSet.size());
		solu[1] = solu[0]+indexSet.size()-1;
		//System.out.println(solu[0]+" and "+ solu[1]);
		
		return solu;
		}}
		return new int[]{-1,-1};
	}
}
