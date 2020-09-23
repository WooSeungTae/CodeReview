package programers;
class Solution5 {
	public String solution(String s, int n) {
		String answer = "";
		char [] a = s.toCharArray();

		for(int i = 0 ; i <a.length;i++) {
			if(a[i]==32) {
				a[i]=32;
				answer+=a[i];
			}else if(a[i]<97) {
				if(a[i]+n >90) {
					a[i]=(char) (a[i]-26+n);
					answer+=a[i];
				}else{
					a[i]=(char) (a[i]+n);
					answer+=a[i];
				}
			}else {
				if(a[i]+n>122) {
					a[i]=(char) (a[i]-26+n);
					answer+=a[i];
				}else{
					a[i]=(char) (a[i]+n);
					answer+=a[i];
				}
			}	
		}
		return answer;
	}
}
public class n5시저암호 {
	public static void main(String[] args) {
		Solution5 a = new Solution5();
		int n= 25;
		String s = "AaZz";
		System.out.println(a.solution(s, n));
		System.out.println(Character.isLowerCase(s.charAt(0)));
	}
}
