package programers;

import java.util.Arrays;


class Solution8 {
	public long solution(long n) {
		long answer = 0;
		String a = n+"";
		String b= "";
		char [] su = a.toCharArray();
		Arrays.sort(su);
		for(int i =su.length-1;i>=0;i--) {
			b+=su[i];
		}
	
	
		answer = Long.parseLong(b);
		return answer;
	}
}
public class n8정수내림차순으로배치하기 {
	public static void main(String[] args) {
		Solution8 a= new Solution8();
		System.out.println(a.solution(132135));
	}
}
