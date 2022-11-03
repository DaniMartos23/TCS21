package Dani.TA21;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(78, 11, 482, 69);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(78, 79, 482, 59);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton_1.setBounds(193, 327, 59, 59);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("7");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_1_1.setBounds(193, 209, 59, 59);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_1_2.setBounds(193, 268, 59, 59);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("2");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_1_3.setBounds(252, 327, 59, 59);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_1_4.setBounds(252, 268, 59, 59);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("8");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_1_5.setBounds(252, 209, 59, 59);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("9");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_1_6.setBounds(310, 209, 59, 59);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("6");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_1_7.setBounds(310, 268, 59, 59);
		contentPane.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("3");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_1_8.setBounds(310, 327, 59, 59);
		contentPane.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("0");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_1_9.setBounds(252, 386, 59, 59);
		contentPane.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton(",");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_1_10.setBounds(310, 386, 59, 59);
		contentPane.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("C");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1_11.setBounds(193, 386, 59, 59);
		contentPane.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_6_1 = new JButton("X");
		btnNewButton_1_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"x");
			}
		});
		btnNewButton_1_6_1.setBounds(369, 209, 59, 59);
		contentPane.add(btnNewButton_1_6_1);
		
		JButton btnNewButton_1_6_2 = new JButton("-");
		btnNewButton_1_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		btnNewButton_1_6_2.setBounds(369, 268, 59, 59);
		contentPane.add(btnNewButton_1_6_2);
		
		JButton btnNewButton_1_6_3 = new JButton("+");
		btnNewButton_1_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
			}
		});
		btnNewButton_1_6_3.setBounds(369, 327, 59, 59);
		contentPane.add(btnNewButton_1_6_3);
		
		JButton btnNewButton_1_6_4 = new JButton("=");
		btnNewButton_1_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calcula calcu= new Calcula();
				textField_1.setText(calcu.calculaResultado(textField.getText()));
				textField.setText("");
			}

			
		});
		btnNewButton_1_6_4.setBounds(369, 386, 59, 59);
		contentPane.add(btnNewButton_1_6_4);
		
		JButton btnNewButton_1_6_1_1 = new JButton("/");
		btnNewButton_1_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"/");
			}
		});
		btnNewButton_1_6_1_1.setBounds(369, 149, 59, 59);
		contentPane.add(btnNewButton_1_6_1_1);
		
		JButton btnNewButton_1_6_1_2 = new JButton("√x");
		btnNewButton_1_6_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"√");
			}
		});
		btnNewButton_1_6_1_2.setBounds(310, 149, 59, 59);
		contentPane.add(btnNewButton_1_6_1_2);
		
		JButton btnNewButton_1_6_1_3 = new JButton("x²");
		btnNewButton_1_6_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"²");
			}
		});
		btnNewButton_1_6_1_3.setBounds(252, 149, 59, 59);
		contentPane.add(btnNewButton_1_6_1_3);
		
		JButton btnNewButton_1_6_1_4 = new JButton("DEL");
		btnNewButton_1_6_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=textField.getText();
				if(text != "") {
					text=text.substring(0,(text.length()-1));
				}
				textField.setText(text);
			}
		});
		btnNewButton_1_6_1_4.setBounds(193, 149, 59, 59);
		contentPane.add(btnNewButton_1_6_1_4);
		
		
	}
	
	
}
