package programers;

import java.util.ArrayList;

class st {
	public boolean solution(String [] name_list) {
		boolean answer = true;
		int cnt =0;
		
		for(int i = 0 ; i <name_list.length;i++) {
			System.out.println("비교할 이름 : "+name_list[i]);
			cnt=0;
			for(int k = 0 ; k<name_list.length;k++) {
				System.out.println("비교할 대상자 : "+name_list[k]);
				if(name_list[k].contains(name_list[i])) {
					cnt++;
					System.out.println("같아서 cnt 추가 : "+cnt);
				}
			}
			if(cnt>=2) {
				answer=true;
				break;
			}else {
				answer=false;
			}
		}

		return answer;
	}
	
}

	public class boostt1 {
		public static void main(String[] args) {
			st a = new st();
			String [] name_list = {"가을","우주","너굴"};
			String [] name_list2 = {"봄","여울","봄봄"};
			String [] name_list3 = {"너굴","너울","여울","서울"};
		System.out.println(a.solution(name_list));
		 
			
			
		}
}
