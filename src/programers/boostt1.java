package programers;

import java.util.ArrayList;

class st {
	public boolean solution(String [] name_list) {
		boolean answer = true;
		int cnt =0;
		
		for(int i = 0 ; i <name_list.length;i++) {
			System.out.println("���� �̸� : "+name_list[i]);
			cnt=0;
			for(int k = 0 ; k<name_list.length;k++) {
				System.out.println("���� ����� : "+name_list[k]);
				if(name_list[k].contains(name_list[i])) {
					cnt++;
					System.out.println("���Ƽ� cnt �߰� : "+cnt);
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
			String [] name_list = {"����","����","�ʱ�"};
			String [] name_list2 = {"��","����","����"};
			String [] name_list3 = {"�ʱ�","�ʿ�","����","����"};
		System.out.println(a.solution(name_list));
		 
			
			
		}
}
