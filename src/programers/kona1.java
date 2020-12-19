package programers;


public class kona1 {
	
	public int solutionka1(String[][] board) {
		int answer =0;
		int i=0;
		int k=0;
		String a = board[i][k];
		String []c = {board[i][k+1],board[i][k-1],board[i+1][k],board[i-1][k]};
		String min=c[0];
		for(int q=0;q<c.length;q++) {
			if(min.compareTo(c[q])>0)min=c[q];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String [] a = {"a","b","e","y","q"};
		String max = a[0];
		String min = a[0];
		for(int i=0;i<a.length;i++) {
			if(max.compareTo(a[i])<0)max=a[i];
			if(min.compareTo(a[i])>0)min=a[i];
		}
		System.out.println(min);
	}
}
