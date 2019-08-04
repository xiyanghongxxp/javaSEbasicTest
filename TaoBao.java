import java.util.Random;


public class TaoBao{
	public static void main(String []args){
		Random random = new Random();
		int num4 = random.nextInt(26)+65;
		System.out.println((char)num4);
	}
}