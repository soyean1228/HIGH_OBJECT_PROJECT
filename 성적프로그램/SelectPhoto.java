import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SelectPhoto {
	public static String name;
	JFrame window = new JFrame();
	BufferedImage img;
	MenuDemo a = new MenuDemo();

	public SelectPhoto() {

		JPanel p = new JPanel();
		JLabel o = new JLabel("�̸�:");
		JTextField f = new JTextField(15);

		p.add(o);
		p.add(f);
		System.out.println(a.stu[0].name);
		JPanel p2 = new JPanel();
		JButton j = new JButton("�˻�");
		p2.add(j);
		f.setText("" + "");
		window.add(p, BorderLayout.NORTH);
		System.out.println(f.getText());
		window.add(p2, BorderLayout.SOUTH);
		// JPanel p1 = new JPanel();
		System.out.println(f.getText());
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String getE = a.stu[0].name;
				getE = getE.replace(" ", "");
				name = f.getText();
				if (name.equals("")) {

					JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���", "����", JOptionPane.ERROR_MESSAGE);
				} else {

					if (name.equals("��ȣ��")) {
						new Photo();
					} else if (name.equals("�⼺��")) {
						new Photo();
					} else if (name.equals(a.stu[0].name.replace(" ", ""))) {
						new Photo();
					} else if (name.equals("��Ǹ�")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("����ö")) {
						new Photo();
					} else if (name.equals("��ȫö")) {
						new Photo();
					} else if (name.equals("�޽�")) {
						new Photo();
					} else if (name.equals("�ΰ���")) {
						new Photo();
					} else if (name.equals("�ڼ�ȫ")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("�����")) {
						new Photo();
					} else if (name.equals("�۹�ȣ")) {
						new Photo();
					} else if (name.equals("�ŵ���")) {
						new Photo();
					} else if (name.equals("���缮")) {
						new Photo();
					} else if (name.equals("�̻��")) {
						new Photo();
					} else if (name.equals("�̼���")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("����")) {
						new Photo();
					} else if (name.equals("�¾�")) {
						new Photo();
					} else if (name.equals("�ǿ�")) {
						new Photo();
					} else if (name.equals("����")) {
						new Photo();
					} else if (name.equals("ȣ����")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("���̸�")) {
						new Photo();
					} else if (name.equals("����")) {
						new Photo();
					} else if (name.equals("����ȿ")) {
						new Photo();
					} else if (name.equals("�̱���")) {
						new Photo();
					} else if (name.equals("�ں���")) {
						new Photo();
					} else if (name.equals("����")) {
						new Photo();
					} else if (name.equals("���߱�")) {
						new Photo();
					} else if (name.equals("�̺���")) {
						new Photo();
					} else if (name.equals("���¸�")) {
						new Photo();
					} else if (name.equals("�缼��")) {
						new Photo();
					} else if (name.equals("�ڳ���")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("������")) {
						new Photo();
					} else if (name.equals("�ڽ���")) {
						new Photo();
					} else if (name.equals("û��")) {
						new Photo();
					} else {
						JOptionPane.showMessageDialog(null, "�ش� �л��� ������ �����ϴ�.", "����", JOptionPane.ERROR_MESSAGE);
					}
				}

			}

		};

		j.addActionListener(l);

	};

	void show() {

		window.setTitle("�����˻�");
		window.setLocation(20, 20);
		window.setSize(260, 100);
		window.setVisible(true);
	}

	public static void main(String[] args) throws SQLException {

		new SelectPhoto();
	}

	public void paintComponent(Graphics g) {
		window.paintComponents(g);
		g.drawImage(img, 0, 0, null);
	}
}