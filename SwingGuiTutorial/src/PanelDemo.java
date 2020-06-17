import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setSize(400, 400);
	f.setLocationRelativeTo(null);
	f.setLayout(null);
	
	JPanel phead=new JPanel();
	phead.setBackground(Color.RED);
	phead.setSize(400,100);
	
	JButton b1=new JButton("Logo1");
	JButton b2=new JButton("Logo2");
	JButton b3=new JButton("Logo3");
	JButton b4=new JButton("Logo4");
	phead.add(b1);
	phead.add(b2);
	phead.add(b3);
	phead.add(b4);
	
	b4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hello World");
		}
	});
	
b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hello World b1");
		}
	});
	
	f.add(phead);
	
	f.setVisible(true);
}
}
