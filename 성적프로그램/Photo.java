import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class Photo extends JComponent {
	MenuDemo md = new MenuDemo();
	SelectPhoto a = new SelectPhoto();
	public static final int IMG_WIDTH = 600;
	public static final int IMG_HEIGHT = 800;
	private static BufferedImage image = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, BufferedImage.TYPE_INT_ARGB);
	private static BufferedImage icon[] = { new BufferedImage(60, 34, BufferedImage.TYPE_INT_ARGB),
			new BufferedImage(60, 34, BufferedImage.TYPE_INT_ARGB),
			new BufferedImage(60, 34, BufferedImage.TYPE_INT_ARGB),
			new BufferedImage(60, 34, BufferedImage.TYPE_INT_ARGB) };

	public Photo() {
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if (image != null)
					g.drawImage(image, 0, 0, null);
				if (icon[0] != null && icon[1] != null && icon[2] != null && icon[3] != null)
					for (int i = 0; i < 10; i++) {
						g.drawImage(icon[0], 60 * i, 100, null);
						g.drawImage(icon[1], 60 * i, 134, null);
						g.drawImage(icon[2], 60 * i, 168, null);
						g.drawImage(icon[3], 60 * i, 202, null);
					}
			}
		};
		try {
			if (a.name.equals("��ȣ��")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\��ȣ��.PNG"));
			} else if (a.name.equals("�⼺��")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�⼺��.PNG"));
			} else if (a.name.equals("��Ǹ�")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\��Ǹ�.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("����ö")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\����ö.PNG"));
			} else if (a.name.equals("��ȫö")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\��ȫö.PNG"));
			} else if (a.name.equals("�޽�")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�޽�.PNG"));
			} else if (a.name.equals("�ΰ���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�ΰ���.PNG"));
			} else if (a.name.equals("�ڼ�ȫ")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�ڼ�ȫ.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("�����")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�����.PNG"));
			} else if (a.name.equals("�۹�ȣ")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�۹�ȣ.PNG"));
			} else if (a.name.equals("�ŵ���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�ŵ���.PNG"));
			} else if (a.name.equals("���缮")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\���缮.PNG"));
			} else if (a.name.equals("�̻��")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�̻��.PNG"));
			} else if (a.name.equals("�̼���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�̼���.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("����")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\����.PNG"));
			} else if (a.name.equals("�¾�")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�¾�.PNG"));
			} else if (a.name.equals("�ǿ�")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�ǿ�.PNG"));
			} else if (a.name.equals("����")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\����.PNG"));
			} else if (a.name.equals("ȣ����")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\ȣ����.PNG"));
			} else if (a.name.equals("���̸�")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\���̸�.PNG"));
			} else if (a.name.equals("����")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\����.PNG"));
			} else if (a.name.equals("����ȿ")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\����ȿ.PNG"));
			} else if (a.name.equals("�̱���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�̱���.PNG"));
			} else if (a.name.equals("�ں���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�ں���.PNG"));
			} else if (a.name.equals("����")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\����.PNG"));
			} else if (a.name.equals("���߱�")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\���߱�.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("�̺���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�̺���.PNG"));
			} else if (a.name.equals("���¸�")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\���¸�.PNG"));
			} else if (a.name.equals("�缼��")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�缼��.PNG"));
			} else if (a.name.equals("�ڳ���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�ڳ���.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("������")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\������.PNG"));
			} else if (a.name.equals("�ڽ���")) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\�ڽ���.PNG"));
			} else if (a.name.equals(md.stu[0].name)) {
				image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\��ް�ü����\\����.PNG"));
			}

		} catch (IOException e) {
			System.err.println(e);
		}
		JFrame application = new JFrame();
		application.add(panel, BorderLayout.CENTER);
		application.setSize(70, 200);
		application.setVisible(true);

	}

	public static void main(String[] args) {
		new Photo();
	}
}