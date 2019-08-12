package homework;
import java.util.*;

/**
* @ClassName: Homework_0806
* @Description: TODO(这里用一句话描述这个类的作用)
* @author neuedu_yjr
* @date 2019年8月9日 下午1:24:18
*
*/
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
			int l1 = 1;
			int m =0;
			while(l1<=100) {
			    m+=l1;
			    l1++;
			    System.out.println(m);
			}
			
			break;
		}
		case 2:{
			System.out.println("课后作业.3");
			double annualSalary=30000;
			double sumAns=0;
			for(int i=1;i<10;i++){
			    annualSalary=annualSalary*(1+0.06);
			    sumAns+=annualSalary;
			}System.out.println("十年后工资："+annualSalary);
			System.out.println("总工资为:"+(sumAns+30000));
			break;
		}
		case 3:{
			System.out.println("课后作业.4");
			int n =1;
			for(int i=1;i<10;i++) {
			    n=2*(n+1);
			}
			System.out.println(n);
			System.out.println(Homework_0806.getTotal(10));//构造递归方法，借鉴的，暂时不懂
			break;
		}
		case 4:{
			System.out.println("课后作业.10");
			System.out.println("请输入三个数值");
			int x =scanner.nextInt();
			int y =scanner.nextInt();
			int z =scanner.nextInt();
			int[]m=new int[3];
			m[0]=x;
			m[1]=y;
			m[2]=z;
			Arrays.sort(m);
			System.out.print(m[0]);
			System.out.print(" ");
			System.out.print(m[1]);
			System.out.print(" ");
			System.out.print(m[2]);
			break;
		}
		case 5:{
			System.out.println("课后作业.14");
			
			break;
		}
		case 6:{
			System.out.println("课后作业.15");
			int num1=1;
			int n=scanner.nextInt();
			for(int i = 1;i<=n;i++) {
			    num1=num1*i;
			}
			System.out.println(num1);
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
			int[]n=Arrays.copyOf(m, m.length);
			Arrays.parallelSort(n);
			for(int i=0;i<m.length;i++) {
			    if(m[i]==n[n.length-1]) {
			        System.out.println(i);
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
			int[]m= {1,9,7,3,5,5,9,7,8,4,6,4,8,4};
            for(int i=0;i<m.length-1;i++) {
                for(int j=1;j<m.length-1;j++) {
                    if(m[i]==m[j]) {
                        m[j]=0;
                    }
                }
            }System.out.print(Arrays.toString(m));
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
	public static Integer getTotal(Integer n) {
        // 第十天只剩1个，就返回1
        if (n == 10) {
            return 1;
        }
        // 每天的桃子数+1再乘以2就是前一天的桃子数，用递归就算算出指定第几天的桃子数
        return (getTotal(n + 1) + 1) * 2;
    }

}
