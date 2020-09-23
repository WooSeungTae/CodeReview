package programers;
class Solution_2 {
	boolean solution(String s) {
		boolean answer = true;
		char [] s1 = s.toCharArray();
		int countP=0;
		int countY=0;
		for(int i=0; i<s1.length;i++) {
			if(s1[i]=='p') countP++;
			if(s1[i]=='y') countY++;
		}
		if(countP==countY) answer=true;
		else answer = false;
		return answer;
	}
}
public class 문자열_내_p와_y의_개수__2 {
	public static void main(String[] args) {
		Solution_2 a = new Solution_2();
		boolean c = a.solution("pPpdnfkeytYY");
		System.out.println(c);
	}
}
