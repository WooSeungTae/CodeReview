package programers;
class Solutionka1 {
	public String solution(String new_id) {
		new_id=new_id.toLowerCase();
		String pun = "~!@#$%^&*()=+[{]}:?,<>";
		String[] puncts = pun.split(""); 
		for(int i=0;i<puncts.length;i++) {
			if(new_id.contains(puncts[i])) {
				new_id=new_id.replace(puncts[i],"");
				}
		}
		for(int i=0;i<new_id.length();i++) {
			if(i<new_id.length()-1&&((new_id.charAt(i)+"").equals(".")&&(new_id.charAt(i+1)+"").equals("."))) {
				new_id=new_id.replace((new_id.charAt(i)+"")+(new_id.charAt(i+1)+""),".");
				i--;
			}
		}
		if((new_id.charAt(0)+"").equals("."))new_id=new_id.substring(1);
		if(new_id.length()<1)new_id="a";
		if((new_id.charAt(new_id.length()-1)+"").equals("."))new_id=new_id.substring(0,new_id.length()-1);
		if(new_id.length()>=16) {
			new_id=new_id.substring(0,15);
			if((new_id.charAt(new_id.length()-1)+"").equals("."))new_id=new_id.substring(0,new_id.length()-1);
		}
		if(new_id.length()<=2) {
			while(true) {
				new_id+=(new_id.charAt(new_id.length()-1)+"");
				if(new_id.length()==3)break;
			}
		}
		String answer = new_id;
		return answer;
	}
}
public class kakao2020_1 {
	public static void main(String[] args) {
		Solutionka1 k = new Solutionka1();
		String new_id="2352*****";
		System.out.println(k.solution(new_id));

	}
}
