package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solutionstc5 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(Integer o : arr)hs.add(o);
		ArrayList<Integer> al2 = new ArrayList<Integer>(hs);
		for(int i =0;i<al2.size();i++) {
			int count =0;
			for(int k=0;k<arr.length;k++) {
				if(al2.get(i)==arr[k])count++;
				if(count>=2)break;
			}
			if(count==1)al.add(al2.get(i));
		}
		int su=1;
		if(al.size()>0)su=al.size();
		int answer [] = new int[su];
		if(al.size()>0) {	
			for(int i =0;i<al.size();i++) {
				answer[i]=al.get(i);
			}
		}else {
			answer[0]=-1;
		}
		Arrays.sort(answer);
		return answer;
		}
		
}
public class stc5 {
	public static void main(String[] args) {
		Solutionstc5 a = new Solutionstc5();
		int[] arr= {3,4,4,2,5,2,5,5};
		a.solution(arr);
		int d [] = new int[0];
	}
}
