package program;

public class HalfPyramid {

	public static void draw(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		draw(10);
	}

}
