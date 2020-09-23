package programers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Solution2 {
	public long solution(long n) {
		long answer = 0;
		TreeMap<Integer,Integer> tm = new  TreeMap<Integer, Integer>();
		HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for(int i = 0;i<=10;i++) {
			al.add((int)Math.pow(3, i));
			tm.put((int)Math.pow(3, i), i);
		}
		
		
		for(int i=0;i<al.size()-1;i++) {
			for(int k=i+1;k<al.size();k++) {
				tm.put(al.get(i)+al.get(k),k);
			}
		}
		for(Integer a:tm.keySet()) {
			al2.add(a);
		}
		
		return answer;
	}
}
public class t2프로그래밍2 {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> tm = new  TreeMap<Integer, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i = 0;i<=10;i++) {
			al.add((int)Math.pow(3, i));
			tm.put((int)Math.pow(3, i), i);
		}
		for(int i=0;i<al.size()-1;i++) {
			for(int k=i+1;k<al.size();k++) {
				tm.put(al.get(i)+al.get(k),k);
			}
		}
		for(Integer a:tm.keySet()) {
			al2.add(a);
		}
		System.out.println(al);
	}
}
