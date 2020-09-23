package programers;

import java.util.ArrayList;
import java.util.HashSet;

class Solutiong2 {
	public String[] solution(String[] card, String[] word) {
		String card1 = null;
		ArrayList<String> answer1 = new ArrayList<String>();
		ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
		ArrayList<String> su = new ArrayList<String>();
		for(int i = 0;i<card.length;i++) {
			ArrayList<String> card2 =  new ArrayList<String>();
			for(int k=0;k<card[i].length();k++) {
				card2.add(card[i].charAt(k)+"");
				su.add(card[i].charAt(k)+"");
			}
			al.add(card2);
		}


		int check=0;
		int confirm=0;
		int check1=0;
		for(int i =0;i<word.length;i++) {
			ArrayList<ArrayList<String>> al2 = new ArrayList<ArrayList<String>>();
			ArrayList<String> su2 = new ArrayList<String>();
			for(int r = 0;r<card.length;r++) {
				ArrayList<String> card3 =  new ArrayList<String>();
				for(int k=0;k<card[r].length();k++) {
					card3.add(card[r].charAt(k)+"");
					su2.add(card[r].charAt(k)+"");
				}
				al2.add(card3);
			}
			HashSet<Integer> hs = new HashSet<Integer>();
			confirm=0;
			check=0;
			for(int k=0;k<word[i].length();k++) {
				for(int j=0;j<al2.size();j++) {
					String search = word[i].charAt(k)+"";
					if(al2.get(j).contains(search)) {
						al2.get(j).remove(al2.get(j).indexOf(search));
						hs.add(j);
						break;
					}else {
						check++;
					}
				}if(check==al2.size())confirm=-1;
			}
			if(confirm==0&&hs.size()==al.size()) {
				answer1.add(word[i]);
			}else {
				check1++;
			}
		}
		if(check1==word.length) {
			answer1.add("-1");
		}
		String[] answer = new String[answer1.size()];
		for(int c=0;c<answer1.size();c++) {
			answer[c]=answer1.get(c);
		}
		System.out.println(answer1);
		return answer;
	}
}
public class grap2 {
	public static void main(String[] args) {
		Solutiong2 a = new Solutiong2();
		String[] card = {"AABBCCDD", "KKKKJJJJ", "MOMOMOMO"};
		String[] word = {"AAAKKKKKMMMMM", "ABCDKJ"};
		a.solution(card, word);
	}
}
