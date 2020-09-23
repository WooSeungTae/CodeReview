package programers;
import java.util.*;
import java.io.*;


class Main1 {
	
	// 아래 메서드의 내용을 수정 작성하여 완성해 주세요.
	public int[] solution(int[] a, int[] b) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		ArrayList<Integer>al2 = new ArrayList<Integer>();
		for(Integer k : b) {
			al2.add(k);
		}
		for(int i = 0;i<a.length;i++) {
			for(int k =0;k<al2.size();k++) {
				if(a[i]==al2.get(k)) {
					al.add(a[i]);
					al2.remove(al2.indexOf(al2.get(k)));
				}
			}
		}
	
		int[] c = new int [al.size()];
		for(int i = 0; i<al.size();i++) {
			c[i]=al.get(i);
		}
		return c;
	}
}
public class sam1 {
	public static void main(String[] args) throws Exception {
		Main1 main = new Main1();
		int[] a = {1,2,2,3,3,3};
		int[] b = {2,3,3,4,5};
		int[] result = main.solution(a,b);
				System.out.println(Arrays.toString(result));
	}

}
