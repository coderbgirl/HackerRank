package Strings;

public class PangramBetter {

		public static void main(String[] args) {

			String input = "The quick brown fox jumps over lazy dog";
			int bits = 0;
			int check = 0;

			input = input.toLowerCase();

			for (int i = 0; i < input.length(); i++) {

				if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
					bits |= (1 << (input.charAt(i) - 'a'));
			}

			for (int i = 0; i <= 26; i++) {

				check |= (1 << i);
			}

			if (bits == check)
				System.out.println("Pangram");
			else
				System.out.println("Not Pangram");
		}

	}

