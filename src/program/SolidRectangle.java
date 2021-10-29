package program;

public class SolidRectangle {

//	****
//	****
//	****

	public static void draw(int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		draw(3, 4);
	}
}
