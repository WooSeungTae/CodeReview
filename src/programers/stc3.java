package programers;

import java.util.ArrayList;
import java.util.HashSet;

class Solutionstc3 {
	public int solution(int[] numbers) {
		int answer = 0;
		HashSet<Integer> num = new HashSet<Integer>();
		for(Integer n:numbers)num.add(n);
		ArrayList<Integer> numset= new ArrayList<Integer>(num);
		for(int i=0;i<numset.size();i++) {
			int count=0;
			for(int k=0;k<numbers.length;k++) {
				if(numset.get(i)==numbers[k])count++;
			}
			if(count>(numbers.length/2)) {
				answer=numset.get(i);
				break;
			}else {answer=-1;}
		}
		
		return answer;
	}
}
public class stc3 {
	public static void main(String[] args) {
		int[] numbers = {6,1,6,6,7,6,6,7};
		Solutionstc3 a = new Solutionstc3();
		System.out.println(a.solution(numbers));
		
		
	}
}
