import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;

public class TotalGraph extends JFrame {
	static TotalGraphPanel dp = new TotalGraphPanel();

	public static class scoreInsert {

		public static void insert() {
			int numA1 = 0; // A+�� �л��� ��
			int numA0 = 0; // A�� �л��� ��
			int numB1 = 0; // B+�� �л��� ��
			int numB0 = 0; // B+�� �л��� ��
			int numC1 = 0; // C+�� �л��� ��
			int numC0 = 0; // C0�� �л��� ��
			int numD = 0; // D�� �л��� ��
			int numF = 0; // F�� �л��� ��

			System.out.println("���� Ȯ��");
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = makeConnection();
				String sql = "SELECT * FROM person";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					String score = rs.getString("rank_total");
					if ("A+".equals(score)) {
						System.out.println("num1");
						numA1 = numA1 + 1;
					}
					if ("A0".equals(score)) {
						numA0 = numA0 + 1;
					}
					if ("B+".equals(score)) {
						numB1 = numB1 + 1;
					}
					if ("B0".equals(score)) {
						numB0 = numB0 + 1;
					}
					if ("C+".equals(score)) {
						numC1 = numC1 + 1;
					}
					if ("C0".equals(score)) {
						numC0 = numC0 + 1;
					}
					if ("D".equals(score)) {
						numD = numD + 1;
					}
					if ("F".equals(score)) {
						numF = numF + 1;
					}
				}
				dp.setNums(numA1, numA0, numB1, numB0, numC1, numC0, numD, numF);
			} catch (Exception e) {
				System.out.println("���� 1" + e.getMessage());
				System.out.println("����1");
			} finally {
				close(con, pstmt);
				System.out.println("����");
			}
		}
	}

	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:1234/score?characterEncoding=UTF-8&serverTimezone=UTC";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("�����ͺ��̽� ���� ��...");
			con = DriverManager.getConnection(url, "root", "1234");
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (SQLException ex) {
			System.out.println("SQLException : " + ex.getMessage());
		}
		return con;
	}

	public TotalGraph() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׷���");
		setLocation(500, 200);
		setSize(590, 400);

		add(dp, BorderLayout.CENTER);
		setVisible(true);
		setResizable(false);
	}

	public static void close(Connection con, PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}