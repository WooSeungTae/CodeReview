package programers;
class Solution16 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for(int i =0;i<n;i++) {
			answer[i]=Long.parseLong(Integer.toBinaryString(arr1[i]))+Long.parseLong(Integer.toBinaryString(arr2[i]))+"";
			answer[i]=String.format("%"+n+"s", answer[i]);
			answer[i]=answer[i].replace("0", " ");
			answer[i]=answer[i].replace("1", "#");
			answer[i]=answer[i].replace("2", "#");
		}

		return answer;
	}
}
public class n161차비밀지도 {
	public static void main(String[] args) {
//		int n =5;
//		int []arr1={9,20,28,18,11};
//		int []arr2= {30,1,21,17,28};
//		Solution16 a = new Solution16();
//		for(int i =  0; i <n;i++) {
//			System.out.print(a.solution(n, arr1, arr2)[i]+",");
//		}
		int a = 3262;
		int b = 43;
		System.out.println(Integer.toBinaryString(a));
		String d=Integer.toBinaryString(a);
		System.out.println(d);
		System.out.println(Integer.toBinaryString(b));
		long c = Long.parseLong(Integer.toBinaryString(a))+Long.parseLong(Integer.toBinaryString(b));
		System.out.println(c);
//		c = String.format("%16s", c);
//		c= c.replaceAll("2", "#");
//		c= c.replaceAll("1", "#");
//		c= c.replaceAll("0", " ");
		System.out.println(c);
		
				

	}
}
