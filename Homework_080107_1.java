import java.util.Scanner;
public class Homework_080107_1{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		int wages = scanner.nextInt();
		
		if(wages <= 5000){
			double realWages = wages-5000*11/100;
			System.out.println("实际工资为："+realWages);
		}else if(wages >= 5001 & wages <= 8000){
			double realWages = wages-(wages-5000)*3/100-wages*11/100;
			System.out.println("实际工资为："+realWages);
		}
		else if(wages >= 8001 & wages <= 17000){
			double realWages = wages-(wages-5000)*10/100-wages*11/100;
			System.out.println("实际工资为："+realWages);
		}
		else if(wages >= 17001 & wages <= 30000){
			double realWages = wages-(wages-5000)*20/100-wages*11/100;
			System.out.println("实际工资为："+realWages);
		}else if(wages >= 30001 & wages <= 40000){
			double realWages = wages-(wages-5000)*25/100-wages*11/100;
			System.out.println("实际工资为："+realWages);
		}
		else if(wages >= 40001 & wages <= 60000){
			double realWages = wages-(wages-5000)*30/100-wages*11/100;
			System.out.println("实际工资为："+realWages);
		}
		else if(wages >= 60001 & wages <= 85000){
			double realWages = wages-(wages-5000)*35/100-wages*11/100;
			System.out.println("实际工资为："+realWages);
		}else{
			double realWages = wages-(wages-5000)*45/100-wages*11/100;
			System.out.println("实际工资为："+realWages);
		}
	}
}