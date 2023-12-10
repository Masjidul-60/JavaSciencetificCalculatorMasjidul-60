import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ScientificCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	double number;
	double first;
	double second;
	String operation;
	double result;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator frame = new ScientificCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ScientificCalculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\msi\\OneDrive\\Desktop\\Picture1.png"));
		setTitle("Scientific Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 250, 437, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(10, 13, 397, 62);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnplusminus = new JButton("+/_");
		btnplusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(String.valueOf(textField.getText()));
				first = first*(-1);
				textField.setText(String.valueOf(first));
			}
		});
		btnplusminus.setForeground(Color.BLACK);
		btnplusminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplusminus.setBounds(10, 468, 90, 52);
		contentPane.add(btnplusminus);
		
		JButton button0 =new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button0.getText();
				textField.setText(number);
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 18));
		button0.setForeground(Color.BLACK);
		button0.setBounds(113, 468, 90, 52);
		contentPane.add(button0);
		
		JButton button_p = new JButton(".");
		button_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button_p.getText();
				textField.setText(number);
			}
		});
		button_p.setForeground(Color.BLACK);
		button_p.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_p.setBounds(215, 468, 90, 52);
		contentPane.add(button_p);
		
		JButton button_equal = new JButton("=");
				button_equal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String answer;
						second = Double.parseDouble(textField.getText());
						if(operation == "+")
						{
							result = first + second;
							textField.setText(String.valueOf(result));
						}
						else if(operation == "-")
						{
							result = first - second;
							textField.setText(String.valueOf(result));
						}
						else if(operation == "*")
						{
							result = first * second;
							textField.setText(String.valueOf(result));
						}
						else if(operation == "/")
						{
							result = first / second;
							textField.setText(String.valueOf(result));
						}
						else if(operation == "pow")
						{
							result = Math.pow(first,second);
							textField.setText(String.valueOf(result));
						}
			}
		});
		button_equal.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_equal.setForeground(Color.BLACK);
		button_equal.setBounds(317, 468, 90, 52);
		contentPane.add(button_equal);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button1.getText();
				textField.setText(number);
			}
		});
		button1.setForeground(Color.BLACK);
		button1.setFont(new Font("Tahoma", Font.BOLD, 17));
		button1.setBounds(10, 409, 90, 52);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button2.getText();
				textField.setText(number);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button2.setForeground(Color.BLACK);
		button2.setBounds(113, 409, 90, 52);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button3.getText();
				textField.setText(number);
			}
		});
		button3.setForeground(Color.BLACK);
		button3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button3.setBounds(215, 409, 90, 52);
		contentPane.add(button3);
		
		JButton buttonplus = new JButton("+");
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						first = Double.parseDouble(textField.getText());
						textField.setText("");
						operation = "+";
			}
		});
		buttonplus.setForeground(Color.BLACK);
		buttonplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonplus.setBounds(317, 409, 90, 52);
		contentPane.add(buttonplus);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button4.getText();
				textField.setText(number);
			}
		});
		button4.setForeground(Color.BLACK);
		button4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button4.setBounds(10, 348, 90, 52);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button5.getText();
				textField.setText(number);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button5.setForeground(Color.BLACK);
		button5.setBounds(113, 348, 90, 52);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button6.getText();
				textField.setText(number);
			}
		});
		button6.setForeground(Color.BLACK);
		button6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button6.setBounds(215, 348, 90, 52);
		contentPane.add(button6);
		
		JButton buttonminus = new JButton("\u2013");
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		buttonminus.setForeground(Color.BLACK);
		buttonminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonminus.setBounds(317, 348, 90, 52);
		contentPane.add(buttonminus);
		
		JButton buttonmulti = new JButton("\u00D7");
		buttonmulti.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonmulti.setForeground(Color.BLACK);
		buttonmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		buttonmulti.setBounds(317, 290, 90, 52);
		contentPane.add(buttonmulti);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button9.getText();
				textField.setText(number);
			}
		});
		button9.setForeground(Color.BLACK);
		button9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button9.setBounds(215, 290, 90, 52);
		contentPane.add(button9);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button8.getText();
				textField.setText(number);
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button8.setForeground(Color.BLACK);
		button8.setBounds(113, 290, 90, 52);
		contentPane.add(button8);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button7.getText();
				textField.setText(number);
			}
		});
		button7.setForeground(Color.BLACK);
		button7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button7.setBounds(10, 290, 90, 52);
		contentPane.add(button7);
		
		JButton btnroot = new JButton("\u221A");
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(String.valueOf(textField.getText()));
				number = Math.pow(number,0.5);
				textField.setText(String.valueOf(number));
			}
		});
		btnroot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnroot.setForeground(Color.BLACK);
		btnroot.setBounds(10, 229, 90, 52);
		contentPane.add(btnroot);
		
		JButton buttonsq = new JButton("X\u00B2");
		buttonsq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number = Double.parseDouble(String.valueOf(textField.getText()));
				number = number*number;
				textField.setText(String.valueOf(number));
			}
		});
		buttonsq.setForeground(Color.BLACK);
		buttonsq.setFont(new Font("Tahoma", Font.BOLD, 17));
		buttonsq.setBounds(113, 229, 90, 52);
		contentPane.add(buttonsq);
		
		JButton buttonxn = new JButton("X\u207F");
				buttonxn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						first = Double.parseDouble(textField.getText());
						textField.setText("");
						operation = "pow";
			}
		});
		buttonxn.setForeground(Color.BLACK);
		buttonxn.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonxn.setBounds(215, 229, 90, 52);
		contentPane.add(buttonxn);
		
		JButton buttondiv = new JButton("\u00F7");
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		buttondiv.setForeground(Color.BLACK);
		buttondiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttondiv.setBounds(317, 229, 90, 52);
		contentPane.add(buttondiv);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTan.setForeground(Color.BLACK);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				double degrees = (Double.parseDouble(textField.getText())); 
				  
		        double radians = Math.toRadians(degrees); 
		  
		        double tanValue = Math.tan(radians);
		        answer = String.format("%.2f",tanValue);
				textField.setText(answer);
			}
		});
		btnTan.setBounds(317, 171, 90, 52);
		contentPane.add(btnTan);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				double degrees = (Double.parseDouble(textField.getText())); 
				  
		        double radians = Math.toRadians(degrees); 
		  
		        double cosValue = Math.cos(radians);
		        answer = String.format("%.2f",cosValue);
				textField.setText(answer);
			}
		});
		btnCos.setForeground(Color.BLACK);
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCos.setBounds(215, 171, 90, 52);
		contentPane.add(btnCos);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				double degrees = (Double.parseDouble(textField.getText())); 
				  
		        double radians = Math.toRadians(degrees); 
		  
		        double sinValue = Math.sin(radians);
		        answer = String.format("%.2f",sinValue);
				textField.setText(answer);
				
			}
		});
		btnSin.setForeground(Color.BLACK);
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSin.setBounds(113, 171, 90, 52);
		contentPane.add(btnSin);
		
		JButton btnfact = new JButton("n!");
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number =(Double.parseDouble(textField.getText()));
				   double f=1;
				    while(number!=0)
				    {
				     f=f*number;
				     number--;
				    }
					textField.setText("");
					textField.setText(textField.getText()+f);

			}
		});
		btnfact.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnfact.setForeground(Color.BLACK);
		btnfact.setBounds(10, 171, 90, 52);
		contentPane.add(btnfact);
		
		JButton btnDel = new JButton("Del");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnDel.setForeground(Color.BLACK);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDel.setBounds(318, 113, 90, 52);
		contentPane.add(btnDel);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    double number = Double.parseDouble(textField.getText()); 
				    double logValue = Math.log10(number);
				    textField.setText("");
				    textField.setText(String.valueOf(logValue));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLog.setForeground(Color.BLACK);
		btnLog.setBounds(215, 113, 90, 52);
		contentPane.add(btnLog);
		
		JButton btn_pi = new JButton("\u03C0");
		btn_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_pi.getText();
				double result = 3.141592653589793238462643383279502884197;
				textField.setText(String.valueOf(result));
			}
		});
		btn_pi.setForeground(Color.BLACK);
		btn_pi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_pi.setBounds(113, 113, 90, 52);
		contentPane.add(btn_pi);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnAc.setForeground(Color.BLACK);
		btnAc.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAc.setBounds(10, 113, 90, 52);
		contentPane.add(btnAc);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button0.setEnabled(false);
				button_p.setEnabled(false);
				btnplusminus.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBackground(new Color(0, 153, 153));
		rdbtnOff.setBounds(10, 81, 57, 25);
		contentPane.add(rdbtnOff);
		
		
		JRadioButton rdbtnOn_1 = new JRadioButton("ON");
		rdbtnOn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				button0.setEnabled(true);
				button_p.setEnabled(true);
				btnplusminus.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnOn_1);
		rdbtnOn_1.setBackground(new Color(0, 153, 153));
		rdbtnOn_1.setBounds(113, 81, 57, 25);
		contentPane.add(rdbtnOn_1);
		
	}
}
