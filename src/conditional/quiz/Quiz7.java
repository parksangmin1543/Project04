package conditional.quiz;

public class Quiz7 {
	public static void main(String[] args) {
		int score = 70;
		
		if (score >= 90 && score <= 99)
			score = 90;
		else if (score >= 80 && score <= 89)
			score = 80;
		else if (score >= 70 && score <= 79)
			score = 70;
		else
			score = 0;
		
		switch (score) {
		case (90):
			System.out.println("수");
			break;
		case (80) :
			System.out.println("우");
			break;
		case (70) :
			System.out.println("미");
			break;
		default:
			System.out.println("양");
		}
	}
}
