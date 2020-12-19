package programers;


class Solutionest1 {

	public int checknumber(String a) {
		if(a.length()==16 || a.length()==19) {
			a=a.replace("-", "");
			if(a.length()==16) {
				return 1;
			}else {
				return 0;
			}
		}else {
			return 0;
		}
	}

	public int[] solution(String[] card_numbers) {
		int[] answer = new int[card_numbers.length];
		int sumeven =0;
		int odd =0;

		for(int i=0;i<card_numbers.length;i++) {
			sumeven =0;
			odd =0;
			if(checknumber(card_numbers[i])==1) {
				card_numbers[i]=card_numbers[i].replace("-", "");
				for(int j=1;j<=card_numbers[i].length();j++) {
					int k=Integer.parseInt(card_numbers[i].substring(j-1,j));
					System.out.println(k);
					if(j%2!=0) {
						if(k*2<10) {
							sumeven+=k*2;
						}else {
							int ksum=k*2%10+1;
							sumeven+=ksum;
						}
					}else {
						odd+=k;
					}
				}
				System.out.println(i+"번째 1번 : "+sumeven +"  2번 : "+odd+" = " +(sumeven+odd));
				answer[i]=((odd+sumeven)%10==0)?1:0;
			}else {
				answer[i]=0;
			}
		}
		return answer;
	}
}
public class est {
	public static void main(String[] args) {
		String [] card_numbers = {"3285-3764-9934-2453", "3285376499342453", "3285-3764-99342453", "328537649934245", "3285376499342459", "3285-3764-9934-2452"};
		Solutionest1 cv= new Solutionest1();
		for(Integer c:  cv.solution(card_numbers))
			System.out.println(c);;
			
			int d=10;
			System.out.println(d%10+1);
	}
}
