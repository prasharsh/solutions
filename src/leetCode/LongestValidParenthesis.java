package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LongestValidParenthesis {
	public static void main(String[] args) {

		System.out.println(longestValidParentheses("()(())(("));
	} 
	public static int longestValidParentheses(String s) {
		//System.out.println(s.indexOf("()"));
		//int counter =0;
		for (int idx = 0; (idx = s.indexOf("()", idx)) >= 0; idx++) { 
			System.out.println("before: "+s);
			StringBuilder sb = new StringBuilder(s);
			System.out.println("replace chars at "+ idx+" and "+ (idx+1));
			sb.deleteCharAt(idx);
			sb.deleteCharAt(idx);
			sb.replace(idx, idx, "1");
			sb.replace(idx+1, idx+1, "1");
			s=sb.toString();
			System.out.println("after: "+s);
			//counter++; 
		
	}
		String s1 = s.replaceAll("\\(", "-").replaceAll("\\)","-"); 
		String[] sArr = s1.split("-");
		HashSet<Integer> lengthHashSet = new HashSet<Integer>();
		for (String string : sArr) {
			lengthHashSet.add(string.length());
		}
		 List<Integer> list = new ArrayList<>(lengthHashSet);
		Collections.reverse(list);
		int size =0;
		
		if(!list.isEmpty()) {
			size = list.get(0);
		}
		
		return size;

	}
}

