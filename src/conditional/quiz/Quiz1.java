package conditional.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		int i = 11;
		
		if ((i % 2 == 0) || (i % 3 == 0))
			System.out.println("2 또는 3의 배수입니다.");
		else
			System.out.println("2 또는 3의 배수가 아닙니다.");
	}
	
}