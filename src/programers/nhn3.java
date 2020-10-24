
package programers;

import java.util.Scanner;

class nhn3{
	private static void solution(int numOfOrder, String[] orderArr) {
		for(int i=0;i<orderArr.length;i++) {
			for(int j=0;j<orderArr[i].length();j++) {
				String b="";
				String c = orderArr[i].charAt(i)+"";
				if(i<orderArr[i].length()-2 && isnotnum(orderArr[i].charAt(i))==0 && !(orderArr[i].substring(i+1,i+2).equals("("))) {
					for(int k=0;k<Integer.parseInt(orderArr[i].substring(i,i+1));k++){
						b+=orderArr[i].substring(i+1,i+2);
					}
					orderArr[i]=orderArr[i].replace(orderArr[i].substring(i,i+2),b);
				}
				if(c.equals(")")){
					for(int q=i;q>0;q--) {
						if(orderArr[i].substring(q,q+1).equals("(")) {
							for(int w = 0;w<Integer.parseInt(orderArr[i].substring(q-1,q));w++) {
								b+=orderArr[i].substring(q+1, i);
							}
							orderArr[i]=orderArr[i].replace(orderArr[i].substring(q-1,i+1),b);
						}
					}
				}
			}
			
		}

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

	private static int isnotnum(Character b){
		if(b<48 || b>57)return 1; //문자
		return 0; //숫자
	}

	private static class InputData {
		int numOfOrder;
		String[] orderArr;
	}

	private static InputData processStdin() {
		InputData inputData = new InputData();

		try (Scanner scanner = new Scanner(System.in)) {
			inputData.numOfOrder = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

			inputData.orderArr = new String[inputData.numOfOrder];
			for (int i = 0; i < inputData.numOfOrder; i++) {
				inputData.orderArr[i] = scanner.nextLine().replaceAll("\\s+", "");
			}
		} catch (Exception e) {
			throw e;
		}

		return inputData;
	}

	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();

		solution(inputData.numOfOrder, inputData.orderArr);
	}
}