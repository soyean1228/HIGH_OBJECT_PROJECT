import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaveNum_Peo extends JFrame {
	MenuDemo m = new MenuDemo();

	void run() {
		setTitle("�л� �� ����");

		JPanel p = new JPanel();
		JTextField t = new JTextField("�л� ���� �Է��ϼ���.", 16);
		JButton b = new JButton("����");
		p.add(t);
		p.add(b);
		add(p);
		ActionListener listener = e -> {
			if (e.getSource() == b) {
				if (t.getText().isEmpty())
					t.setText("������ �Է��ϼ���!");
				else {
					m.How_many_stu = Integer.parseInt(t.getText());
					dispose();
				}
			}
		};

		b.addActionListener(listener);

		setSize(300, 100);
		setVisible(true);

	}

}