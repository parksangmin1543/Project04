package loop.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
			if (sum >= 500) {
				System.out.println("마지막으로 더한 숫자는?  "+ i);				
				System.out.println("총합은?  "+sum);				
				break ;
			}
		}
	}
}
