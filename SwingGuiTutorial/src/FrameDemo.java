import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameDemo {
public static void main(String[] args) {
	JFrame frame=new JFrame("Title Here");
	frame.setSize(500,500);
	frame.setLocationRelativeTo(null);
	//this method is used to close frame internally
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setLayout(null);
	
	JButton b1=new JButton("Hello");
	b1.setBounds(100,50,100,30);
	frame.add(b1);
	
	frame.setVisible(true);
	
	
	
}
}
