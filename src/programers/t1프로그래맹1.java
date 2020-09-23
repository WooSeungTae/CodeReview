package programers;

import java.util.ArrayList;

class Solutiont1 {
	public int solution(int p) {
		int answer = 0;
		String answerA="";

		boolean f = true;
		while(f){
			ArrayList<String> al = new ArrayList<String>();
			ArrayList<String> al2 = new ArrayList<String>();
			p++;
			String a = p+"";
			String []b = a.split("");
			for(String c: b) {
				al.add(c);
				al2.add(c);
			}
			for(int i=0;i<al.size();i++) {
				al2.remove(0);
				if(al2.size()==0) {
					for(String d : al) {
						answerA+=d;						
					}
					answer=Integer.parseInt(answerA);
					f=false;
					break;
				}else {
					if(al2.contains(al.get(i))){
						break;
					}
				}
			}
		}
		return answer;
	}
}
public class t1ÇÁ·Î±×·¡¸Í1 {
	public static void main(String[] args) {
		Solutiont1 a = new Solutiont1();
		int p = 2014;
		System.out.println(a.solution(p));
	}
}
