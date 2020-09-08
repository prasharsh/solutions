package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingPositive {
	public static void main(String[] args) {

		System.out.println("result: "+firstMissingPositive(new int[] {0,2,2,1,1}));
	}
	public static int firstMissingPositive(int[] nums) {
		int solu= 1;
		List<Integer> list = Arrays.stream(nums).distinct().filter(v-> v>0).boxed().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list);
		if(list.size()>0) {
			if(list.get(0)!=1) {
				solu = 1;
			}
			else if(list.size() ==1) {
				solu = list.get(0)+1;
			}
			else if(list.size()>1) {
				for(int i = 0; i<list.size(); i++) {
					try {
						if(i==list.size()) {
							solu = list.get(i)+1;
							break;

						}

						else if(i<(list.size()) &&  (list.get(i)+1) != list.get(i+1)) {
							solu = list.get(i)+1;
							break;
						}
					}catch (IndexOutOfBoundsException e) {
						solu = list.get(i)+1;
						break;
					}
				}}}
		return solu;

	}
}
