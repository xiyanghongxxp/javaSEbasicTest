package School;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.platform.commons.util.ToStringBuilder;

/**
* @ClassName: StudentManagementSystem
* @Description: ѧ������ϵͳ�ͻ���
* @author neuedu_yjr
* @date 2019��8��10�� ����10:34:07
*
*/
public class StudentManagementSystem {
    
    static Student[] student = {};
    static Course[] course = {};




    public static void main(String[] args) {
        
        welcome();
        
    }
    
    
    
    
        //  ��ӭ����
    private static void welcome() {
        Scanner sc =new Scanner(System.in);
        System.out.println("��ӭʹ������ѧ������ϵͳ");
        System.out.println("��ѡ����Ҫ���еĲ�����1.��ʦ����2.ѧ������");
        int entryMode = sc.nextInt();
        getIn(entryMode);  
    }
    
    
    
    
    
    private static void getIn(int a) {
        switch(a) {
            case 1:
                //�����ʦϵͳ
                getInCsae1();
                break;
            case 2:
                //����ѧ��ϵͳ
                getInCsae2();
                break;
            default:
                System.out.println("�����������������");
                welcome();
                break;
            
        }
    }
    
    
            //�����ʦϵͳ
    private static void getInCsae1() {
        System.out.println("��ӭʹ�ý�ʦϵͳ����ѡ����Ҫ���еĲ�����");
        System.out.print("1.����ѧ��"+"2.�޸�ѧ��"+"3.ɾ��ѧ�� "+"4.��ѯѧ��"+"5.��ӡѧ�� "+"6.�γ̹���"+"7.ϵͳ�˳� ");
        Scanner sc =new Scanner(System.in);
        int entryMode = sc.nextInt();  
        teacherSwitch(entryMode);
    }
    
    
            //����ѧ��ϵͳ
    private static void getInCsae2() {
        System.out.println("��ӭʹ��ѧ��ϵͳ����ѡ����Ҫ���еĲ�����");
        System.out.print("1.��ѯѧ��"+"2.��ѯ�ɼ�"+"3.ϵͳ�˳� ");
        Scanner sc =new Scanner(System.in);
        int entryMode = sc.nextInt();
    }
    //��ʦ����ѡ�񷽷�
    private static void teacherSwitch(int a) {
        switch(a) {
            case 1:
                addStu();
                break;//1.����ѧ��
            case 2:
                reviseStu();
                break;//2.�޸�ѧ��
            case 3:
                deleteStu();
                break;//3.ɾ��ѧ��
            case 4:
                queryStu();
                break;//4.��ѯѧ��
            case 5:
                studentSwitch1();
                break;//5.��ӡѧ��
            case 6://6.�γ̹���
                course();
                break;
            case 7://7.ϵͳ�˳�
                exit();
                break;
            default:
                System.out.println("�����������������");
                getInCsae1();
                break;
        }
    }
            //ѧ������ѡ�񷽷�
    private static void studentSwitch(int a) {
        switch(a) {
            case 1:
                queryStu();
                break;//1.��ѯѧ��
            case 2:
                System.out.println("���޿��ԣ��������������");
                getInCsae2();
                break;
            case 3:
                exit();
                break;
            default:
                System.out.println("�����������������");
                getInCsae2();
                break;
        }
    }
    //��������
    // �γ̹���  
    
    
    
