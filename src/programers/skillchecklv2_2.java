package programers;

import java.util.ArrayList;

class Solutions2_2 {
	public int solution(String s) {
		int answer = 0;
		int cnt=0;
		String cnt1="";
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1000);
		for(int a=s.length()/2;a>=1;a--) {
			ArrayList<String> al = new ArrayList<String>();
			int i=(s.length()%a==0)?s.length()/a:s.length()/a+1;
			al.add(s.substring(0, a).trim());
			for(int b=1;b<i;b++) {
				int d = a*(b+1);
				if(d>s.length())d=s.length();
				al.add(s.substring(b*a,d).trim());
			}
			ArrayList<String> al1 = new ArrayList<String>();
			for(int e=0;e<al.size();e++) {
				if(e+1<al.size()) {
					if(al.get(e).equals(al.get(e+1))) {
						al.remove(e+1);
						cnt++;
						e--;
					}else {
						if(cnt==0) {
							cnt1="";
						}else {
							cnt1=cnt+1+"";
						}
						al1.add(cnt1+al.get(e));
						cnt=0;
					}
				}else {
					if(e-1>0) {
						if(!al.get(e).equals(al.get(e-1))){
						}
						if(cnt==0) {
							cnt1="";
						}else {
							cnt1=cnt+1+"";
						}
						al1.add(cnt1+al.get(e));
						cnt=0;
					}else {
						if(cnt==0) {
							cnt1="";
						}else {
							cnt1=cnt+1+"";
						}
						al1.add(cnt1+al.get(e));
						cnt=0;
					}
				}
			}
			String su="";
			for(String c: al1) {
				su+=c;
			}
			if(al2.get(0)>su.length()) {
				al2.remove(0);
				al2.add(su.length());
			}

		}
		answer=al2.get(0);
		if(s.length()==1)answer=1;
		return answer;
	}
}
public class skillchecklv2_2 {
	public static void main(String[] args) {
		Solutions2_2 c = new Solutions2_2();
		String s = "a";
		System.out.println(c.solution(s));


	}
}
