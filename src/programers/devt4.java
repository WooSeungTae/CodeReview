package programers;

import java.util.ArrayList;
import java.util.Collections;

class Solutiondevt4 {
	public String solution(String[] votes, int k) {
		String answer = "";
		int sum = 0;
		int sbcount=0;
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> votes1=new ArrayList<String>();
		for(String a: votes) votes1.add(a);
		int count=1;
		while(true) {
			for(int i=1;i<votes1.size();i++) {
				if(votes1.get(0).equals(votes1.get(i))) {
					count++;
					votes1.remove(i);
					i--;				
				}
			}
			al.add(count+votes1.get(0)+"");
			votes1.remove(0);
			count=1;
			if (votes1.size()==0)break;
		}
		Collections.sort(al);
		for(int i=al.size();i>al.size()-k;i--) {
			sum+=Integer.parseInt(al.get(i-1).substring(0,1));	
		}
		for(int i=0;i<al.size();i++) {
			sbcount+=Integer.parseInt(al.get(i).substring(0,1));
			if(sbcount>=sum) {
				answer=al.get(i-1).substring(1);
				break;
			}
		}
		return answer;
	}
}
	public class devt4 {
		public static void main(String[] args) {
			Solutiondevt4 a = new Solutiondevt4();
			String [] votes = {"AVANT", "PRIDO", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "AVANT", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "SOULFUL", "AVANT", "SANTA"};
			int k=2;
			a.solution(votes, k);
		}
	}
