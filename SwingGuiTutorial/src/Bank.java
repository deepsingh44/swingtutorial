import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Bank {

	public Bank() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("File");

		JMenuItem mi1 = new JMenuItem("New Account");
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

		JMenuItem mi2 = new JMenuItem("Deposite Money");
		mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK));

		JMenuItem mi3 = new JMenuItem("Search Account");
		// mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
		// KeyEvent.CTRL_DOWN_MASK));
		mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK + KeyEvent.ALT_DOWN_MASK));
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		mb.add(m1);

		frame.add(mb, BorderLayout.NORTH);

		JDesktopPane desktopPane = new JDesktopPane();
		frame.add(desktopPane);

		frame.setVisible(true);

		mi1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OpenAccount openAccount = new OpenAccount();
				desktopPane.add(openAccount);
				openAccount.setVisible(true);

			}
		});

		mi2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DepositeMoney depositeMoney = new DepositeMoney();
				desktopPane.add(depositeMoney);
				depositeMoney.setVisible(true);

			}
		});

		mi3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SearchAccount searchAccount = new SearchAccount();
				desktopPane.add(searchAccount);
				searchAccount.setVisible(true);

			}
		});

	}

	public static void main(String[] args) {

		new Bank();

	}
}
