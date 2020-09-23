package programers;
class Solution7 {
	public int[] solution(long n) {
		String a = n+"";
		int[] answer = new int[a.length()];
		int i =0;
		while(true) {
			answer[i]=(int) (n%10);
			i++;
			n=n/10;
			if(n<1) break;
		}
		return answer;
	}
}
public class n7자연수뒤집어배열로만들기 {
	public static void main(String[] args) {
		Solution7 a = new Solution7();
		System.out.println(a.solution(135465));
	}	
}
