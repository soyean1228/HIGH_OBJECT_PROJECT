import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class UCheck extends JFrame implements ActionListener {
	public JTable table;
	public DefaultTableModel model;
	Connection connect = null;
	static StudentAttend[] stuAtt = new StudentAttend[40];
	public static int rule = 3;
	public static int Frule = 3;
	public static int Changewk = 0;
	MenuDemo m = new MenuDemo();

	void setRuler(int r) {
		rule = r;
	}

	void setFRuler(int r) {
		Frule = r;
	}

	void setWeek(int r) {
		Changewk = r;
	}

	int getWeek() {
		return Changewk;
	}

	public UCheck() {

	}

	void run() {
		setTitle("��� ��������");
		setLocation(350, 250);
		setSize(800, 500);

		makeMenu();

		setVisible(true);
	}

	public void makeMenu() {
		table = new JTable();
		getContentPane().add(table);
		JMenuItem item;

		JMenuBar mb = new JMenuBar();

		JMenu m1 = new JMenu("����");
		JMenu m2 = new JMenu("��� ��� �� ���º���");
		JMenu m3 = new JMenu("��� ����");

		// m1
		item = new JMenuItem("���� �ҷ�����");
		item.addActionListener(this);
		m1.add(item);

		item = new JMenuItem("���泻�� ����");
		item.addActionListener(this);
		m1.add(item);

		// item = new JMenuItem("DB�� ����");
		// item.addActionListener(this);
		// m1.add(item);
		//
		// item = new JMenuItem("CSV�� ����");
		// item.addActionListener(this);
		// m1.add(item);

		// m2
		item = new JMenuItem("������� ���");
		item.addActionListener(this);
		m2.add(item);

		item = new JMenuItem("��ü ��� ����");
		item.addActionListener(this);
		m2.add(item);

		// m3
		item = new JMenuItem("������ ����");
		item.addActionListener(this);
		m3.add(item);

		item = new JMenuItem("F���� ����");
		item.addActionListener(this);
		m3.add(item);

		// add menu to menu_bar
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);

		setJMenuBar(mb);

		// model setup
		model = (DefaultTableModel) table.getModel();
		model.addColumn("name");
		model.addColumn("StudentId");
		model.addColumn("1��");
		model.addColumn("2��");
		model.addColumn("3��");
		model.addColumn("4��");
		model.addColumn("5��");
		model.addColumn("6��");
		model.addColumn("7��");
		model.addColumn("8��");
		model.addColumn("9��");
		model.addColumn("10��");
		model.addColumn("11��");
		model.addColumn("12��");
		model.addColumn("13��");
		model.addColumn("14��");
		model.addColumn("15��");
		model.addColumn("16��");
		model.addColumn("����");

		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(100, 100, 600, 100);
		getContentPane().add(scroll);

	}

	public void actionPerformed(ActionEvent e) {
		JMenuItem mi = (JMenuItem) (e.getSource());
		switch (mi.getText()) {

		case "���� �ҷ�����":
			System.out.println("���� �ҷ�����");
			JFileChooser fileopen = new JFileChooser();
			FileFilter filter = new FileNameExtensionFilter("Text/CSV file", "txt", "csv");
			fileopen.addChoosableFileFilter(filter);

			int ret = fileopen.showDialog(null, "Choose file");

			if (ret == JFileChooser.APPROVE_OPTION) {

				// Read Text file
				File file = fileopen.getSelectedFile();

				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line;
					int row = 0;
					while ((line = br.readLine()) != null) {
						String[] arr = line.split(",");
						model.addRow(new Object[0]);
						model.setValueAt(arr[0], row, 0);
						model.setValueAt(arr[1], row, 1);
						model.setValueAt(arr[2], row, 2);
						model.setValueAt(arr[3], row, 3);
						model.setValueAt(arr[4], row, 4);
						model.setValueAt(arr[5], row, 5);
						model.setValueAt(arr[6], row, 6);
						model.setValueAt(arr[7], row, 7);
						model.setValueAt(arr[8], row, 8);
						model.setValueAt(arr[9], row, 9);
						model.setValueAt(arr[10], row, 10);
						model.setValueAt(arr[11], row, 11);
						model.setValueAt(arr[12], row, 12);
						model.setValueAt(arr[13], row, 13);
						model.setValueAt(arr[14], row, 14);
						model.setValueAt(arr[15], row, 15);
						model.setValueAt(arr[16], row, 16);
						model.setValueAt(arr[17], row, 17);
						// model.setValueAt(arr[18], row, 18);
						row++;
					}
					br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			for (int i = 0; i < table.getRowCount(); i++) {
				stuAtt[i] = new StudentAttend();
				for (int j = 0; j < 18; j++) {

					stuAtt[i].CheckAttend[j] = table.getValueAt(i, j).toString();
				}
			}
			break;
		case "���泻�� ����":
			if (Changewk != 0) {
				for (int k = 0; k < table.getRowCount(); k++) {
					model.setValueAt(stuAtt[k].CheckAttend[Changewk + 1], k, Changewk + 1);
				}
			} else {
				for (int k = 0; k < table.getRowCount(); k++) {
					for (int j = 0; j < 18; j++) {
						stuAtt[k].CheckAttend[j] = table.getValueAt(k, j).toString();
						model.setValueAt(stuAtt[k].CheckAttend[j], k, j);
					}
				}

			}
			Changewk = 0;

			break;
		case "DB�� ����":
			System.out.println("DB�� ����");
			Connection con = null;
			Statement s = null;
			String url = "jdbc:mysql://localhost:1234/attend?characterEncoding=UTF-8&serverTimezone=UTC";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				// System.out.println("�����ͺ��̽� ���� ��...");
				con = DriverManager.getConnection(url, "root", "1234");
				// System.out.println("�����ͺ��̽� ���� ����");

				s = con.createStatement();

				String sql = "INSERT INTO person (name, 1week) VALUES " + "(" + "'" + stuAtt[0].CheckAttend[0] + "',"
						+ stuAtt[0].CheckAttend[1] + "')";
				s.executeUpdate(sql);

				JOptionPane.showMessageDialog(null, "Import Data Successfully");

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
				ex.printStackTrace();
			}

			try {
				if (s != null) {
					s.close();
					connect.close();
				}
			} catch (SQLException e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			}

			break;

		case "CSV�� ����":
			System.out.println("CSV�� ����");
			connect = null;
			s = null;
			url = "jdbc:mysql://localhost:1234/score?characterEncoding=UTF-8&serverTimezone=UTC";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connect = DriverManager.getConnection(url, "root", "1234");

				s = connect.createStatement();

				ResultSet rec = s.executeQuery("SELECT * FROM person");

				String path = "C:\\Users\\njh10\\Documents\\test.csv";
				FileWriter writer;

				try {
					File file = new File(path);
					writer = new FileWriter(file, true);

					while ((rec != null) && (rec.next())) {
						writer.write(rec.getString("name"));
						writer.write(",");
						writer.write(rec.getString("StudentId"));
						writer.write(",");
						writer.write(rec.getString("1��"));
						writer.write(",");
						writer.write(rec.getString("2��"));
						writer.write(",");
						writer.write(rec.getString("3��"));
						writer.write(",");
						writer.write(rec.getString("4��"));
						writer.write(",");
						writer.write(rec.getString("5��"));
						writer.write(",");
						writer.write(rec.getString("6��"));
						writer.write(",");
						writer.write(rec.getString("7��"));
						writer.write(",");
						writer.write(rec.getString("8��"));
						writer.write(",");
						writer.write(rec.getString("9��"));
						writer.write(",");
						writer.write(rec.getString("10��"));
						writer.write(",");
						writer.write(rec.getString("11��"));
						writer.write(",");
						writer.write(rec.getString("12��"));
						writer.write(",");
						writer.write(rec.getString("13��"));
						writer.write(",");
						writer.write(rec.getString("14��"));
						writer.write(",");
						writer.write(rec.getString("15��"));
						writer.write(",");
						writer.write(rec.getString("16��"));
						writer.write("\n");
						System.out.println(1);
					}
					writer.flush();
					writer.close();

					System.out.println("Write success!");

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// Close
			try {
				if (connect != null) {
					s.close();
					connect.close();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

			break;
		case "������� ���":
			System.out.println("�⼮���� ���");
			int countX = 0;
			int countT = 0;
			int Out = 0;
			int In = 0;
			int Total = 0;
			for (int i = 0; i < 40; i++) {
				if (stuAtt[0] == null) {
					JOptionPane.showMessageDialog(null, "�������������� ������ �ε��� �� �̿����ּ���!", "����", JOptionPane.ERROR_MESSAGE);
					break;
				}
				if (stuAtt[i] == null)
					break;
				for (int j = 0; j < 18; j++) {
					if (stuAtt[i].CheckAttend[j].equals(" x") || stuAtt[i].CheckAttend[j].equals("x")) {
						countX++;
					}
					if (stuAtt[i].CheckAttend[j].equals(" ��") || stuAtt[i].CheckAttend[j].equals("��")) {
						countT++;
					}
				}
				// ���� �Ἦ���� ����.
				// if((countT/rule) >= 1) {

				// ����� ���� == Out
				Out = countT / rule;
				In = countT % rule;
				System.out.println(In);
				// }
				Total = 100 - ((countX + Out) * 5);
				stuAtt[i].CheckAttend[18] = String.valueOf(Total);
				m.stu[i].Attend = String.valueOf(Total);

				if (countX + Out >= Frule) {
					m.stu[i].rank = "F";
					stuAtt[i].CheckAttend[19] = "F";
				} else {
					m.stu[i].rank = "-";
					stuAtt[i].CheckAttend[19] = "o";
				}

				model.setValueAt(stuAtt[i].CheckAttend[18], i, 18);
				// System.out.println(stuAtt[i].CheckAttend[19]);
				countX = 0;
				countT = 0;
				Out = 0;
				In = 0;
				Total = 0;
			}

			break;
		case "������ ����":

			new setRule().run();
			break;
		case "F���� ����":

			new setF().run();
			break;

		case "��ü ��� ����":
			new ChangeWeek().run();
			break;
		}
	}

	public static void main(String[] args) {
		new UCheck().run();
	}
}

// System.out.println("�ҷ�����");
//// �̷��� �ϰ� ������ ������ ���� ������.
//// new CallData();