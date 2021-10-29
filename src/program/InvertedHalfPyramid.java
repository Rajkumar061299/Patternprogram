package program;

public class InvertedHalfPyramid {

	public static void draw(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		draw(10);
	}

}
