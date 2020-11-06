package programers;

import java.util.Arrays;
class Solutionstc2 {
    public int solution(int[] bombs) {
        int answer = 0;
        Arrays.sort(bombs);
        int timebombs = 1;
        for(int i=0;i<bombs.length;i++) {
        	if(timebombs<=bombs[i]) {
        		answer++;
        		timebombs++;
        	}else {break;}
        }
        return answer;
    }
}
public class stc2 {
	public static void main(String[] args) {
		int a[] = {1,4,3,2,0};
		Arrays.sort(a);
		
	}
}
