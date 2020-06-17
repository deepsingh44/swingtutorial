import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Firsat {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setSize(300, 300);
	f.setResizable(false);
	f.setLocationRelativeTo(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(null);
	
	JTextField t1=new JTextField();
	t1.setBounds(50,10,150,30);
	
	JTextField t2=new JTextField();
	t2.setBounds(50,50,150,30);
	
	JButton b1=new JButton("Add");
	b1.setBounds(50,90,150,30);
	
	f.add(t1);
	f.add(t2);
	f.add(b1);
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String f1=t1.getText();
			String f2=t2.getText();
			
			int i=Integer.parseInt(f1);
			int j=Integer.parseInt(f2);
			
			//System.out.println(i+j);
			JOptionPane.showMessageDialog(f, i+j);
		}
	});
	
	f.setVisible(true);
}
}
