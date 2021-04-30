package chapter04;

public class StringTest03 {

	public static void main(String[] args) {

		String s = "aBcABCabcABC";

		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 3));
		System.out.println(s.indexOf("abc", 7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 5));

		String s2 = "                ab              c              ";
		String s3 = "efg,hijk,lmn,opqr";
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println("--------------" + s2.trim() + "-------------------------");
		System.out.println("-------------------" + s2.replaceAll(" ", "") + "---------------------");

		// regular expression 사용 예
		String p = "12345678";
		if (p.matches("\\d+")) {
			int price = Integer.parseInt(p);
			System.out.println(price);

		} else {
			
		System.out.println("유효한 금액이 NO");
		}
		
		String[] tokens1 = s3.split(",");
		for(String g: tokens1) {
			System.out.println(g);
		}
		
		String[] tokens2 = s3.split("...");
		for(String g: tokens2) {
			System.out.println(g);
		}
		
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("World ");
		sb.append("Java ");
		sb.append(1.8);
		String s5 = sb.toString();
		System.out.println(s5);
		
		
		
		//String s6 ="Hello " + "World " +" Java " + 1.8;
		String s6 = new StringBuffer("Hello ").append("World ").append("Java").toString();
		
		/*
		 * String s7 =""; // 주의: 문자열 + 연산을 하지 말아야 할 때 for(int i = 0 ; i < 100000; i++) {
		 * s7 += i;
		 * 
		 * }
		 */
		StringBuffer sb3 = new StringBuffer("");
		for(int i = 0 ; i < 10000000; i++) {
		sb3.append(i);	
		}
		String s7 = sb3.toString();
		
		System.out.println(s6);

		
	}

}
