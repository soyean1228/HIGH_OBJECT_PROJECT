import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SetGrade {
	JFrame window = new JFrame();
	MenuDemo pr = new MenuDemo();

	void show() {
		window.setTitle("��� ����");
		window.setLocation(20, 20);
		window.setSize(405, 220);
		window.setVisible(true);
	}

	public SetGrade() {

		JPanel p = new JPanel();
		JLabel o = new JLabel("��� ����(%)");

		p.add(o);

		JPanel p1 = new JPanel();
		JPanel a = new JPanel();
		JLabel a1 = new JLabel("A+");
		JTextField a2 = new JTextField(5);
		a2.setText("" + 10);
		JPanel b = new JPanel();
		JLabel b1 = new JLabel("A");
		JTextField b2 = new JTextField(5);
		b2.setText("" + 20);
		JPanel c = new JPanel();
		JLabel c1 = new JLabel("B+");
		JTextField c2 = new JTextField(5);
		c2.setText("" + 40);
		JPanel d = new JPanel();
		JLabel d1 = new JLabel("B");
		JTextField d2 = new JTextField(5);
		d2.setText("" + 50);
		JPanel e = new JPanel();
		JLabel e1 = new JLabel("C+");
		JTextField e2 = new JTextField(5);
		e2.setText("" + 60);
		JPanel f = new JPanel();
		JLabel f1 = new JLabel("C");
		JTextField f2 = new JTextField(5);
		f2.setText("" + 70);
		JPanel g = new JPanel();
		JLabel g1 = new JLabel("D+");
		JTextField g2 = new JTextField(5);
		g2.setText("" + 80);
		JPanel h = new JPanel();
		JLabel h1 = new JLabel("D");
		JTextField h2 = new JTextField(5);
		h2.setText("" + 90);
		JPanel i = new JPanel();
		JLabel i1 = new JLabel("F");
		JTextField i2 = new JTextField(5);
		i2.setText("" + 100);

		JButton jb = new JButton("�Ϸ�");
		// �߰� �⸻ ���� ���� ��ǥ ���� �⼮ ��Ÿ
		a.add(a1);
		a.add(a2);
		b.add(b1);
		b.add(b2);
		c.add(c1);
		c.add(c2);
		d.add(d1);
		d.add(d2);
		e.add(e1);
		e.add(e2);
		f.add(f1);
		f.add(f2);
		g.add(g1);
		g.add(g2);
		h.add(h1);
		h.add(h2);
		i.add(i1);
		i.add(i2);

		p1.add(a);
		p1.add(b);
		p1.add(c);
		p1.add(e);
		p1.add(f);
		p1.add(g);
		p1.add(h);
		p1.add(i);
		p1.add(jb);

		JPanel p2 = new JPanel();
		JLabel ex = new JLabel("(����: A+:10 A:20 B+:40 B:60)");
		JLabel ex1 = new JLabel("F ������ 100%�� �������Ѵ�");

		p2.add(ex);
		p2.add(ex1);

		window.add(p, BorderLayout.NORTH);
		window.add(p1, BorderLayout.CENTER);
		window.add(p2, BorderLayout.SOUTH);
		// JPanel p1 = new JPanel();

		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{

					String gd = i2.getText();
					Double total1;
					total1 = Double.parseDouble(gd);

					String gd1 = a2.getText();
					Double total2;
					total2 = Double.parseDouble(gd1);

					String gd2 = b2.getText();
					Double total9;
					total9 = Double.parseDouble(gd2);

					String gd3 = c2.getText();
					Double total3;
					total3 = Double.parseDouble(gd3);

					String gd4 = d2.getText();
					Double total4;
					total4 = Double.parseDouble(gd4);

					String gd5 = e2.getText();
					Double total5;
					total5 = Double.parseDouble(gd5);

					String gd6 = f2.getText();
					Double total6;
					total6 = Double.parseDouble(gd6);

					String gd7 = g2.getText();
					Double total7;
					total7 = Double.parseDouble(gd7);

					String gd8 = h2.getText();
					Double total8;
					total8 = Double.parseDouble(gd8);

					if (total1 != 100) {

						JOptionPane.showMessageDialog(null, "������ ����(F)�� 100% �� �����ϼ���", "���� ����",
								JOptionPane.ERROR_MESSAGE);
					} else if (total2 > 100 || total3 > 100 || total4 > 100 || total5 > 100 || total6 > 100
							|| total7 > 100 || total8 > 100 || total9 > 100) {
						JOptionPane.showMessageDialog(null, "A+ ~ F ������ �ٽ� �����ϼ���", "���� ����", JOptionPane.ERROR_MESSAGE);
					} else {

						String aa = a2.getText();
						String a = b2.getText();
						String bb = c2.getText();
						String b = d2.getText();
						String cc = e2.getText();
						String c = f2.getText();
						String d = g2.getText();
						String f = h2.getText();

						pr.per1[0] = Double.parseDouble(aa) / 100;
						pr.per1[1] = Double.parseDouble(a) / 100;
						pr.per1[2] = Double.parseDouble(bb) / 100;
						pr.per1[3] = Double.parseDouble(b) / 100;
						pr.per1[4] = Double.parseDouble(cc) / 100;
						pr.per1[5] = Double.parseDouble(c) / 100;
						pr.per1[6] = Double.parseDouble(d) / 100;
						pr.per1[7] = Double.parseDouble(f) / 100;
						window.dispose();
					}

				}

			}

		};
		jb.addActionListener(l);

	}

	public static void main(String[] args) throws SQLException {
		// show();
		new SetGrade();
	}
}