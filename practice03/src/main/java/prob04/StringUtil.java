package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String reuslt = "";
		for(int i = 0 ; i < strArr.length; i++) {
			reuslt+= strArr[i];
		}
			
		return reuslt;
	}
}
