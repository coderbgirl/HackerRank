package General;


public class TicTacToe {

	char[][] board = new char[3][3];

	public void print() {

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 'O' || board[i][j] == 'X') {
					System.out.print(board[i][j]);

				} else {

					System.out.print("-");
				}
				if (j < 2)
					System.out.print("|");

			}
		}

	}

	public void add(char input, int x, int y) {

		board[x][y] = input;

	}

	public static void main(String[] args) {

		TicTacToe t1 = new TicTacToe();

		t1.add('X', 0, 0);
		t1.add('O', 1, 1);
		t1.add('X', 1, 2);
		t1.print();

		TicTacToe t2 = new TicTacToe();

		System.out.println();
		System.out.println();
		System.out.println();

		t2.add('O', 0, 0);
		t2.add('X', 1, 1);
		t2.add('O', 1, 2);
		t2.print();

	}

}
