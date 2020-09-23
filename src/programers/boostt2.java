package programers;

import java.util.ArrayList;

class st1{
	ArrayList<Integer> alA = new ArrayList<Integer>();
	ArrayList<Integer> alB = new ArrayList<Integer>();
	ArrayList<Integer> alAcopy = new ArrayList<Integer>();
	ArrayList<Integer> alABsum = new ArrayList<Integer>();
	ArrayList<Integer> alABcom = new ArrayList<Integer>();
	ArrayList<Integer> alABinter = new ArrayList<Integer>();
	
	public int sum(ArrayList<Integer>alA, ArrayList<Integer>alB) {
		for(int i =0; i<alB.size();i++) {
			if(!alAcopy.contains(alB.get(i))) {
				alABsum.add(alB.get(i));
			}
		}
		return alABsum.size();
	}
	
	public int complement(ArrayList<Integer>alA, ArrayList<Integer>alB) {
		for(int i =0; i<alB.size();i++) {
			if(alAcopy.contains(alB.get(i))) {
				alABcom.remove(alB.get(i));
			}
		}
		return alABcom.size();
	}


	public int intersect(ArrayList<Integer>alA, ArrayList<Integer>alB) {
		for(int i =0; i<alB.size();i++) {
			if(alAcopy.contains(alB.get(i))) {
				alABinter.add(alB.get(i));
			}
		}
		return alABinter.size();
	}
	
	
	public int[] solution(int [] arrayA, int[] arrayB) {
		int[] answer = new int [5];
		if(arrayA ==null) {
			answer[0]=0;
			answer[2]=arrayB.length;
			answer[3]=0;
			answer[4]=0;
		}else {
			for(int i =0; i<arrayA.length;i++) {
				if(!alA.contains(arrayA[i]))alA.add(arrayA[i]);
			}
			answer[0]= alA.size();
		}
		if(arrayB == null) {
			answer[1] =0;
			answer[2]=arrayA.length;
			answer[3]=arrayA.length;
			answer[4]=0;
		}else {
		for(int i =0; i<arrayB.length;i++) {
			if(!alB.contains(arrayB[i]))alB.add(arrayB[i]);
		}
		answer[1]=alB.size();
		}
	
		for(Integer c : alA) {
			alAcopy.add(c);
			alABsum.add(c);
			alABcom.add(c);
		}
		
		answer[2]=sum(alA, alB);		
		answer[3]=complement(alA, alB);
		answer[4]=intersect(alA, alB);
		return answer;
	}
}

public class boostt2 {
	public static void main(String[] args) {
		st1 a = new st1();
		int [] arrayA = {2,3,4,3,5};
		int[] arrayB = {1,6,7};
		a.solution(arrayA, arrayB);
		
	}
}
