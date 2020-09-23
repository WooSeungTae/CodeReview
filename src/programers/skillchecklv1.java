package programers;
class Solutions1 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int [arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int k = 0;k<arr1[0].length;k++) {
				answer[i][k]=answer[i][k]+arr1[i][k]+arr2[i][k];
			}
		}
		
		
		return answer;
	}
}
public class skillchecklv1 {
	public static void main(String[] args) {
		Solutions1 a = new Solutions1();
	}
}
