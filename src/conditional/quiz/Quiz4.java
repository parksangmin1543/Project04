package conditional.quiz;

public class Quiz4 {
	public static void main(String[] args) {
		int month = 11;
		
		if (3 >= month && month <= 5)
			System.out.println("현재 계절은 봄입니다.");
		else if (6 >= month && month <= 8)
			System.out.println("현재 계절은 여름입니다.");
		else if (9 >= month && month <= 11)
			System.out.println("현재 계절은 가을입니다.");
		else if (12 == month || month == 1 || month == 2)
			System.out.println("현재 계절은 겨울입니다.");
		else 
			System.out.println("월이 잘못되었습니다.");
	}
	
}