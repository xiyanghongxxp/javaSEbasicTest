package homework;
import java.util.Scanner;
public class Homework_080105{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score > 100 || score < 0){
			System.out.println("super man");
		}else if(score >= 90 & score <= 100){
			System.out.println("优秀");
		}else if(score >= 80 & score < 90){
			System.out.println("良");
		}else{
			System.out.println("不及格");
		}
	}
}