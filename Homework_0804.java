import java.util.*;
public class Homework_0804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("һ��7��");
		System.out.println("��ѡ����ţ�");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = 0;
		switch(a/1){
			case 1:{
				System.out.println("10�Ľ׳�");
				int sum1 =1;
				for(int i =1;i<=10;i++){
					
					sum1*=i;
				}System.out.println(sum1);
				break;
			}
			case 2:{
				System.out.println("��ӡ��ʮ�����������");
				int row = 10; // ���ǵ�����
				int[][] result = new int[row][row];
				for (int i = 0; i < row; i++) { // ��
				result[i][0] = 1;
				System.out.print(result[i][0] + "\t");
				for (int j = 1; j <= i; j++) { // ��
				result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
				System.out.print(result[i][j] + "\t");
				}
				System.out.println();
				}
				break;
			}
			case 3:{
				System.out.println("����м��ֹ��򷽷�");
				float sum1=100,gongJiaGe=5f,muJiaGe=3f,xiaoJiaGe=1/3f;
		        int gongGeShu=0,muGeShu=0,xiaoGeShu=0;
		        for(gongGeShu=0;gongGeShu*5<100;gongGeShu++){
		            for(muGeShu=0;muGeShu*3<100;muGeShu++){
		                for(xiaoGeShu=0;xiaoGeShu<100;xiaoGeShu++){
		                    int sum2=gongGeShu*15+muGeShu*9+xiaoGeShu;
		                    if(sum2==300&&gongGeShu+muGeShu+xiaoGeShu==100){
		                        System.out.println("����"+gongGeShu+"ĸ��"+muGeShu+"С��"+xiaoGeShu);
		                    }
		                }
		                 
		            }
		        }
		    
		 
		
					
					
					
				break;
	}
			case 4:{
				System.out.println("��ÿ���µ���������Ϊ����?");
				int ri = scanner.nextInt();
				if(ri<=2) {
					System.out.println("������1������");
				}else {
					int f1 = 1;
					int f2 = 0;
					int f =f1+f2;
					for(int i = 2;i<=ri;i++) {
						f1=f2;
						f2=f;
						f=f1+f2;
						
					}System.out.println(f);
					}
				break;
			}
			case 5:{
				System.out.println("ʵ��ð��������ѡ������");
				
				break;
			}
			case 6:{
				System.out.println("������µ���ԭ���ڼ��ŵ���λ");
				
				break;
			}
			case 7:{
				System.out.println("��������:��������λ��");
				int t = scanner.nextInt();
				int m = t/1000;
				int f = t%1000/100;
				int n = t%100/10;
				int o = t%10;
				int c = (m+5)%10+(f+5)%10*10+(n+5)%10*100+(o+5)%10*1000;
				System.out.println(c);
				break;
			}
			
			
		}
	}

}
