import java.util.Scanner;

public class Homework_0805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("控制流程练习");
		System.out.println("请选择题号：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch(a/1){
			case 1:{
				System.out.println("练习一");
				int b = scanner.nextInt();
				if(b%2==0) {
					System.out.println("您输入的是偶数："+b);
					}else {
						System.out.println("您输入的是："+b);
					}
				}
				break;
			
			case 2:{
				System.out.println("练习二");
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				if(b>c) {
					System.out.print(b);
				}else {
					System.out.print(c);
				}
				break;
			}
			case 3:{
				System.out.println("练习三");
				int i = 1;
				int sum =0;
				
				while(i<=100){
					 sum += i;
					 i++;
				}System.out.println("100内相加和为："+sum);
				break;
			}
			case 4:{
				System.out.println("练习四");
				int sum4=0;
				for(int i=0;i<=100;i++) {
					sum4+=i;
				}System.out.print(sum4);
				break;
			}
			case 5:{
				System.out.println("练习四-1");
				int sum4=0;
				for(int i=0;i<=100;i++) {
					if(i%2==1) {
						sum4+=i;
					}
				}System.out.print(sum4);
				break;
				
			}
			case 6:{
				System.out.println("练习三-2");
				
					 
					 
				
				break;
			}
			case 7:{
				System.out.println("练习三-3");
				int i = 1;
				int sum =0;
				
				while(i<=100){
					 sum += i;
					 i++;
				}System.out.println("100内相加和为："+sum);
				break;
			}
			case 8:{
				System.out.println("课后作业.1");
				System.out.print("请输入您的年薪：");
				double m = scanner.nextDouble();
				double realM = 0;
				if(m<100000) {
					realM=m*10%+m;
				}else if(m>100000 && m<=200000) {
					realM=(m-100000)*7.5%+m;
				}else if(m>200000 && m<=400000) {
					realM=(m-200000)*5%+m;
				}else if(m>400000 && m<=600000) {
					realM=(m-400000)*3%+m;
				}else if(m>600000 && m<=1000000) {
					realM=(m-600000)*1.5%+m;
				}else if(m>10000000) {
					realM=(m-10000000)*1%+m;
				}
				System.out.print(realM);
				break;
			}
			case 9:{
				System.out.println("课后作业.2");
				int r = scanner.nextInt();
				switch(r/10) {
				case 9:System.out.print("A");
				case 8:System.out.print("B");
				case 7:System.out.print("C");
				case 6:System.out.print("D");
				default:System.out.print("E");
				
				}
				break;
			}
			case 10:{
				System.out.println("课后作业.3");
				
				break;
			}
			case 11:{
				System.out.println("课后作业.4");
				
				break;
			}
			case 12:{
				System.out.println("课后作业.5");
				int r = scanner.nextInt();
				if(r%2==0) {
					System.out.print("偶数");
				}else {
					System.out.print("奇数");
				}
				break;
			}
			case 13:{
				System.out.println("课后作业.6");
				int x = scanner.nextInt();
				if(x==1) {
					System.out.print("X="+x);
				}else if(x==5){
					System.out.print("X="+x);
				}else if(x==10){
					System.out.print("X="+x);
				}else {
					System.out.print("x=none");
				}
				break;
			}
			case 14:{
				System.out.println("课后作业.7");
				int x = scanner.nextInt();
				if(x%5==0 && x%6==0) {
					System.out.print("能被5和6整除");
				}else if(x%5==0){
					System.out.print("能被5整除");
				}else if(x%6==0){
					System.out.print("能被5整除");
				}else {
					System.out.print("不能被5或6整除");
				}
				break;
			}
			case 15:{
				System.out.println("课后作业.8");
				int x = scanner.nextInt();
				if(x%100==0) {
					if(x%400==0) {
						System.out.println("闰年");
					}else {
						System.out.println("平年");
					}
				}else {
					if(x%4==0) {
						System.out.println("闰年");
					}else {
						System.out.println("平年");
					}
				}
				break;
			}
			case 16:{
				System.out.println("课后作业.9");
				int x = scanner.nextInt();
				if(x>0 && x<=20) {
					System.out.println("E");
				}else if(x>20 && x<=40) {
					System.out.println("D");
				}else if(x>40 && x<=60) {
					System.out.println("C");
				}else if(x>60 && x<=80) {
					System.out.println("B");
				}else if(x>80 && x<=100) {
					System.out.println("A");
				}else {
					System.out.println("无效");
				}
				break;
			}
			case 17:{
				System.out.println("课后作业.10");
				
				break;
			}
			case 18:{
				System.out.println("课后作业.11");
				double x = scanner.nextInt();
				int i=0;
				do {
					
					x=x/10;i++;
				}while(x>=1);
				System.out.print("位数为"+i);
				break;
			}
			case 19:{
				System.out.println("课后作业.12");
				double x = scanner.nextInt();
				int c = 1;
				int c1 = 50;
				if(x<100) {
					System.out.println(c+"元");
				}else if(x<5000 && x>=100) {
					System.out.println((x*0.01)+"元");
				}else {
					System.out.println(c1+"元");
				}
				break;
			}
			case 20:{
				System.out.println("课后作业.13");
				for(int i=1;i<=100;i++) {
					if(i%3==0) {
						System.out.print(i+"  ");
					}
				}
				break;
			}
			case 21:{
				System.out.println("课后作业.14");
				
				break;
			}
			case 22:{
				System.out.println("课后作业.15");
				
				break;
			}
			case 23:{
				System.out.println("课后作业.16");
				
				break;
			}
			
			
		}
	}
}

	
