package main;

import java.util.ArrayList;
import java.util.List;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {

		List<Integer> list = new ArrayList<>();

		for (int element : elements) {
			int count = (int) list.stream().filter(i -> i == element).count();
			if (count < maxOccurrences)
				list.add(element);
		}

		return list.stream().mapToInt(num -> num).toArray();
	}

	public static void main(String[] args) {

		System.out.println(deleteNth(new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3));
	}
}
