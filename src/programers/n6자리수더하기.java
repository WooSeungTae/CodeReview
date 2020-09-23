package programers;

class Solution6 {
	public int solution(int n) {
		int answer = 0;
		String su = n+"";
		char [] a = su.toCharArray();
		for(int i = 0 ; i <a.length;i++) {
			answer+=Integer.parseInt(String.valueOf(a[i]));
		}
		return answer;
	}
}
public class n6자리수더하기 {
	public static void main(String[] args) {
		Solution6 a = new Solution6();
		System.out.println(a.solution(123));
	}
}
