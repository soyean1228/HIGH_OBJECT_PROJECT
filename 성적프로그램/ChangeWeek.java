import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeWeek extends JFrame {
	UCheck u = new UCheck();

	void run() {
		setTitle("��ü ��� ����");

		JPanel p = new JPanel();
		JTextField t = new JTextField(16);
		t.setText("�����ϰ� ���� �ָ� �Է��ϼ���");
		JButton b = new JButton("����");
		p.add(t);
		p.add(b);
		add(p);
		ActionListener listener = e -> {
			if (e.getSource() == b) {
				if (isStringDouble(t.getText()) == false)
					t.setText("�����ϰ� ���� �ָ� �Է��ϼ���!!!!!!!!!");
				else {
					u.setWeek(Integer.parseInt(t.getText()));
					for (int i = 0; i < 40; i++) {
						if (u.stuAtt[i] == null) {
							break;
						} else {
							u.stuAtt[i].CheckAttend[u.getWeek() + 1] = "o";
							// System.out.println(u.getWeek());
							// System.out.println(u.stuAtt[i].CheckAttend[u.getWeek() + 1]);
						}
					}
					dispose();

				}

			}
		};

		b.addActionListener(listener);

		setSize(300, 100);
		setVisible(true);

	}

	public static boolean isStringDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
