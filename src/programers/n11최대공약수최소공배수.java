package programers;

import java.util.ArrayList;

class Solution11 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int nA=n;
		int mA=m;
		int nP = 0;
		int mP = 0;
		int g=1;
		int l=1;
		ArrayList<Integer>al = new ArrayList<Integer>();
		for(int i = 2;i<((m>n)?m:n);i++) {
			if(n%i==0 && m%i==0) {
				al.add(i);
				n=n/i; m=m/i;
				i=1;
			}
		}
		for(int i = 0;i<al.size();i++) {
			g*=al.get(i);
		}
		nP=nA/g; mP=mA/g;
		answer[0]=g; answer[1]=g*nP*mP;
		return answer;
	}
}
public class n11최대공약수최소공배수 {
	public static void main(String[] args) {
		Solution11 a = new Solution11();
		int n= 2;
		int m = 5;
		System.out.println(a.solution(n, m)[0]);
		System.out.println(a.solution(n ,m)[1]);
	}
}
