package programers;

import java.util.Arrays;

class Solution17 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum=0;
		Arrays.sort(d);
		for(int i=0;i<d.length;i++) {
			sum+=d[i];
			if(sum==budget) {
				answer = i+1;
				break;
			}else if(sum>budget) {
				answer=i;
				break;
			}else if(i==d.length-1) {
				answer=d.length;
			}
		}
		return answer;
	}
}
public class n17_¿¹»ê {
	public static void main(String[] args) {
		int [] d= {1,2,3};
		int budget = 15;
		Solution17 a = new Solution17();
		int answer = a.solution(d, budget);
		System.out.println(answer);
	}
}
