package leetCode;

public class CustomSortString {

	public static void main(String[] args) {
		
		System.out.println(customSortString("kqep", "pekeq"));
	}

	public static String customSortString(String S, String T) {
		boolean hasChars = true;
		StringBuilder strT = new StringBuilder(T);
//		StringBuilder strS = new StringBuilder(S);
		String prefix="";
		if(S.length()<=26 && T.length()<=200) {
			char[] charArr = S.toCharArray();
			for (char c : charArr) {
				if(!T.contains(c+"")) {
					// do nothing
				}
				else {
					prefix= prefix+c;					
					boolean isMany = false;
					while(strT.indexOf(c+"")>-1) {
						if(isMany)
						prefix= prefix+c;
						strT.deleteCharAt(strT.indexOf(c+""));
						isMany = true;
					}
					
				}
			}
			if(hasChars) {
				return prefix+""+strT;
			}
				
			else
				return null;
		}

		return null;   
	}
}
