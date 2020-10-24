package programers;

public class test1111 {
	private static int isnotnum(Character b){
		if(b<48 || b>57)return 1; //문자
		return 0; //숫자
	}
	private static String replaceMath(String a) {
		String b ="";
		if(isnotnum(a.charAt(0))==0) {
			if(a.substring(1,2).equals("(")) {
				a=a.replace(a.substring(1,a.indexOf(")")+1), a.substring(2,a.indexOf(")")));
				for(int i =0;i<Integer.parseInt(a.substring(0,1));i++) {
					b+=a.substring(1);
				}
			}else {
				for(int i=0;i<Integer.parseInt(a.substring(0,1));i++) {
					b+=a.charAt(1)+"";
				}
			}
		}
		return b;
	}

	public void af(String a){

	}
	public static void main(String[] args) {
		String a = "3(2(gd))";
		for(int i=0;i<a.length();i++) {
			String c = a.charAt(i)+"";
			String b="";
			if(i<a.length()-2 && isnotnum(a.charAt(i))==0 && !(a.substring(i+1,i+2).equals("("))) {
				for(int j=0;j<Integer.parseInt(a.substring(i,i+1));j++){
					b+=a.substring(i+1,i+2);
				}
				a=a.replace(a.substring(i,i+2),b);
			}
			if(c.equals(")")){
				for(int q=i;q>0;q--) {
					if(a.substring(q,q+1).equals("(")) {
						for(int w = 0;w<Integer.parseInt(a.substring(q-1,q));w++) {
							b+=a.substring(q+1, i);
						}
						a=a.replace(a.substring(q-1,i+1),b);
					}
				}
			}
		}	
		System.out.println(a);



	}
}
