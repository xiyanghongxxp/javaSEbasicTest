import javax.swing.*;

//@author�������� 2019/07/31

public class JframeHelloWorld{
    public static void main (String[] args){
	    JFrame frame = new JFrame("����һ��JFrame");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("helloworld");
        panel.add(label);
        frame.setContentPane(panel);
        frame.setSize(300,200);
        frame.setVisible(true);
	}
}
		