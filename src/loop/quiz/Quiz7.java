package loop.quiz;

public class Quiz7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 != 0)
					System.out.println(i + "X" + j + "=" + i*j);
			}
		}
		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 0)
				continue;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
		for (int i = 3; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}
}
