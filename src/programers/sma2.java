package programers;
import java.io.*;
import java.util.HashSet;

class ma{
	public double solution(int l, int[] a) {
		double d = 1;
		while(true) {
			HashSet<Integer> hs = new HashSet<Integer>();
			for(int k=0;k<a.length;k++) {
 				for(int i=0;i<=d;i++) {
					if(a[k]+i>0 && a[k]+i<=l) {
						System.out.println(a[k]+i);
						hs.add(a[k]+i);
					}
					if(a[k]-i>0 && a[k]-i<=l) {
						System.out.println(a[k]-i);
						hs.add(a[k]-i);
					}
				}
			}
			System.out.println(hs);
			if(hs.size()==l) {
				break;
			}
			d++;
			System.out.println("D´Â : "+d);
		}
		return d;
	}
}

public class sma2 {
	public static void main(String[] args) {
		ma d = new ma();
		int l=10;
		int [] a = {2,3,9};
		System.out.println(d.solution(l, a));
		
	}
}
