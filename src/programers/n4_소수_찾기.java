package programers;

import java.util.ArrayList;

class Solution4 {
	public int solution(int n) {
		int answer = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		int sqrt = (int) Math.sqrt(n);
		if(n>=3) {
			al.add(2);al.add(3);
			for(int i = 3; i<=n;i++) {
				if(i%2!=0 && i%3!=0) {
				al.add(i);}
			}
		}else {
			al.add(2);
		}
		for(int i =0;al.get(i)<=sqrt;i++) {
			for(int k = i;k<al.size();k++) {
				if(al.get(k)%al.get(i)==0) {
					if(al.get(k)!=al.get(i)) {
						al.remove(k);
						k--;
					}
				}
			}
		}
		answer = al.size();
		return answer;
	}
}
public class n4_소수_찾기 {
	public static void main(String[] args) {
		Solution4 a =  new Solution4();
		System.out.println(a.solution(100));

	}
}
