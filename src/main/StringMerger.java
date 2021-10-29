package main;

public class StringMerger {

	public static boolean isMerge(String s, String part1, String part2) {

		return s.isEmpty() || part1.isEmpty() || part2.isEmpty() ? s.equals(part1 + part2)
				: s.charAt(0) == part1.charAt(0) && isMerge(s.substring(1), part1.substring(1), part2)
						|| s.charAt(0) == part2.charAt(0) && isMerge(s.substring(1), part1, part2.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMerge("codewars", "c   d   w         ", "    o   e   a r s   "));
	}

}
