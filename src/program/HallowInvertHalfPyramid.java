package program;

public class HallowInvertHalfPyramid {

	public static void draw(int row) {

		for (int i = 0; i < row; i++) {
			for (int j = row; j > i; j--) {
				if (i == 0 || i == row - 1)
					System.out.print("*");
				else {
					if (!(j == row || j== i+1))
						System.out.print(" ");
					else {
						System.out.print("*");
					}

				}

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		draw(4);
	}

}
