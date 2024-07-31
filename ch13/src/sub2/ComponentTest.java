package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUid;
	private JTextField textName;
	private JTextField textHp;
	private JTextField txtPlus1;
	private JTextField txtPlus2;
	private JTextField txtPlusResult;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 76, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("확인1 버튼 클릭...");
			}
		});
		btn1.setBounds(12, 60, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(121, 60, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭!");
				}else {
					System.out.println("NO 클릭!");
				}
			}
		});
		btn3.setBounds(230, 60, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 93, 97, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 121, 43, 15);
		contentPane.add(lblNewLabel_2);
		
		textUid = new JTextField();
		textUid.setBounds(59, 118, 116, 21);
		contentPane.add(textUid);
		textUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과 : ");
		lbResultUid.setBounds(250, 121, 57, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = textUid.getText();
				lbResultUid.setText("결과 : " + uid);
				
			}
		});
		btnUid.setBounds(181, 118, 57, 23);
		contentPane.add(btnUid);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 149, 43, 15);
		contentPane.add(lblNewLabel_2_1);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(59, 146, 116, 21);
		contentPane.add(textName);
		
		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(250, 149, 57, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textName.getText();
				lbResultName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(181, 146, 57, 23);
		contentPane.add(btnName);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("휴대폰");
		lblNewLabel_2_1_1.setBounds(12, 177, 43, 15);
		contentPane.add(lblNewLabel_2_1_1);
		
		textHp = new JTextField();
		textHp.setColumns(10);
		textHp.setBounds(59, 174, 116, 21);
		contentPane.add(textHp);
		
		JLabel lbResultHp = new JLabel("결과 : ");
		lbResultHp.setBounds(250, 177, 57, 15);
		contentPane.add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = textHp.getText();
				lbResultHp.setText("결과 : " + hp);
			}
		});
		btnHp.setBounds(181, 174, 57, 23);
		contentPane.add(btnHp);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("덧셈");
		lblNewLabel_2_1_1_1.setBounds(12, 207, 43, 15);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		txtPlus1 = new JTextField();
		txtPlus1.setBounds(59, 204, 57, 21);
		contentPane.add(txtPlus1);
		txtPlus1.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("+");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setBounds(121, 207, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		txtPlus2 = new JTextField();
		txtPlus2.setColumns(10);
		txtPlus2.setBounds(146, 204, 57, 21);
		contentPane.add(txtPlus2);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setBounds(215, 207, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		txtPlusResult = new JTextField();
		txtPlusResult.setColumns(10);
		txtPlusResult.setBounds(250, 204, 57, 21);
		contentPane.add(txtPlusResult);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum1 = txtPlus1.getText();
				String strNum2 = txtPlus2.getText();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				int num3 = num1 + num2;
				
				txtPlusResult.setText(""+num3);
				
			}
		});
		btnPlus.setBounds(318, 203, 57, 23);
		contentPane.add(btnPlus);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("뺄셈");
		lblNewLabel_2_1_1_1_2.setBounds(12, 239, 43, 15);
		contentPane.add(lblNewLabel_2_1_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(59, 236, 57, 21);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("-");
		lblNewLabel_2_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_2.setBounds(121, 239, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(146, 236, 57, 21);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1_1.setBounds(215, 239, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(250, 236, 57, 21);
		contentPane.add(textField_5);
		
		JButton btnHp_1_1 = new JButton("확인");
		btnHp_1_1.setBounds(318, 235, 57, 23);
		contentPane.add(btnHp_1_1);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("곱셈");
		lblNewLabel_2_1_1_1_3.setBounds(12, 271, 43, 15);
		contentPane.add(lblNewLabel_2_1_1_1_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(59, 268, 57, 21);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel("*");
		lblNewLabel_2_1_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_3.setBounds(121, 271, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(146, 268, 57, 21);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1_2.setBounds(215, 271, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(250, 268, 57, 21);
		contentPane.add(textField_8);
		
		JButton btnHp_1_2 = new JButton("확인");
		btnHp_1_2.setBounds(318, 267, 57, 23);
		contentPane.add(btnHp_1_2);
		
		JLabel lblNewLabel_2_1_1_1_4 = new JLabel("나눗셈");
		lblNewLabel_2_1_1_1_4.setBounds(12, 308, 43, 15);
		contentPane.add(lblNewLabel_2_1_1_1_4);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(59, 305, 57, 21);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_2_1_1_1_1_4 = new JLabel("/");
		lblNewLabel_2_1_1_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_4.setBounds(121, 308, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(146, 305, 57, 21);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_2_1_1_1_1_1_3 = new JLabel("=");
		lblNewLabel_2_1_1_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1_3.setBounds(215, 308, 21, 15);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(250, 305, 57, 21);
		contentPane.add(textField_11);
		
		JButton btnHp_1_3 = new JButton("확인");
		btnHp_1_3.setBounds(318, 304, 57, 23);
		contentPane.add(btnHp_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("체크박스 실습");
		lblNewLabel_3.setBounds(12, 345, 97, 15);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 366, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(73, 366, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(134, 366, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(195, 366, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(250, 366, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 : ");
		lbResultCheck.setBounds(12, 399, 295, 15);
		contentPane.add(lbResultCheck);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbResultCheck.setText("결과 : " + cities);
			}
		});
		btnCheck.setBounds(318, 366, 57, 23);
		contentPane.add(btnCheck);
		
		JLabel lblNewLabel_4 = new JLabel("테이블 실습");
		lblNewLabel_4.setBounds(12, 424, 76, 15);
		contentPane.add(lblNewLabel_4);
		
		table = new JTable();
		table.setBounds(12, 449, 363, 107);
		contentPane.add(table);
		
		// 테이블 설정
				String[] coulumNames = {"아이디", "이름", "나이", "휴대폰"};
				
				DefaultTableModel model = new DefaultTableModel(coulumNames, 0);
				model.setRowCount(0);
				table.setModel(model);
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101", "김유신", "23", "010-1234-1001"));
				persons.add(new Person("a102", "김춘추", "21", "010-1234-1002"));
				persons.add(new Person("a103", "장보고", "33", "010-1234-1003"));
				persons.add(new Person("a104", "강감찬", "43", "010-1234-1004"));
				persons.add(new Person("a105", "이순신", "53", "010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};}
					//model.addRow(rowData);
			}
		});
		btnNewButton.setBounds(12, 559, 97, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
