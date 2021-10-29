package program;

public class HallowRectangle {

	public static void draw(int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (i == 0 || i == row - 1)
					System.out.print("*");
				else {
					if (j == 0 || j == column - 1)
						System.out.print("*");
					else {
						System.out.print(" ");
					}

				}
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		draw(4,7);
	}

}
