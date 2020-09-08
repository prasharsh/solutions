package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintWordsVertically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printVertically("TO BE OR NOT TO BE"));
	}

	public static List<String> printVertically(String s) {
		System.out.println(s);
		List<String> soluList = new ArrayList<String>();
		String[] wordsArr = s.split(" ");
		List<String> words = Arrays.asList(wordsArr);
		System.out.println(words.size());
		int  idx=0;
		for(int i =0; i<s.length();i++) {
			String element="";
			boolean isEoC= false;
			for(int j=0; j<words.size();j++) {
				//System.out.println(element+ words[j].charAt(i)+"");
				idx=j;
				try {
					element = element+ words.get(j).charAt(i)+"";
				}catch (StringIndexOutOfBoundsException e) {
					
					element = element+ " "+"";
					System.out.println(" str array length: "+ words.size());
				}
			}
			soluList.add(element);
		}
		
		List<String> list = Arrays.stream(soluList.toArray(new String[0])).filter(v-> v.replaceAll(" ","").length()>0).collect(Collectors.toList());
		return list;
	}
}
