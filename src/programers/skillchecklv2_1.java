package programers;
class Solutions2_1 {
	public int solution(int n, int a, int b){
		int answer = 0;
		for(int i=1;i<=Math.getExponent(n);i++) {
			a=(a%2==0)?a/2:a/2+1;
			b=(b%2==0)?b/2:b/2+1;
			if(a==b) {
				answer=i;
				break;
			}
		}
		return answer;
	}
}
public class skillchecklv2_1 {
	public static void main(String[] args) {
		Solutions2_1 c = new Solutions2_1();
		int n=8;
		int a=4;
		int b=7;
		System.out.println(c.solution(n, a, b));
		
		
	}
}
