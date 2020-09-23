package programers;


class Solutiont1t {
	public int[] solution(int[][] v) {
		int[] answer = new int [2];
		int cnt0=0;
		int cnt1=0;
		for(int i =0;i<v.length;i++) {
			cnt0=0;
			for(int k=0;k<v.length; k++) {
				if(v[i][0]==v[k][0]) {
					cnt0++;
				}
			}
			if(cnt0==1)answer[0]=v[i][0];
		}
		
		for(int i =0;i<v.length;i++) {
			cnt1=0;
			for(int k=0;k<v.length; k++) {
				if(v[i][1]==v[k][1]) cnt1++;
			}
			if(cnt1==1)answer[1]=v[i][1];
		}
		return answer;
	}
}

public class test1_프로그래밍1 {
	public static void main(String[] args) {
		int [][] v = {{1,4},{3,4},{3,10}};
		Solutiont1t a = new Solutiont1t();
		System.out.println(a.solution(v)[1]);

	}

}

