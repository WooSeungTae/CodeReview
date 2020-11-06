package programers;
class Solutionstc6 {
	public String solution(int n) {
		String answer ="";
		if(n>=0) {
			int[] su = new int[n+2];
			su[0]=0;
			su[1]=1;
			for(int i=2;i<=n;i++){
				su[i]=su[i-2]+su[i-1];
				System.out.println(su[i]);
			}
			answer=su[n]+"";
		}else {
			int k=(n*-1);
			int[] su=new int[k+3];
			su[1]=1;
			su[2]=-1;
			for(int i=3;i<=k;i++) {
				su[i]=su[i-2]-su[i-1];
			}
			answer=su[(n*-1)]+"";
		}
		return answer;
	}
}
public class stc6 {
	public static void main(String[] args) {
		Solutionstc6 a = new Solutionstc6();
		int n=5;
		System.out.println(a.solution(n));
		
	}
}
