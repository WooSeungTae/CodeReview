package programers;

import java.util.ArrayList;

class Solution19 {
	public int solution(String dartResult) {
		int answer = 0;
		int su1 = 0;
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> su = new ArrayList<Integer>();
		ArrayList<Double> posu = new ArrayList<Double>();
		double su2=0;
		char [] dart = dartResult.toCharArray();
		int k = 0 ;
		for(int i = 0 ; i <dart.length;i++) {
			try {
				Integer.parseInt(dart[i]+"");
				System.out.println("i번째  : "+i);
				if(dart[i+1]=='0') {
					su.add(i);
					posu.add(10.0);
					continue;
				}else if(i-1<0) {
					su.add(i);
					posu.add(Double.parseDouble((dart[i]+"")));
				}else if(dart[i-1]=='1'){
					continue;
				}
				else {
					su.add(i);
					posu.add(Double.parseDouble((dart[i]+"")));
				}
				k++;
			}catch (Exception e) {}
		}
		al.add(dartResult.substring(0,su.get(1)));
		al.add(dartResult.substring(su.get(1),su.get(2)));
		al.add(dartResult.substring(su.get(2)));

		for(int i = 0 ; i <posu.size();i++) {
			if(posu.get(i)==10.0) {
				switch (al.get(i).substring(2,3)) {
				case "S":
					su1 = (int)Math.pow(10.0, 1.0);
					if(al.get(i).contains("#")) {
						su1=su1*-1;
					}
					break;
				case "D":
					su1 = (int)Math.pow(10.0, 2.0);
					if(al.get(i).contains("#")) {
						su1=su1*-1;
					}
					break;
				case "T":
					su1 = (int)Math.pow(10.0, 3.0);
					if(al.get(i).contains("#")) {
						su1=su1*-1;
					}
					break;
				}
			}
			else {
				System.out.println(al.get(i).substring(1,2));
				switch (al.get(i).substring(1,2)) {
				case "S":
					su1 = (int)Math.pow(posu.get(i), 1.0);
					if(al.get(i).contains("#")) {
						su1=su1*-1;
					}
					break;
				case "D":
					su1 = (int)Math.pow(posu.get(i), 2.0);
					if(al.get(i).contains("#")) {
						su1=su1*-1;
					}
					break;
				case "T":
					su1 = (int)Math.pow(posu.get(i), 3.0);
					if(al.get(i).contains("#")) {
						su1=su1*-1;
					}
					break;
				}

			}
			if(al.get(i).contains("*")) {
				su1=su1*2;
			}
			try {
				if(al.get(i+1).contains("*")) {
					su1=su1*2;
				}
			}catch (Exception e) {
			}
			answer+=su1;
		}
		return answer;
	}
}
public class n19_다트게임 {
	public static void main(String[] args) {
		Solution19 a = new Solution19();
		String dartResult = "1S2D*3T";
		System.out.println(a.solution(dartResult));
	}

}
