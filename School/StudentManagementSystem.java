package School;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.platform.commons.util.ToStringBuilder;

/**
* @ClassName: StudentManagementSystem
* @Description: 学生管理系统客户端
* @author neuedu_yjr
* @date 2019年8月10日 上午10:34:07
*
*/
public class StudentManagementSystem {
    
    static Student[] student = {};
    static Course[] course = {};




    public static void main(String[] args) {
        
        welcome();
        
    }
    
    
    
    
        //  欢迎界面
    private static void welcome() {
        Scanner sc =new Scanner(System.in);
        System.out.println("欢迎使用晓光学生管理系统");
        System.out.println("请选择您要进行的操作：1.教师进入2.学生进入");
        int entryMode = sc.nextInt();
        getIn(entryMode);  
    }
    
    
    
    
    
    private static void getIn(int a) {
        switch(a) {
            case 1:
                //进入教师系统
                getInCsae1();
                break;
            case 2:
                //进入学生系统
                getInCsae2();
                break;
            default:
                System.out.println("输入错误，请重新输入");
                welcome();
                break;
            
        }
    }
    
    
            //进入教师系统
    private static void getInCsae1() {
        System.out.println("欢迎使用教师系统，请选择您要进行的操作：");
        System.out.print("1.增加学生"+"2.修改学生"+"3.删除学生 "+"4.查询学生"+"5.打印学生 "+"6.课程管理"+"7.系统退出 ");
        Scanner sc =new Scanner(System.in);
        int entryMode = sc.nextInt();  
        teacherSwitch(entryMode);
    }
    
    
            //进入学生系统
    private static void getInCsae2() {
        System.out.println("欢迎使用学生系统，请选择您要进行的操作：");
        System.out.print("1.查询学生"+"2.查询成绩"+"3.系统退出 ");
        Scanner sc =new Scanner(System.in);
        int entryMode = sc.nextInt();
    }
    //教师操作选择方法
    private static void teacherSwitch(int a) {
        switch(a) {
            case 1:
                addStu();
                break;//1.增加学生
            case 2:
                reviseStu();
                break;//2.修改学生
            case 3:
                deleteStu();
                break;//3.删除学生
            case 4:
                queryStu();
                break;//4.查询学生
            case 5:
                studentSwitch1();
                break;//5.打印学生
            case 6://6.课程管理
                course();
                break;
            case 7://7.系统退出
                exit();
                break;
            default:
                System.out.println("输入错误，请重新输入");
                getInCsae1();
                break;
        }
    }
            //学生操作选择方法
    private static void studentSwitch(int a) {
        switch(a) {
            case 1:
                queryStu();
                break;//1.查询学生
            case 2:
                System.out.println("暂无考试，请进行其他操作");
                getInCsae2();
                break;
            case 3:
                exit();
                break;
            default:
                System.out.println("输入错误，请重新输入");
                getInCsae2();
                break;
        }
    }
    //方法操作
    // 课程管理  
    
    
    
