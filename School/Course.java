package School;

/**
* @ClassName: School
* @Description: 学校类
* @author neuedu_yjr
* @date 2019年8月10日 上午10:33:58
*
*/
public class Course {

    String name;
    String requiredSubject1;
    String requiredSubject2;
    String requiredSubject3;
    String requiredSubject4;
    String requiredSubject5;
    String electiveSubject1;
    String electiveSubject2;
    public Course() {
        
    }
    public Course(String name,String requiredSubject,String electiveSubject) { 
        this.name = name;
        this.requiredSubject1=requiredSubject;
        this.requiredSubject2=requiredSubject;
        this.requiredSubject3=requiredSubject;
        this.requiredSubject4=requiredSubject;
        this.requiredSubject5=requiredSubject;
        this.electiveSubject1=electiveSubject;
        this.electiveSubject2=electiveSubject;
        
    }
    @Override
    public String toString() {
        return "课程 [name=" + name + ", requiredSubject=" + requiredSubject1 + ", requiredSubject=" + requiredSubject2 + ", requiredSubject=" + requiredSubject3 + ", requiredSubject=" + requiredSubject4 + ", requiredSubject=" + requiredSubject5 + ", electiveSubject=" + electiveSubject1+ ", electiveSubject=" + electiveSubject2 +"]";
    }
}
