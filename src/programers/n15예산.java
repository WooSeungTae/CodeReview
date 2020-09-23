package programers;



import java.util.Arrays;

class Solution15 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum=0;
		int count=0;
		Arrays.sort(d);
		for(Integer a : d)sum+=a;
		if(sum==budget) {
			answer=d.length;
		}else {
			for(int i=d.length-1;i>=0;i--) {
				count++;
				sum-=d[i];
				if(sum<=budget) {
					answer=d.length-count;
					break;
				}
			}
		}
		return answer;
	}
}
public class n15¿¹»ê {
	public static void main(String[] args) {
		Solution15 a = new Solution15();
		int [] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(a.solution(d, budget));

	}
}
