package homework;

import java.util.Scanner;

/**
* @ClassName: Homework_0808_1
* @Description: �������ã��жϸ��������껹��ƽ��
* @author neuedu_yjr
* @date 2019��8��9�� ����1:25:38
*
*/
public class Homework_0808_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int a =scanner.nextInt();
        System.out.println(judge(a));
    }
    public static String judge(int a) {
        String b ="ping";
        if(a%100==0) {
            if(a%400==0) {
                b="����";
            }else {
                b="ƽ��";
            }
        }else {
            if(a%4==0) {
                b="����";
            }else {
                b="ƽ��";}
        }
        
        return b ;
    }
}