    private static void course() {
        System.out.println("��ѡ����Ҫ���еĲ�����");
        System.out.println("1.���ӿγ�"+"2.�޸Ŀγ�"+"3.ɾ���γ� ");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        switch(a) {
            case 1:
                courseAdd();
                break;//3.1.���ӿγ� 
            case 2:
                courseChange();
                break;//3.2.�޸Ŀγ� 
            case 3:
                courseDelate();
                break;//3.3.ɾ���γ�
            default:
                System.out.println("������������������");
                course();
                break;
        }quit();
   }  
  //3.1.���ӿγ� 
    private static void courseAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("������γ���(����)");
        String course1 = sc.next();
        System.out.println("������γ���(����)");
        String course2 = sc.next();
        System.out.println("������γ���(����)");
        String course3 = sc.next();
        System.out.println("������γ���(����)");
        String course4 = sc.next();
        System.out.println("������γ���(����)");
        String course5 = sc.next();
        System.out.println("������γ���(ѡ��)");
        String course6 = sc.next();
        System.out.println("������γ���(ѡ��)");
        String course7 = sc.next();
        System.out.println("������ѧ������Ϊ����ӿγ�");
        String name =sc.next();
        Course courseOo = new Course();
        courseOo.name = name;
        courseOo.requiredSubject1=course1;
        courseOo.requiredSubject2=course2;
        courseOo.requiredSubject3=course3;
        courseOo.requiredSubject4=course4;
        courseOo.requiredSubject5=course5;
        courseOo.electiveSubject1=course6;
        courseOo.electiveSubject2=course7;
        course = Arrays.copyOf(course, course.length+1);
        course[course.length-1] = courseOo;
        System.out.println("��ӳɹ�");
        System.out.println(courseOo);
        quit();
    }
  //3.2.�޸Ŀγ� 
    private static void courseChange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ�޸ĵ�ѧ����:");
        String name = sc.next();
        System.out.println("����ѡ��Ҫ�޸ĵĿγ̣�1.ѡ��һ2.ѡ�޶�");
        int course1 = sc.nextInt();
        if(course1==1) {
            for(int i=0;i<course.length;i++) {
                if(course[i].name.equals(name)) {
                    // ���޸Ĳ���
                    System.out.println("������Ҫ�޸Ŀγ���:");
                    String electiveSubject1 =sc.next();
                    course[i].electiveSubject1 = electiveSubject1;
                    System.out.println("�޸ĳɹ�");
                    System.out.println("�޸ĺ����Ϣ:"+course[i]);
                }
            }
        }else if(course1==2) {        
            for(int i=0;i<course.length;i++) {
                if(course[i].name.equals(name)) {
                    // ���޸Ĳ���
                    System.out.println("������Ҫ�޸Ŀγ���:");
                    String electiveSubject1 =sc.next();
                    course[i].electiveSubject2 = electiveSubject1;
                    System.out.println("�޸ĳɹ�");
                    System.out.println("�޸ĺ����Ϣ:"+course[i]);
                }
            }
        }
        quit();
    }
  //3.3.ɾ���γ�
    private static void courseDelate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������Ҫɾ��ѧ����:");
        String name = scanner.next();
        for(int i=0;i<course.length;i++) {
            if(course[i].name.equals(name)) {
                // ɾ��
                course[i] = course[course.length-1];
                course = Arrays.copyOf(course, course.length-1);
            }
        }
        System.out.println("ɾ���ɹ�");
        quit();
    }
    
    // �޸�ѧ�� 
    private static void reviseStu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������Ҫ�޸ĵ�ѧ����:");
        String name = scanner.next();
        System.out.println("�������޸ĵ�רҵ:");
        String major = scanner.next();
        for(int i=0;i<student.length;i++) {
            if(student[i].name.equals(name)) {
                // ���޸Ĳ���
                student[i].major = major;
                System.out.println("�޸ĳɹ�");
                System.out.println("�޸ĺ����Ϣ:"+student[i]);
            }
        }
        quit();
    }
      // ɾ��ѧ�� 
    private static void deleteStu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������Ҫɾ��ѧ����:");
        String name = scanner.next();
        for(int i=0;i<student.length;i++) {
            if(student[i].name.equals(name)) {
                // ɾ��
                student[i] = student[student.length-1];
                student = Arrays.copyOf(student, student.length-1);
            }
        }
        System.out.println("ɾ���ɹ�");
        quit();
    }
     //ѧ������
    // private static void studentReturn(int a) {
     
   //  }

              // ����ѧ��
    private static void addStu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ������");
        String name=sc.next();
        System.out.println("������ѧ���Ա�");
        String sex =sc.next();
        System.out.println("������ѧ��");
        int stuId = sc.nextInt();
        System.out.println("������ѧ��רҵ");
        String major = sc.next();
        Student xiaoming = new Student();
        xiaoming.name=name;
        xiaoming.stuId=stuId;
        xiaoming.sex=sex;
        xiaoming.major=major;
        student = Arrays.copyOf(student, student.length+1);
        student[student.length-1] = xiaoming;
        System.out.println("��ӳɹ�");
        System.out.println(xiaoming);
        quit();
    }
                // ��ѯѧ��
    private static void queryStu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ѧ����:");
        String name = scanner.next();
        for(int i=0;i<student.length;i++) {
            if(student[i].name.equals(name)) {
                // ɾ��
                System.out.println(student[i]);
                
            }
        }
        for(int i=0;i<course.length;i++) {
            if(course[i].name.equals(name)) {
                // ɾ��
                System.out.println(course[i]);
                
            }
        }
        quit();
    } 
                //��ʦ����
    private static void quit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("��ѡ�񷵻ػ��˳�");
        System.out.println("1.����2.�˳�");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                getInCsae1();
            break;
            case 2:
                exit();
            break;
           default:
               System.out.println("�������󣬷��ؽ�ʦ���");
               getInCsae1();
           break;
        }
        
    }
              // ��ӡѧ�� 
    private static void studentSwitch1() {
        for(int i = 0;i<student.length;i++) {
            System.out.println(student[i]);
        }System.out.println("��ӡ���");
        quit();
    }
              // ϵͳ�˳�
   private static void exit() {
       System.exit(0);
   }
   

    
}
