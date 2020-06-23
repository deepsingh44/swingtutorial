import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class First {
	private JTextField tname, troll;
	private JPasswordField tpass;
	private JComboBox tcourse;
	private JRadioButton b1, b2;
	private JFrame frame;

	public First() {
		initComponents();
	}

	private boolean flag;

	private void initComponents() {
		// create a container to hold components
		frame = new JFrame("Student Details");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		// initialize all the components here
		JLabel l1 = new JLabel("Enter Name");
		JLabel l2 = new JLabel("Enter Roll");
		JLabel l3 = new JLabel("Enter Password");
		JLabel l4 = new JLabel("Gender");
		JLabel l5 = new JLabel("Select Course");

		tname = new JTextField();
		troll = new JTextField();
		tpass = new JPasswordField();
		b1 = new JRadioButton("Male");
		b1.setSelected(true);
		b2 = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		// add data into combobox
		String[] data = { "Select Course", "A", "B", "C", "D", "E" };
		tcourse = new JComboBox(data);

		JButton bb1 = new JButton("Submit");

		// given the position of component inside the frame
		l1.setBounds(30, 30, 120, 30);
		l2.setBounds(30, 70, 120, 30);
		l3.setBounds(30, 110, 120, 30);
		l4.setBounds(30, 150, 120, 30);
		l5.setBounds(30, 190, 120, 30);

		tname.setBounds(190, 30, 150, 30);
		troll.setBounds(190, 70, 150, 30);
		tpass.setBounds(190, 110, 150, 30);
		b1.setBounds(190, 150, 60, 30);
		b2.setBounds(260, 150, 70, 30);
		tcourse.setBounds(190, 190, 150, 30);
		bb1.setBounds(120, 250, 100, 30);

		// add component to frame
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(tname);
		frame.add(troll);
		frame.add(tpass);
		frame.add(b1);
		frame.add(b2);
		frame.add(tcourse);
		frame.add(bb1);

		tname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (Character.isDigit(e.getKeyChar())) {
					Toolkit.getDefaultToolkit().beep();
					e.consume();
				}
			}
		});

		troll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
					Toolkit.getDefaultToolkit().beep();
					e.consume();
				}
			}
		});

		bb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				logic();

			}
		});

		bb1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				logic();

			}
		});

		bb1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				b.setBackground(Color.GREEN);
			}
		});

		frame.setVisible(true);
	}

	private void logic() {

		if (valid()) {
			String gender = "";
			if (b1.isSelected()) {
				gender = "male";
			} else {
				gender = "female";
			}
			System.out.println(name);
			System.out.println(roll);
			System.out.println(pass);
			System.out.println(gender);
			System.out.println(course);

		}
	}

	private String name, roll, pass, course;

	private boolean valid() {
		name = tname.getText();
		roll = troll.getText();
		pass = String.valueOf(tpass.getPassword());
		course = tcourse.getSelectedItem().toString();

		if (name.isEmpty()) {
			showWarning(frame, "please enter name");
			tname.requestFocus();
			tname.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.red));
			return false;
		} else if (roll.isEmpty()) {
			showWarning(frame, "please enter roll");
			troll.requestFocus();
			troll.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.red));
			return false;
		} else if (pass.isEmpty()) {
			showWarning(frame, "please enter password");
			tpass.requestFocus();
			tpass.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.red));
			return false;
		} else if (!passwordPattern(pass)) {
			showWarning(frame, "your password should containe a small letter \n an upper letter a number \n a special char \n length should be 6-15");
			tpass.requestFocus();
			tpass.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.red));
			return false;
		} else if (course.equalsIgnoreCase("select course")) {
			showWarning(frame, "please select course");
			tcourse.requestFocus();
			tcourse.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.red));
			return false;
		} else {
			return true;
		}

	}

	private void showWarning(Component cmp, String msg) {
		JOptionPane.showMessageDialog(cmp, msg, "Warning-Message", JOptionPane.WARNING_MESSAGE);
	}

	private String passwordPattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!?&()@$%#]).{6,15})";

	private boolean passwordPattern(String password) {
		Pattern pattern = Pattern.compile(passwordPattern);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public static void main(String[] args) {

		new First();

	}

}