    private static void course() {
        System.out.println("请选择您要进行的操作：");
        System.out.println("1.增加课程"+"2.修改课程"+"3.删除课程 ");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        switch(a) {
            case 1:
                courseAdd();
                break;//3.1.增加课程 
            case 2:
                courseChange();
                break;//3.2.修改课程 
            case 3:
                courseDelate();
                break;//3.3.删除课程
            default:
                System.out.println("输入有误，请重新输入");
                course();
                break;
        }quit();
   }  
  //3.1.增加课程 
    private static void courseAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入课程名(必修)");
        String course1 = sc.next();
        System.out.println("请输入课程名(必修)");
        String course2 = sc.next();
        System.out.println("请输入课程名(必修)");
        String course3 = sc.next();
        System.out.println("请输入课程名(必修)");
        String course4 = sc.next();
        System.out.println("请输入课程名(必修)");
        String course5 = sc.next();
        System.out.println("请输入课程名(选修)");
        String course6 = sc.next();
        System.out.println("请输入课程名(选修)");
        String course7 = sc.next();
        System.out.println("请输入学生姓名为其添加课程");
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
        System.out.println("添加成功");
        System.out.println(courseOo);
        quit();
    }
  //3.2.修改课程 
    private static void courseChange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生名:");
        String name = sc.next();
        System.out.println("请您选择要修改的课程：1.选修一2.选修二");
        int course1 = sc.nextInt();
        if(course1==1) {
            for(int i=0;i<course.length;i++) {
                if(course[i].name.equals(name)) {
                    // 做修改操作
                    System.out.println("请输入要修改课程名:");
                    String electiveSubject1 =sc.next();
                    course[i].electiveSubject1 = electiveSubject1;
                    System.out.println("修改成功");
                    System.out.println("修改后的信息:"+course[i]);
                }
            }
        }else if(course1==2) {        
            for(int i=0;i<course.length;i++) {
                if(course[i].name.equals(name)) {
                    // 做修改操作
                    System.out.println("请输入要修改课程名:");
                    String electiveSubject1 =sc.next();
                    course[i].electiveSubject2 = electiveSubject1;
                    System.out.println("修改成功");
                    System.out.println("修改后的信息:"+course[i]);
                }
            }
        }
        quit();
    }
  //3.3.删除课程
    private static void courseDelate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除学生名:");
        String name = scanner.next();
        for(int i=0;i<course.length;i++) {
            if(course[i].name.equals(name)) {
                // 删除
                course[i] = course[course.length-1];
                course = Arrays.copyOf(course, course.length-1);
            }
        }
        System.out.println("删除成功");
        quit();
    }
    
    // 修改学生 
    private static void reviseStu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生名:");
        String name = scanner.next();
        System.out.println("请输入修改的专业:");
        String major = scanner.next();
        for(int i=0;i<student.length;i++) {
            if(student[i].name.equals(name)) {
                // 做修改操作
                student[i].major = major;
                System.out.println("修改成功");
                System.out.println("修改后的信息:"+student[i]);
            }
        }
        quit();
    }
      // 删除学生 
    private static void deleteStu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除学生名:");
        String name = scanner.next();
        for(int i=0;i<student.length;i++) {
            if(student[i].name.equals(name)) {
                // 删除
                student[i] = student[student.length-1];
                student = Arrays.copyOf(student, student.length-1);
            }
        }
        System.out.println("删除成功");
        quit();
    }
     //学生返回
    // private static void studentReturn(int a) {
     
   //  }

              // 增加学生
    private static void addStu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name=sc.next();
        System.out.println("请输入学生性别");
        String sex =sc.next();
        System.out.println("请输入学号");
        int stuId = sc.nextInt();
        System.out.println("请输入学生专业");
        String major = sc.next();
        Student xiaoming = new Student();
        xiaoming.name=name;
        xiaoming.stuId=stuId;
        xiaoming.sex=sex;
        xiaoming.major=major;
        student = Arrays.copyOf(student, student.length+1);
        student[student.length-1] = xiaoming;
        System.out.println("添加成功");
        System.out.println(xiaoming);
        quit();
    }
                // 查询学生
    private static void queryStu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生名:");
        String name = scanner.next();
        for(int i=0;i<student.length;i++) {
            if(student[i].name.equals(name)) {
                // 删除
                System.out.println(student[i]);
                
            }
        }
        for(int i=0;i<course.length;i++) {
            if(course[i].name.equals(name)) {
                // 删除
                System.out.println(course[i]);
                
            }
        }
        quit();
    } 
                //教师返回
    private static void quit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择返回或退出");
        System.out.println("1.返回2.退出");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                getInCsae1();
            break;
            case 2:
                exit();
            break;
           default:
               System.out.println("输入有误，返回教师入口");
               getInCsae1();
           break;
        }
        
    }
              // 打印学生 
    private static void studentSwitch1() {
        for(int i = 0;i<student.length;i++) {
            System.out.println(student[i]);
        }System.out.println("打印完毕");
        quit();
    }
              // 系统退出
   private static void exit() {
       System.exit(0);
   }
   

    
}
