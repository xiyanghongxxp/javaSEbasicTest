import javax.swing.*;

//@author：尹嘉瑞 2019/07/31

public class JframeHelloWorld{
    public static void main (String[] args){
	    JFrame frame = new JFrame("这是一个JFrame");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("helloworld");
        panel.add(label);
        frame.setContentPane(panel);
        frame.setSize(300,200);
        frame.setVisible(true);
	}
}
		