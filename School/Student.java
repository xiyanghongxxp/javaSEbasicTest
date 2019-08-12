package School;

/**
* @ClassName: Student
* @Description: Student类
* @author neuedu_yjr
* @date 2019年8月10日 上午10:34:03
*控制台项目：使用集合来制作学生管理系统 
1：系统启动时，创建一个学校，然后给学校一些初始化学
生信息、课程信息。  
2：学生信息管理（StudentManager） 
 2.1.增加学生 
 2.2.修改学生 
 2.3.删除学生 
 2.4.查询学生 
 2.5.打印学生 
 2.6.课程管理 
 2.7.系统退出  
3:课程信息管理(CourseManager) 
 3.1.增加课程 
 3.2.修改课程 
 3.3.删除课程 
4.通过学生学号，查询该学生选课情况 
5.通过课程号，打印当前课程下面学生信息 
6.添加选这门课程的学生 
7.删除选择这门课程的学生 
8.返回上级菜单  
主键： 学生：学号 课程：课程号
*/
public class Student {
    String name;
    int stuId;
    String sex;
    String major;
    public Student() {}
    public Student(String name,int stuId,String sex,String major) {
        this.name=name;
        this.stuId=stuId;
        this.sex=sex;
        this.major=major;
    }
    @Override
    public String toString() {
        return "学生 [name=" + name + ", sex=" + sex +",stuId="+stuId +",major="+major+"]";
    }
}
