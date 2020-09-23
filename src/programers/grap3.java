package programers;

import java.util.ArrayList;
import java.util.Arrays;

class Solutiong3 {
	public int[] solution(int[][] customer, int K) {
		int room = K;
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> ready = new ArrayList<Integer>();
		for(int i=0;i<customer.length;i++) {
			if(customer[i][1]==0) {
				if(al.contains(customer[i][0])) {
					al.remove(al.indexOf(customer[i][0]));
					if(ready.size()>0) {
						al.add(ready.get(0));
						ready.remove(0);
					}else {
						room++;
					}
				}else {
					ready.remove(ready.indexOf(customer[i][0]));
				}
			}else {
				if(room!=0) {
					al.add(customer[i][0]);
					room--;
				}else {
					ready.add(customer[i][0]);
				}
			}
		}
		System.out.println(al);
		
		int[] answer = new int[al.size()];
		for(int i = 0 ; i<al.size();i++) {
			answer[i]=al.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}
}
public class grap3 {
	public static void main(String[] args) {
		Solutiong3 a = new Solutiong3();
		int [][] customer = {{2,1},{1,1},{3,1},{1,0},{1,1},{2,0},{2,1}};
		int K=1;
		System.out.println(a.solution(customer, K)[0]);
		System.out.println(a.solution(customer, K)[1]);

	}
}
