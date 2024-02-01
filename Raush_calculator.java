
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Raush_calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Raush_calculator window = new Raush_calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Raush_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 361, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("RAUSHAN CALCULATOR");
		lblNewLabel.setBounds(10, 20, 322, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(10, 32, 387, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton xupto1 = new JButton("1/x");
		xupto1.setEnabled(false);
		xupto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		xupto1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		xupto1.setBounds(10, 162, 58, 62);
		frame.getContentPane().add(xupto1);

		JButton yuptox = new JButton("X^Y");
		yuptox.setEnabled(false);
		yuptox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";

			}
		});
		yuptox.setFont(new Font("Tahoma", Font.BOLD, 10));
		yuptox.setBounds(10, 224, 58, 62);
		frame.getContentPane().add(yuptox);

		JButton xto3 = new JButton("X^3");
		xto3.setEnabled(false);
		xto3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		xto3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		xto3.setBounds(10, 288, 58, 62);
		frame.getContentPane().add(xto3);

		JButton xto2 = new JButton("X^2");
		xto2.setEnabled(false);
		xto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		xto2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		xto2.setBounds(10, 352, 58, 62);
		frame.getContentPane().add(xto2);

		JButton facto = new JButton("n!");
		facto.setEnabled(false);
		facto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while (a != 0) {
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}

		});
		facto.setFont(new Font("Tahoma", Font.BOLD, 16));
		facto.setBounds(10, 418, 58, 62);
		frame.getContentPane().add(facto);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPlusMinus.setBounds(10, 490, 58, 62);
		frame.getContentPane().add(btnPlusMinus);

		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEx.setBounds(74, 105, 58, 62);
		frame.getContentPane().add(btnEx);

		JButton btnlog = new JButton("Log");
		btnlog.setEnabled(false);
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnlog.setBounds(74, 164, 58, 62);
		frame.getContentPane().add(btnlog);

		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";

			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPercent.setBounds(74, 226, 58, 62);
		frame.getContentPane().add(btnPercent);

		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(74, 290, 58, 62);
		frame.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(74, 354, 58, 62);
		frame.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(74, 420, 58, 62);
		frame.getContentPane().add(btn1);

		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClear.setBounds(142, 226, 58, 62);
		frame.getContentPane().add(btnClear);

		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(142, 290, 58, 62);
		frame.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(142, 354, 58, 62);
		frame.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(142, 420, 58, 62);
		frame.getContentPane().add(btn2);

		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);

			}
		});
		btn0.setFont(new Font("Wingdings", Font.BOLD, 16));
		btn0.setBounds(78, 492, 122, 62);
		frame.getContentPane().add(btn0);

		JButton btnBackSpace = new JButton("\uF0e7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;

				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);

				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 12));
		btnBackSpace.setBounds(211, 224, 58, 62);
		frame.getContentPane().add(btnBackSpace);

		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(211, 288, 58, 62);
		frame.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(211, 352, 58, 62);
		frame.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(211, 418, 58, 62);
		frame.getContentPane().add(btn3);

		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBounds(211, 490, 58, 62);
		frame.getContentPane().add(btnDot);

		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTan.setBounds(284, 103, 58, 62);
		frame.getContentPane().add(btnTan);

		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);

				} else if (operation == "X^Y") {
					double resultt = 1;
					for (int i = 0; i < second; i++) {
						resultt = first * resultt;

					}
					answer = String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEqual.setBounds(284, 490, 58, 62);
		frame.getContentPane().add(btnEqual);

		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDivide.setBounds(284, 418, 58, 62);
		frame.getContentPane().add(btnDivide);

		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMul.setBounds(284, 352, 58, 62);
		frame.getContentPane().add(btnMul);

		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSub.setBounds(284, 288, 58, 62);
		frame.getContentPane().add(btnSub);

		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdd.setBounds(284, 224, 58, 62);
		frame.getContentPane().add(btnAdd);

		JButton sqrt = new JButton("\u221A");
		sqrt.setEnabled(false);
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		sqrt.setFont(new Font("Tahoma", Font.PLAIN, 10));
		sqrt.setBounds(10, 105, 58, 62);
		frame.getContentPane().add(sqrt);

		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCos.setBounds(210, 105, 58, 62);
		frame.getContentPane().add(btnCos);

		JButton btnsin = new JButton("Sin");
		btnsin.setEnabled(false);
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnsin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnsin.setBounds(142, 105, 58, 62);
		frame.getContentPane().add(btnsin);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTanh.setBounds(284, 162, 58, 62);
		frame.getContentPane().add(btnTanh);

		JButton btncosh = new JButton("Cosh");
		btncosh.setEnabled(false);
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btncosh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btncosh.setBounds(211, 162, 58, 62);
		frame.getContentPane().add(btncosh);

		JButton btnsinh = new JButton("Sinh");
		btnsinh.setEnabled(false);
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnsinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnsinh.setBounds(142, 162, 58, 62);
		frame.getContentPane().add(btnsinh);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				sqrt.setEnabled(true);
				xupto1.setEnabled(true);
				yuptox.setEnabled(true);
				xto3.setEnabled(true);
				xto2.setEnabled(true);
				facto.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnCos.setEnabled(true);
				btnsin.setEnabled(true);
				btnTan.setEnabled(true);
				btnsinh.setEnabled(true);
				btnTanh.setEnabled(true);
				btncosh.setEnabled(true);
				btnPercent.setEnabled(true);
				btnlog.setEnabled(true);
				btnEx.setEnabled(true);
				btnClear.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnEqual.setEnabled(true);
				textField.setEnabled(true);

			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 78, 103, 29);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				sqrt.setEnabled(false);
				xupto1.setEnabled(false);
				yuptox.setEnabled(false);
				xto3.setEnabled(false);
				xto2.setEnabled(false);
				facto.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnCos.setEnabled(false);
				btnsin.setEnabled(false);
				btnTan.setEnabled(false);
				btnsinh.setEnabled(false);
				btnTanh.setEnabled(false);
				btncosh.setEnabled(false);
				btnPercent.setEnabled(false);
				btnlog.setEnabled(false);
				btnEx.setEnabled(false);
				btnClear.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnEqual.setEnabled(false);
				textField.setEnabled(false);

			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(152, 82, 103, 29);
		frame.getContentPane().add(rdbtnOff);
	}
}
