package programers;
class Solution_1 {
	public boolean solution(String s) {
		boolean answer = true;
		if(s.length()>=4 && s.length()<=6) {
			try {
				Integer.parseInt(s);
				answer=true;
			}catch (Exception e) {
				answer = false;
			}
		}else {answer=false;}
		return answer;
	}
}
public class 문자열_다루기_기본__1 {
	public static void main(String[] args) {
		Solution_1 a = new Solution_1();
		String b = "1a23535a2";
		System.out.println(a.solution(b));
	}
}
