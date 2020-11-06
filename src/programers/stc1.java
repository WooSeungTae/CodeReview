package programers;

class Solutionstc1 {
    public String solution(int num) {
        String answer = "";
        String numst=num+"";
        for(int i=0;i<numst.length();i++) {
			String k=numst.substring(i,i+1);
			if(k.equals("0"))k="zero";
			if(k.equals("1"))k="one";
			if(k.equals("2"))k="two";
			if(k.equals("3"))k="three";
			if(k.equals("4"))k="four";
			if(k.equals("5"))k="five";
			if(k.equals("6"))k="six";
			if(k.equals("7"))k="seven";
			if(k.equals("8"))k="eight";
			if(k.equals("9"))k="nine";
			answer+=k;
        }
        return answer;
    }
}
public class stc1 {
	public static void main(String[] args) {
		int a = 123;
		String ab= a+"";
		String c="";
		
		for(int i =0;i<ab.length();i++) {
			String k=ab.substring(i,i+1);
			if(k.equals("0"))k="zero";
			if(k.equals("1"))k="one";
			if(k.equals("2"))k="two";
			if(k.equals("3"))k="three";
			if(k.equals("4"))k="four";
			if(k.equals("5"))k="five";
			if(k.equals("6"))k="six";
			if(k.equals("7"))k="seven";
			if(k.equals("8"))k="eight";
			if(k.equals("9"))k="nine";
			c+=k;
		}
		System.out.println(c);
	}
}
