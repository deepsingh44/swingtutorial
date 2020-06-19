import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DepositeMoney extends JInternalFrame {

	public DepositeMoney() {
		setTitle("Deposite Money");
		setSize(300, 300);
		setIconifiable(true);
		setClosable(true);
		setLayout(null);

		String[] cols = { "Name", "Date", "Money" };
		DefaultTableModel dt = new DefaultTableModel(cols, 0);

		JTable table = new JTable(dt);
		JScrollPane jp = new JScrollPane(table);

		for (int i = 0; i <= 10; i++) {
			dt.addRow(new Object[] { "Deep", "2020/06/19", 1000 + i });
		}

		/*// how to fetch data from selected row
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = (String) dt.getValueAt(table.getSelectedRow(), 0);
				String date = (String) dt.getValueAt(table.getSelectedRow(), 1);
				int data = (int) dt.getValueAt(table.getSelectedRow(), 2);
				System.out.println(name+"\t"+date+"\t"+data);
			}

		});*/
		
		//how to delete selected row from table
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dt.removeRow(table.getSelectedRow());
			}

		});

		jp.setBounds(10, 10, 270, 270);
		add(jp);

	}

}
