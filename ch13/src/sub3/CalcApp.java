package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btnDiv;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMul;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMinus;
	private JButton btnC;
	private JButton btn0;
	private JButton btnValue;
	private JButton btnPlus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 410, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn7.setBounds(12, 77, 97, 63);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(116, 77, 97, 63);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(220, 77, 97, 63);
		contentPane.add(btn9);
		
		btnDiv = new JButton("/");
		btnDiv.setBounds(325, 77, 97, 63);
		contentPane.add(btnDiv);
		
		btn4 = new JButton("4");
		btn4.setBounds(12, 150, 97, 63);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(116, 150, 97, 63);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(220, 150, 97, 63);
		contentPane.add(btn6);
		
		btnMul = new JButton("*");
		btnMul.setBounds(325, 150, 97, 63);
		contentPane.add(btnMul);
		
		btn1 = new JButton("1");
		btn1.setBounds(12, 223, 97, 63);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(116, 223, 97, 63);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(220, 223, 97, 63);
		contentPane.add(btn3);
		
		btnMinus = new JButton("-");
		btnMinus.setBounds(325, 223, 97, 63);
		contentPane.add(btnMinus);
		
		btnC = new JButton("C");
		btnC.setBounds(12, 295, 97, 63);
		contentPane.add(btnC);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(116, 295, 97, 63);
		contentPane.add(btn0);
		
		btnValue = new JButton("=");
		btnValue.setBounds(220, 295, 97, 63);
		contentPane.add(btnValue);
		
		btnPlus = new JButton("+");
		btnPlus.setBounds(325, 295, 97, 63);
		contentPane.add(btnPlus);
	}

}
