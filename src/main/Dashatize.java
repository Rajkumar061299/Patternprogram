package main;

public class Dashatize {

	public static String dashatize(int num) {
		String s = String.valueOf(num);
		System.out.println(s.replaceAll("([13579])", "-$1-")); // 2-1-4-7-48-3-64-7-
		System.out.println(s.replaceAll("([13579])", "-$1-").replaceAll("--", "-")); // 2-1-4-7-48-3-64-7-
		System.out.println(s.replaceAll("([13579])", "-$1-").replaceAll("--", "-").replaceFirst("^-", ""));//2-1-4-7-48-3-64-7-


		return s.replaceAll("([13579])", "-$1-").replaceAll("--", "-").replaceFirst("^-", "").replaceFirst("-$", "");
	}

	public static void main(String[] args) {
		System.out.println(dashatize(Integer.MAX_VALUE));
	}

}
