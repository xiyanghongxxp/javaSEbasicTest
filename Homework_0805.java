import java.util.Scanner;

public class Homework_0805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������ϰ");
		System.out.println("��ѡ����ţ�");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch(a/1){
			case 1:{
				System.out.println("��ϰһ");
				int b = scanner.nextInt();
				if(b%2==0) {
					System.out.println("���������ż����"+b);
					}else {
						System.out.println("��������ǣ�"+b);
					}
				}
				break;
			
			case 2:{
				System.out.println("��ϰ��");
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
				System.out.println("��ϰ��");
				int i = 1;
				int sum =0;
				
				while(i<=100){
					 sum += i;
					 i++;
				}System.out.println("100����Ӻ�Ϊ��"+sum);
				break;
			}
			case 4:{
				System.out.println("��ϰ��");
				int sum4=0;
				for(int i=0;i<=100;i++) {
					sum4+=i;
				}System.out.print(sum4);
				break;
			}
			case 5:{
				System.out.println("��ϰ��-1");
				int sum4=0;
				for(int i=0;i<=100;i++) {
					if(i%2==1) {
						sum4+=i;
					}
				}System.out.print(sum4);
				break;
				
			}
			case 6:{
				System.out.println("��ϰ��-2");
				
					 
					 
				
				break;
			}
			case 7:{
				System.out.println("��ϰ��-3");
				int i = 1;
				int sum =0;
				
				while(i<=100){
					 sum += i;
					 i++;
				}System.out.println("100����Ӻ�Ϊ��"+sum);
				break;
			}
			case 8:{
				System.out.println("�κ���ҵ.1");
				System.out.print("������������н��");
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
				System.out.println("�κ���ҵ.2");
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
				System.out.println("�κ���ҵ.3");
				
				break;
			}
			case 11:{
				System.out.println("�κ���ҵ.4");
				
				break;
			}
			case 12:{
				System.out.println("�κ���ҵ.5");
				int r = scanner.nextInt();
				if(r%2==0) {
					System.out.print("ż��");
				}else {
					System.out.print("����");
				}
				break;
			}
			case 13:{
				System.out.println("�κ���ҵ.6");
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
				System.out.println("�κ���ҵ.7");
				int x = scanner.nextInt();
				if(x%5==0 && x%6==0) {
					System.out.print("�ܱ�5��6����");
				}else if(x%5==0){
					System.out.print("�ܱ�5����");
				}else if(x%6==0){
					System.out.print("�ܱ�5����");
				}else {
					System.out.print("���ܱ�5��6����");
				}
				break;
			}
			case 15:{
				System.out.println("�κ���ҵ.8");
				int x = scanner.nextInt();
				if(x%100==0) {
					if(x%400==0) {
						System.out.println("����");
					}else {
						System.out.println("ƽ��");
					}
				}else {
					if(x%4==0) {
						System.out.println("����");
					}else {
						System.out.println("ƽ��");
					}
				}
				break;
			}
			case 16:{
				System.out.println("�κ���ҵ.9");
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
					System.out.println("��Ч");
				}
				break;
			}
			case 17:{
				System.out.println("�κ���ҵ.10");
				
				break;
			}
			case 18:{
				System.out.println("�κ���ҵ.11");
				double x = scanner.nextInt();
				int i=0;
				do {
					
					x=x/10;i++;
				}while(x>=1);
				System.out.print("λ��Ϊ"+i);
				break;
			}
			case 19:{
				System.out.println("�κ���ҵ.12");
				double x = scanner.nextInt();
				int c = 1;
				int c1 = 50;
				if(x<100) {
					System.out.println(c+"Ԫ");
				}else if(x<5000 && x>=100) {
					System.out.println((x*0.01)+"Ԫ");
				}else {
					System.out.println(c1+"Ԫ");
				}
				break;
			}
			case 20:{
				System.out.println("�κ���ҵ.13");
				for(int i=1;i<=100;i++) {
					if(i%3==0) {
						System.out.print(i+"  ");
					}
				}
				break;
			}
			case 21:{
				System.out.println("�κ���ҵ.14");
				
				break;
			}
			case 22:{
				System.out.println("�κ���ҵ.15");
				
				break;
			}
			case 23:{
				System.out.println("�κ���ҵ.16");
				
				break;
			}
			
			
		}
	}
}

	
