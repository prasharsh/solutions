package leetCode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InterleavingString {

	public static void main(String[] args) {
		
		System.out.println(isInterleave("aa", "aa", "aaaa"));
	}
	 public static boolean isInterleave(String s1, String s2, String s3) {
		 //0 <= s1.length, s2.length <= 100
		//		 0 <= s3.length <= 200
		boolean isIL = false;
		boolean isMatching = true;
		List<Character> list = null;
		List<Character> targetList = null;
		if(0 <= s1.length() && s1.length() <=100 && 0 <= s2.length() && s2.length() <= 100) {
		if(s1==""&& s2=="" & s3=="") {
			isIL = true;
		}
		else if(s1.length()+s2.length() == s3.length()) {
			String s = s1+s2;


			list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
			List<Character> s11 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
			List<Character> s22 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

			Collections.sort(list);
			
			targetList = s3.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
			List<Character> s33 = targetList;
			Collections.sort(targetList);
			System.out.println(list);
			System.out.println(targetList);
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i)!=targetList.get(i)) {
					isMatching = false;
				}
			}
		}
		
		if(isMatching) {
			isIL= true;
		}}
		 return isIL;
	        
	    }
}
