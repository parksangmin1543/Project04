package loop.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		for (int i = 3; i < 8; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
	}
}
