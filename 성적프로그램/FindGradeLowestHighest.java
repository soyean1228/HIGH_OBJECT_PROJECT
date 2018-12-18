import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindGradeLowestHighest {
	JFrame window = new JFrame();
	Student[] stu;
	int stuNum;

	public FindGradeLowestHighest(String str, Student[] stu, int stuNum) {
		window.setTitle(str);
		window.setLocation(500, 200);
		window.setSize(250, 150);
		this.stu = stu;
		this.stuNum = stuNum;
		JPanel p = new JPanel();
		JLabel o;
		if (str.equals("��޺� �ְ� ���� Ȯ��")) {
			o = new JLabel("���� �ְ� ������");
		} else {
			o = new JLabel("���� ���� ������");
		}
		p.add(o);

		JPanel s = new JPanel();
		JTextField ScoreField = new JTextField(10);
		ScoreField.setForeground(Color.BLACK);
		ScoreField.setEnabled(false);
		JButton jb = new JButton("Ȯ��");
		s.add(ScoreField);
		s.add(jb);
		String[] option = { "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" };
		JPanel op = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JComboBox<String> cb = new JComboBox<>(option);
		cb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox) e.getSource();
				int index = cb.getSelectedIndex();
				double score = 0;
				switch (index) {
				case 0: // A+�ΰ��
					score = getLowestScore("A+", str);
					break;
				case 1:
					score = getLowestScore("A", str);
					getLowestScore("A", str);
					break;
				case 2:
					score = getLowestScore("B+", str);
					getLowestScore("B+", str);
					break;
				case 3:
					score = getLowestScore("B", str);
					getLowestScore("B", str);
					break;
				case 4:
					score = getLowestScore("C+", str);
					getLowestScore("C+", str);
					break;
				case 5:
					score = getLowestScore("C", str);
					getLowestScore("C", str);
					break;
				case 6:
					score = getLowestScore("D+", str);
					getLowestScore("D+", str);
					break;
				case 7:
					score = getLowestScore("D", str);
					getLowestScore("D", str);
					break;
				case 8:
					score = getLowestScore("F", str);
					getLowestScore("F", str);
					break;
				}
				ScoreField.setText(Double.toString(score));
			}

			public double getLowestScore(String grade, String s) {
				Double lowestScore = 0.0;
				Double highestScore = 0.0;
				Double[] gradeScore = new Double[40];
				int gradeNum = 0;
				try {
					// ���� ��� A+�� ���õǸ� A+�� ���� ������ ���� ������ ã�Ƴ���
					if (s.equals("��޺� �ְ� ���� Ȯ��")) {
						System.out.print(grade);
						// �ش� ��� ������ �迭�� �ֱ�
						for (int i = 0; i < stuNum; i++) {
							if (grade.equals(stu[i].getRank())) {
								highestScore = Double.parseDouble(stu[i].getAll());
								gradeScore[gradeNum] = highestScore;
								gradeNum++;
							}
						}
						// ���� �迭�� �� ���� ���� ���� Ȯ��
						highestScore = gradeScore[0];
						System.out.println("�ְ�����");
						for (int i = 1; i < gradeNum; i++) {
							if (highestScore < gradeScore[i]) {
								highestScore = gradeScore[i];
							}
						}
						return highestScore;

					} else {
						System.out.print(grade);
						System.out.print("���� ����");
						// �ش� ��� ������ �迭�� �ֱ�
						for (int i = 0; i < stuNum; i++) {
							if (grade.equals(stu[i].getRank())) {
								lowestScore = Double.parseDouble(stu[i].getAll());
								gradeScore[gradeNum] = lowestScore;
								gradeNum++;
							}
						}
						// ���� �迭�� �� ���� ���� ���� Ȯ��
						lowestScore = gradeScore[0];
						System.out.println("��������");
						for (int i = 1; i < gradeNum; i++) {
							if (lowestScore > gradeScore[i]) {
								lowestScore = gradeScore[i];
							}
						}
					}
					return lowestScore;
				} catch (NullPointerException np) {
					JOptionPane.showMessageDialog(null, "�ش� ��޿��� �л��� �����ϴ�.");
				}
				return 0.0;
			}
		});
		op.add(cb);
		op.add(p);
		jb.addActionListener(l);
		window.add(op, BorderLayout.CENTER);
		window.add(s, BorderLayout.SOUTH);
		window.setVisible(true);
	}

	ActionListener l = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			{
				window.dispose();
			}
		}
	};
}