import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SearchAccount extends JInternalFrame {

	public SearchAccount() {
		setTitle("Search Account");
		setSize(300, 300);
		setIconifiable(true);
		setClosable(true);
		setLayout(null);

		JLabel l1 = new JLabel("Enter Name");
		l1.setBounds(10, 20, 100, 30);

		JTextField t1 = new JTextField();
		t1.setBounds(120, 20, 130, 30);

		JLabel l2 = new JLabel("Enter Ammount");
		l2.setBounds(10, 50, 100, 30);

		JTextField t2 = new JTextField();
		t2.setBounds(120, 50, 130, 30);

		JButton b1 = new JButton("Add Detail");
		b1.setBounds(60, 100, 130, 30);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
	}

}
