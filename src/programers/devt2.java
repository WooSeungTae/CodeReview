package programers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Solutiondevt2 {
	public String solution(String p,int n) {
		DateFormat timeform = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String[] pset = p.split(" ");
		String psetTime = pset[1];
		String answer = "";
		int fst=Integer.parseInt((pset[1].substring(0,2)));
		try {
		Date setD = timeform.parse(psetTime);
		setD = timeform.parse(psetTime);
			if(pset[0].equals("PM")) {
				if(fst>=12) {
					cal.setTime(setD);
					cal.add(Calendar.SECOND,n);
					answer = timeform.format(cal.getTime());
				}else {
					cal.setTime(setD);
					cal.add(Calendar.HOUR,12);
					cal.add(Calendar.SECOND,n);
					answer = timeform.format(cal.getTime());
				}
			}else {
				if(fst>=12) {
					cal.setTime(setD);
					cal.add(Calendar.HOUR,-12);
					cal.add(Calendar.SECOND,n);
					answer = timeform.format(cal.getTime());
				}else {
					cal.setTime(setD);
					cal.add(Calendar.SECOND,n);
					answer = timeform.format(cal.getTime());
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(answer);
		return answer;
	}
}
public class devt2 {
	public static void main(String[] args) {
		Solutiondevt2 a = new Solutiondevt2();
		String p = "PM 12:00:01";
		int n = 10;
		System.out.println(a.solution(p, n));
	}
}
