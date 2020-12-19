package programers;

class Solutionplt2 {
	public int solution(int n) {
		int answer = 0;
		String num=n+"";
		for(int i=0;i<num.length();i++) {
			answer+=Integer.parseInt(num.substring(i,i+1));
		}
		return answer;
	}
}
public class plt2 {
	public static void main(String[] args) {
		String a = "asdflas";
		System.out.println(a.substring(0,1));
	}
}
