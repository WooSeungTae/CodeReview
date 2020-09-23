package programers;
class Solution9 {
	public long solution(long n) {
		long answer = 0;
		long sum =0;
		long i = 0;
		for(i = 1; sum<n;i++) {
			sum+=(i%2!=0)?i:0;
		}
		answer=(sum==n)?sum+i+1:-1;
		return answer;
	}

}
public class n9정수제곱근판별 {
	public static void main(String[] args) {
		Solution9 a = new Solution9();
		long n = 9;
		System.out.println(a.solution(n));

	

		
	} 
	
}
