package conditional.quiz;

public class Quiz5 {
	public static void main(String[] args) {
		String rank = "1";
		
		switch(rank) {
		case "1":
			System.out.println("금메달");
			break;
		case "2":
			System.out.println("은메달");
			break;
		case "3":
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
	}
}
