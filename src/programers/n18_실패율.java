package programers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


class Solution18 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int [N];
		double su = stages.length;
		int cnt =0;
		ArrayList<Integer> al =  new ArrayList<Integer>();
		TreeMap<Integer,Double> tm = new TreeMap<Integer, Double>();
		for(Integer d : stages) {
			al.add(d);
		}
		for(int i = 1;i<=N;i++) {
			cnt=0;
			for(int k = 0 ; k <al.size();k++) {
				if(i==al.get(k)) {
					cnt++;
				}
			}
			if(cnt==0) {
				tm.put(i, 0.0);
			}else {
			tm.put(i, cnt/su);
			}
			su=su-cnt;
				
		}
			List<Map.Entry<Integer,Double>> list  = new LinkedList<Map.Entry<Integer,Double>>(tm.entrySet());
			Collections.sort(list, new Comparator<Map.Entry<Integer,Double>>() {
				@Override
				public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
					if(o1.getValue() < o2.getValue()) {
						return 1;
					}else if(o1.getValue() > o2.getValue()) {
						return -1;
					}
					return 0;
				}
			});
			for(int i = 0 ; i<list.size();i++) {
				answer[i]= list.get(i).getKey();
			}
			System.out.println(list);
			return answer;
	}
}


public class n18_½ÇÆÐÀ² {
	public static void main(String[] args) {
		Solution18 a = new Solution18();
		int N = 4;
		int [] stages = {4,4,4,4,4};
		System.out.println(a.solution(N, stages));

	}
}
