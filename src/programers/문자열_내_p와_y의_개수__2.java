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
public class ���ڿ�_��_p��_y��_����__2 {
	public static void main(String[] args) {
		Solution_2 a = new Solution_2();
		boolean c = a.solution("pPpdnfkeytYY");
		System.out.println(c);
	}
}
