import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		
		setLookAndFeel();
		
		setTitle("Registeration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		panel.setBounds(0, 0, 511, 401);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 22, 217, 368);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		ImageIcon ic=new ImageIcon(Register.class.getResource("/com/deepsingh44/images/teacher.png"));
		JLabel lblNewLabel = new JLabel(resize(ic, 157, 144));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setBounds(27, 23, 157, 144);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>I want to thank the creator of this app. It was a lifesaver in the last few weeks with my mum, helping us communicate after her hearing and sight had started to deteriorate. Even the nurses at the Hospice installed it on their own devices to help their communication. Thank you.</html>");
		lblNewLabel_1.setBounds(10, 190, 197, 144);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(237, 22, 264, 368);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setBounds(10, 27, 98, 14);
		panel_2.add(lblEnterName);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(10, 43, 204, 26);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterEmail = new JLabel("Enter Email");
		lblEnterEmail.setBounds(10, 87, 98, 14);
		panel_2.add(lblEnterEmail);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 103, 204, 26);
		panel_2.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Course", "Java", "Android", "Advance Java", "Python", "Php", "Others"}));
		comboBox.setBounds(10, 266, 204, 26);
		panel_2.add(comboBox);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setBounds(10, 205, 98, 14);
		panel_2.add(lblEnterPassword);
		
		textField_3 = new JPasswordField();
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBounds(10, 221, 204, 26);
		panel_2.add(textField_3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(10, 316, 89, 26);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(204, 0, 0));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBounds(125, 316, 89, 26);
		panel_2.add(btnNewButton_1);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(72, 153, 58, 23);
		panel_2.add(rdbtnMale);
		
		JRadioButton rdbtnFmale = new JRadioButton("Fmale");
		rdbtnFmale.setBounds(142, 153, 72, 23);
		panel_2.add(rdbtnFmale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFmale);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 157, 51, 14);
		panel_2.add(lblGender);
	}
	
	private static ImageIcon resize(ImageIcon im, int w, int h) {
		BufferedImage bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
		Graphics2D gd = (Graphics2D) bi.createGraphics();
		gd.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
		gd.drawImage(im.getImage(), 0, 0, w, h, null);
		gd.dispose();
		return new ImageIcon(bi);
	}
	
	private void setLookAndFeel() {
		LookAndFeelInfo lf[]=UIManager.getInstalledLookAndFeels();
		try {
			UIManager.setLookAndFeel(lf[1].getClassName());
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
