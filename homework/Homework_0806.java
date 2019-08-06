package homework;
import java.util.*;

public class Homework_0806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("练习,十七题");
		System.out.println("请选择题号：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch(a/1){
		case 1:{
			System.out.println("练习三-2");
			
			break;
		}
		case 2:{
			System.out.println("课后作业.3");
			
			break;
		}
		case 3:{
			System.out.println("课后作业.4");
			
			break;
		}
		case 4:{
			System.out.println("课后作业.10");
			
			break;
		}
		case 5:{
			System.out.println("课后作业.14");
			
			break;
		}
		case 6:{
			System.out.println("课后作业.15")
			;
			break;
		}
		case 7:{
			System.out.println("课后作业.16");
			
			break;
		}
		case 8:{
			System.out.println("数组课后作业.1");
			int[] m = {10,20,30,40,50};
			System.out.print(Arrays.toString(m));
			break;
		}
		case 9:{
			System.out.println("数组课后作业.2");
			char[] m = {'n','e','u','s','o','f','t','e','d','u','c','a','t','i','o','n'};
			char[] c = new char [m.length];
			for(int i =0; i<m.length;i++) {
				c[i]=m[i];
			}System.out.print(Arrays.toString(c));
			break;
		}
		case 10:{
			System.out.println("数组课后作业.3");
			int[]m= {1,5,9,7,4,6,3,8,2};			
			Arrays.parallelSort(m);
			System.out.print(Arrays.toString(m));
			break;
		}
		case 11:{
			System.out.println("数组课后作业.4");
			
			break;
		}
		case 12:{
			System.out.println("数组课后作业.5");
			double[][]m= new double[5][4];
			
			break;
		}
		case 13:{
			System.out.println("数组课后作业.6");
			int[]m= {18,25,7,36,13,2,89,69};
			for(int i=0;i<m.length;i++) {
				for(int j=0;j<m.length-1;j++) {
					
				}
			}
			
			break;
		}
		case 14:{
			System.out.println("数组课后作业.7");
			
			break;
		}
		case 15:{
			System.out.println("数组课后作业.8");
			
			break;
		}
		case 16:{
			System.out.println("数组课后作业.9");
			int[]m= {-10,2,3,246,-100,0,5};
			double max=0;
			double min=0;
			double aver=0;
			double sum =0;
			Arrays.parallelSort(m);
			for(int i =0;i<m.length;i++) {
				sum+=m[i];
			}
			aver=sum/m.length;
			max=m[m.length-1];
			min=m[0];
			System.out.println("和为："+sum);
			System.out.print("平均值为："+aver);
			System.out.println();
			System.out.print("最大值为："+max);
			System.out.println("");
			System.out.print("最小值为："+min);
			break;
		}
		case 17:{
			System.out.println("选择排序");
			int[]m= {1,9,7,3,5,8,4};
			for(int i=0;i<m.length-1;i++) {
				for(int j=i+1;j<m.length;j++) {
					if(m[i]>m[j]) {
						int temp = 0;
						temp=m[i];
						m[i]=m[j];
						m[j]=temp;
					}
				}System.out.print(Arrays.toString(m));
			}
			
			break;
		}
		case 18:{
			System.out.println("冒泡排序");
			int[]m= {1,9,7,3,5,8,4};
			for(int i=0;i<m.length-1;i++) {
				for(int j=0;j<m.length-1-i;j++) {
					if(m[j]>m[j+1]) {
						int temp = 0;
						temp=m[j];
						m[j]=m[j+1];
						m[j+1]=temp;
					}
				}System.out.print(Arrays.toString(m));
			}
			break;
		}
		case 19:{
			
			
			break;
		}
		
		}
	}

}
