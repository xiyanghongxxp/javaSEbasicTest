package School;

/**
* @ClassName: Student
* @Description: Student��
* @author neuedu_yjr
* @date 2019��8��10�� ����10:34:03
*����̨��Ŀ��ʹ�ü���������ѧ������ϵͳ 
1��ϵͳ����ʱ������һ��ѧУ��Ȼ���ѧУһЩ��ʼ��ѧ
����Ϣ���γ���Ϣ��  
2��ѧ����Ϣ����StudentManager�� 
 2.1.����ѧ�� 
 2.2.�޸�ѧ�� 
 2.3.ɾ��ѧ�� 
 2.4.��ѯѧ�� 
 2.5.��ӡѧ�� 
 2.6.�γ̹��� 
 2.7.ϵͳ�˳�  
3:�γ���Ϣ����(CourseManager) 
 3.1.���ӿγ� 
 3.2.�޸Ŀγ� 
 3.3.ɾ���γ� 
4.ͨ��ѧ��ѧ�ţ���ѯ��ѧ��ѡ����� 
5.ͨ���γ̺ţ���ӡ��ǰ�γ�����ѧ����Ϣ 
6.���ѡ���ſγ̵�ѧ�� 
7.ɾ��ѡ�����ſγ̵�ѧ�� 
8.�����ϼ��˵�  
������ ѧ����ѧ�� �γ̣��γ̺�
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
        return "ѧ�� [name=" + name + ", sex=" + sex +",stuId="+stuId +",major="+major+"]";
    }
}
