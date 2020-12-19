package programers;

import java.util.ArrayList;

class Solution {
	public int[] solution(int []arr) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(Integer c:arr)ar.add(c);
		for(int i =1;i<ar.size()-1;i++) {
			if(ar.get(i)==ar.get(i+1)) {
				ar.remove(i+1);
				i--;
			}else {
				
			}
		}
		
		int[] answer = new int[ar.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=ar.get(i);
		}
		return answer;
	}
}
public class plt1 {

}
