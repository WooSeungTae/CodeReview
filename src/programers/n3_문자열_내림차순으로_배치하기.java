package programers;

import java.util.Arrays;
import java.util.Collections;

class Solution3 {
	public String solution(String s) {
		String answer = "";
		char [] an =  s.toCharArray();
		Arrays.sort(an);
		for(int i =an.length-1;i>=0;i-- ) {
			answer+=an[i];
		}
		return answer;
	}
}
public class n3_���ڿ�_������������_��ġ�ϱ� {
	public static void main(String[] args) {
		
	}
}
