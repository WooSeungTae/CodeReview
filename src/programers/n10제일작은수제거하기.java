package programers;

import java.util.Arrays;

class Solution10 {
	public int[] solution(int[] arr) {
		int [] copyArr = Arrays.copyOf(arr, arr.length);
		int[] answer = new int[(arr.length==1)?1:arr.length-1];
		Arrays.sort(copyArr);
		
		if(answer.length==1) {
			answer[0] = -1;
		}else {
			int k = 0 ;
			for(int i = 0 ; i<arr.length;i++) {
				if(arr[i]!=copyArr[0]) {
					answer[k]=arr[i];
					k++;
				}
			}
			
		}
		return answer;
	}
}
public class n10제일작은수제거하기 {
	public static void main(String[] args) {
		Solution10 a = new Solution10();
		int []arr = {3,4,2,1};
		int[] c = new int[(arr.length==1)?1:arr.length-1];
		c = a.solution(arr);
		for(int i =0; i <c.length;i++) {
			System.out.print(c[i]+",");
		}
	}
}
