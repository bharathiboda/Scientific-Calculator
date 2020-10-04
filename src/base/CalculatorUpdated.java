package base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalculatorUpdated {

	private JFrame frmCal;
	private JTextField textField;
	double first;
	double second;
	String operator;
	String answer;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUpdated window = new CalculatorUpdated();
					window.frmCal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorUpdated() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCal = new JFrame();
		frmCal.setAlwaysOnTop(true);
		frmCal.getContentPane().setLayout(null);
		frmCal.setSize(400, 680);
		
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(10, 10, 358, 31);
		frmCal.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField.setBounds(23, 62, 343, 45);
		frmCal.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_log = new JButton("log");
		button_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.log10(Double.parseDouble(textField.getText()));
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
		});
		button_log.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_log.setBounds(23, 136, 70, 70);
		frmCal.getContentPane().add(button_log);
		
		JButton button_expo = new JButton("e^x");
		button_expo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				result = Math.exp(first);
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
		});
		button_expo.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_expo.setBounds(23, 205, 70, 70);
		frmCal.getContentPane().add(button_expo);
		
		JButton button_powY = new JButton("x^y");
		button_powY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operator = "x^y";
			
			}
		});
		button_powY.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_powY.setBounds(23, 275, 70, 70);
		frmCal.getContentPane().add(button_powY);
		
		JButton button_pow2 = new JButton("x^2");
		button_pow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.pow(2, Double.parseDouble(textField.getText()));
				answer = String.format("%.5f", result);
				textField.setText(answer);
			}
		});
		button_pow2.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_pow2.setBounds(23, 345, 70, 70);
		frmCal.getContentPane().add(button_pow2);
		
		JButton btnNewButton_2_2 = new JButton("\u03C0");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.PI;
			  answer = String.format("%.6f", result);
			  textField.setText(answer);
			}
		});
		btnNewButton_2_2.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_2.setBounds(23, 416, 70, 70);
		frmCal.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("\u221A");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.sqrt(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnNewButton_2_3.setFont(new Font("Cambria Math", Font.BOLD, 20));
		btnNewButton_2_3.setBounds(93, 136, 70, 70);
		frmCal.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("\u221B");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.cbrt(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnNewButton_2_4.setFont(new Font("Cambria Math", Font.BOLD, 21));
		btnNewButton_2_4.setBounds(163, 135, 70, 70);
		frmCal.getContentPane().add(btnNewButton_2_4);
		
		JButton button_sin = new JButton("sin");
		button_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.sin(Double.parseDouble(textField.getText()));
				answer = String.format("%.4f", result);
				textField.setText(answer);
			}
		});
		button_sin.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_sin.setBounds(93, 205, 70, 70);
		frmCal.getContentPane().add(button_sin);
		
		final JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_7.getText();
				textField.setText(number);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_7.setBounds(93, 345, 70, 70);
		frmCal.getContentPane().add(button_7);
		
		final JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_4.getText();
				textField.setText(number);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_4.setBounds(93, 416, 70, 70);
		frmCal.getContentPane().add(button_4);
		
		final JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_1.getText();
				textField.setText(number);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_1.setBounds(93, 486, 70, 70);
		frmCal.getContentPane().add(button_1);
		
		JButton button_cos = new JButton("cos");
		button_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.cos(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		button_cos.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_cos.setBounds(163, 205, 70, 70);
		frmCal.getContentPane().add(button_cos);
		
		final JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_8.getText();
				textField.setText(number);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_8.setBounds(163, 345, 70, 70);
		frmCal.getContentPane().add(button_8);
		
		final JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_5.getText();
				textField.setText(number);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_5.setBounds(163, 416, 70, 70);
		frmCal.getContentPane().add(button_5);
		
		 final JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_2.getText();
				textField.setText(number);
				}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_2.setBounds(163, 486, 70, 70);
		frmCal.getContentPane().add(button_2);
		
		final JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_0.getText();
				textField.setText(number);
				
			}
		});
		button_0.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_0.setBounds(93, 553, 140, 70);
		frmCal.getContentPane().add(button_0);
		
		JButton btnNewButton_5 = new JButton("cot");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = 1/Math.tan(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(233, 136, 70, 70);
		frmCal.getContentPane().add(btnNewButton_5);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.tan(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTan.setBounds(233, 205, 70, 70);
		frmCal.getContentPane().add(btnTan);
		
		final JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_9.getText();
				textField.setText(number);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_9.setBounds(233, 345, 70, 70);
		frmCal.getContentPane().add(button_9);
		
		final JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_6.getText();
				textField.setText(number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_6.setBounds(233, 416, 70, 70);
		frmCal.getContentPane().add(button_6);
		
		final JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_3.getText();
				textField.setText(number);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_3.setBounds(233, 486, 70, 70);
		frmCal.getContentPane().add(button_3);
		
		final JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dot = textField.getText() + button_dot.getText();
				textField.setText(dot);
				
			}
		});
		button_dot.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_dot.setBounds(233, 553, 70, 70);
		frmCal.getContentPane().add(button_dot);
		
		JButton btnCoth = new JButton("coth");
		btnCoth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = 1 / Math.tanh(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnCoth.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCoth.setBounds(302, 136, 70, 70);
		frmCal.getContentPane().add(btnCoth);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
				
			}
		});
		button_plus.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_plus.setBounds(302, 205, 70, 70);
		frmCal.getContentPane().add(button_plus);
		
		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		button_minus.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_minus.setBounds(302, 275, 70, 70);
		frmCal.getContentPane().add(button_minus);
		
		JButton button_multi = new JButton("*");
		button_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "*";
			}
		});
		button_multi.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_multi.setBounds(302, 345, 70, 70);
		frmCal.getContentPane().add(button_multi);
		
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});
		button_divide.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_divide.setBounds(302, 416, 70, 70);
		frmCal.getContentPane().add(button_divide);
		
		JButton button_reminder = new JButton("%");
		button_reminder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		button_reminder.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_reminder.setBounds(302, 486, 70, 70);
		frmCal.getContentPane().add(button_reminder);
		
		JButton button_equal = new JButton("=");
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operator == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				else if(operator == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operator == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operator == "x^y") {
					result = Math.pow(first, second);
					answer = String.format("%.6f", result);
					textField.setText(answer);
					}
			}
		});
		button_equal.setFont(new Font("Tahoma", Font.BOLD, 21));
		button_equal.setBounds(302, 553, 70, 70);
		frmCal.getContentPane().add(button_equal);
		
		JButton btnSinh_1 = new JButton("sinh");
		btnSinh_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.sinh(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnSinh_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSinh_1.setBounds(93, 275, 70, 70);
		frmCal.getContentPane().add(btnSinh_1);
		
		JButton btnNewButton_4_1 = new JButton("cosh");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.cosh(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_1.setBounds(163, 275, 70, 70);
		frmCal.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_5_1 = new JButton("tanh");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = Math.tanh(Double.parseDouble(textField.getText()));
				answer = String.format("%.6f", result);
				textField.setText(answer);
			}
		});
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5_1.setBounds(233, 275, 70, 70);
		frmCal.getContentPane().add(btnNewButton_5_1);
		
		JButton btnSinh = new JButton("Del");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() > 0) {
					textField.setText("");
				}
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSinh.setBounds(23, 486, 70, 70);
		frmCal.getContentPane().add(btnSinh);
		
		JButton btnNewButton_4 = new JButton("\uF0E7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()> 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
				    backSpace = str.toString();
				    textField.setText(backSpace);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Wingdings", Font.BOLD, 19));
		btnNewButton_4.setBounds(23, 553, 70, 70);
		frmCal.getContentPane().add(btnNewButton_4);
	}
}
