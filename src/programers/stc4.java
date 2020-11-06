package programers;
class Solutionstc4 {
    public String solution(String S, int[][] interval) {
        String answer = "";
        for(int i =0;i<interval.length;i++) {
        	String a=S.substring(interval[i][0]-1,interval[i][1]);
        	String b="";
        	for(int k=a.length()-1;k>=0;k--) {
        		b+=a.substring(k,k+1);
        	}
        	S=S.replace(a, b);
        }
        return answer;
    }
}
public class stc4 {
	public static void main(String[] args) {
		int dd[][] = {{1,1},{1,2},{1,2}};
		System.out.println(dd[0][0]);
		String k = "a b";
		for(int i =0;i<dd.length;i++) {
			String a=k.substring(dd[i][0]-1,dd[i][1]);
        	String b="";
        	for(int d=a.length()-1;d>=0;d--) {
        		b+=a.substring(d,d+1);
        	}
        	k=k.replace(a, b);
        	System.out.println(k);
		}
	}
}
