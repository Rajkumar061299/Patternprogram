package program;

public class FullPyramid {

	public static void draw(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= 2 * row - 1; j++) {
				if ((j >= row - (i - 1)) && (j <= row + (i - 1)))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		draw(6);
	}

}
