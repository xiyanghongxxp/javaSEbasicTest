package Game;
import java.util.*;
public class Welcome {
	private static Scanner scanner;
    private static Scanner scanner2;

    public static void main(String []args) {
		mainbody();
	}
	public static void mainbody() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("* 这是一个RGB游戏  *");
		System.out.println("* 按1选择开始游戏  *");
		System.out.println("* 按2选择游戏规则  *");
		System.out.println("* 按3选择退出游戏  *");
		System.out.println("*******************");
		int a = scanner.nextInt();
		switch(a) {
			case 1:{
				caseA();
			}break;
			case 2:{
				
			}break;
			case 3:{
				System.exit(0);
			}break;
			default:
				System.out.println("输入有误,请重新输入");
			break;
		}
	}
	public static void caseA() {
		scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("* 1.选择角色  *");
		System.out.println("*******************");
		System.out.println("*******************");
		System.out.println("* 2.创建角色 *");
		System.out.println("*******************");
		int b = scanner.nextInt();
		switch(b/1) {
			case 1:{
				caseB1();
			}break;
			case 2:{
				caseB2();
			}break;
		}
	}
	public static void caseB1() {
		scanner2 = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("* 请选择角色  *");
		System.out.println("*******************");
		int f = scanner2.nextInt();
		switch(f) {
			case 1:{
				caseF1();
			}break;
		}
	}
	public static void caseF1() {
		System.out.println("*******************");
		System.out.println("*     昵称:"+caseB2()[0]+"*");
		System.out.println("*     人族:"+caseB2()[1]+"*");
		System.out.println("*     性别:"+caseB2()[2]+"*");
		System.out.println("*     属性");
		System.out.println("*     力量:"+caseB2()[3]+"*");
		System.out.println("*     敏捷:"+caseB2()[4]+"*");
		System.out.println("*     体力:"+caseB2()[5]+"*");
		System.out.println("*     智力:"+caseB2()[6]+"*");
		System.out.println("*     智慧："+caseB2()[7]+"*");
		System.out.println("*******************");
	}
	public static void caseB2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("*   请输入昵称        *");
		System.out.println("*******************");
		String name = scanner.next();
		String[]theName = new String[1];
		theName[0]=name;
		Gender();
		int d = scanner.nextInt();
		String[]Gender = new String[1];
		if(d==1) {
			Gender[0]="男";
		}else if(d==2) {
			Gender[0]="女";
		}else {
			System.out.println("输入有误，请重新选择");
			Gender();
		}
		Race();
		int m = scanner.nextInt();
		String[]race = new String[1];
		if(m==1) {
			race[0]="人族";
		}else if(m==2) {
			race[0]="兽人";
		}else if(m==3) {
			race[0]="矮人";
		}else if(m==4) {
			race[0]="元素";
		}else if(m==5) {
			race[0]="精灵";
		}else {
			System.out.println("输入有误，请重新选择");
			Race();
		}
		System.out.println("*    创建成功        *");
		int a =new Welcome().power();
		int b =new Welcome().power();
		int c =new Welcome().power();
		int j =new Welcome().power();
		int e =new Welcome().power();
		String[] nor=new String[8];
		nor[0]=name;
		nor[1]=Gender[0];
		nor[2]=race[0];
		nor[3]="力量："+String.valueOf(a);
		nor[4]="敏捷："+String.valueOf(b);
		nor[5]="体力："+String.valueOf(c);
		nor[6]="智力："+String.valueOf(j);
		nor[7]="智慧："+String.valueOf(e);
		System.out.println("*******************");
		System.out.println("*     昵称          :"+theName[0]);
		System.out.println("*     性别          :"+Gender[0]);
		System.out.println("*     种族          :"+race[0]);
		System.out.println("******* 属性  *******");
		System.out.println("*力量      :  "+a);
		System.out.println("*敏捷      :  "+b);
		System.out.println("*体力      :  "+c);
		System.out.println("*智力      :  "+j);
		System.out.println("*智慧      :  "+e);
		System.out.println("*******************");
		System.out.println();
		System.out.println("*******************");
		System.out.println("*   输入1返回：    *");
		System.out.println("*******************");
		int f = scanner.nextInt();
		switch(f) {
			case 1:{
				caseA();
			}break;
			case 2:{
				System.out.println();
			}break;
	
		}
		
		
	}
	public static void Gender() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("*   请选择性别        *");
		System.out.println("* 1.男性 2.女性      *");
		System.out.println("*******************");
		
		
	}
	public static void Race() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("*   请选择种族        *");
		System.out.println("*  1.人族 *");
		System.out.println("*  2.兽人 *");
		System.out.println("*  3.矮人 *");
		System.out.println("*  4.元素 *");
		System.out.println("*  5.精灵 *");
		System.out.println("*******************");
	}

	public static int power() {
		Random random = new Random();
		int a = random.nextInt(10000);
		return a;
	}
}

	
	
	