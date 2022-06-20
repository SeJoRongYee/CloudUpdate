import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private String func ="ADD";
	private int firstNumber; //연산자를 눌렀을 경우 처음 입력한 숫자를
								//잃지 않고 저장하기 위한 필드변수
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBackground(UIManager.getColor("RadioButtonMenuItem.selectionBackground"));
		frame.setBounds(100, 100, 401, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel answer = new JLabel("0");
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 45));
		answer.setBounds(25, 30, 318, 83);
		frame.getContentPane().add(answer);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(248, 248, 255));
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn7.setBounds(25, 140, 75, 75);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(248, 248, 255));
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn8.setBounds(112, 140, 75, 75);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(248, 248, 255));
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn9.setBounds(199, 140, 75, 75);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str =answer.getText();
				firstNumber = Integer.parseInt(str);
				answer.setText("0");
				func = "ADD";
			}
		});
		btnPlus.setBackground(new Color(248, 248, 255));
		btnPlus.setForeground(new Color(0, 0, 0));
		btnPlus.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btnPlus.setBounds(286, 140, 75, 75);
		frame.getContentPane().add(btnPlus);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(248, 248, 255));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn4.setBounds(25, 225, 75, 75);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(248, 248, 255));
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn5.setBounds(112, 225, 75, 75);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(248, 248, 255));
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn6.setBounds(199, 225, 75, 75);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = answer.getText(); //answer에 텍스트 값을 불러옴
				firstNumber = Integer.parseInt(str); //텍스트 값을 정수로 바꿈
				answer.setText("0"); //버튼을 눌렀을 경우 0이 출력됨
				func = "SUB";
			}
		});
		btnSub.setBackground(new Color(248, 248, 255));
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btnSub.setBounds(286, 225, 75, 75);
		frame.getContentPane().add(btnSub);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(248, 248, 255));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn1.setBounds(25, 310, 75, 75);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(248, 248, 255));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn2.setBounds(112, 310, 75, 75);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(248, 248, 255));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn3.setBounds(199, 310, 75, 75);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str =answer.getText();
				firstNumber = Integer.parseInt(str);
				answer.setText("0");
				func = "MULT";
			}
		});
		btnMul.setBackground(new Color(248, 248, 255));
		btnMul.setForeground(new Color(0, 0, 0));
		btnMul.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btnMul.setBounds(286, 310, 75, 75);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str =answer.getText();
				firstNumber = Integer.parseInt(str);
				answer.setText("0");
				func = "DIV";
			}
		});
		btnDiv.setBackground(new Color(248, 248, 255));
		btnDiv.setForeground(new Color(0, 0, 0));
		btnDiv.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btnDiv.setBounds(286, 395, 75, 75);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //switch문을 사용하여 각 연산기호마다 출력을 설정
				switch(func) {
				case "ADD":{
					int strValue = Integer.parseInt(answer.getText()); 
					//ADD버튼 이후 누른 값을 읽어와서 정수로 변환후 대입
					answer.setText((firstNumber+strValue)+"");
					//정수 입력후 +""를 사용하면 String값으로 변환 가능
					break;
				}
				case "SUB":{
					int strValue = Integer.parseInt(answer.getText()); 
					//ADD버튼 이후 누른 값을 읽어와서 정수로 변환후 대입
					answer.setText((firstNumber-strValue)+"");
					//정수 입력후 +""를 사용하면 String값으로 변환 가능
					break;
				}
				case "MULT":{
					int strValue = Integer.parseInt(answer.getText()); 
					//ADD버튼 이후 누른 값을 읽어와서 정수로 변환후 대입
					answer.setText((firstNumber*strValue)+"");
					//정수 입력후 +""를 사용하면 String값으로 변환 가능
					break;
				}
				case "DIV":{
					int strValue = Integer.parseInt(answer.getText()); 
					//ADD버튼 이후 누른 값을 읽어와서 정수로 변환후 대입
					answer.setText((firstNumber/strValue)+"");
					//계산을 실행하는 명령어
					//정수 입력후 +""를 사용하면 String값으로 변환 가능
					break;
				}
				
				}
			}
		});
		btnEnter.setBackground(new Color(248, 248, 255));
		btnEnter.setForeground(new Color(0, 0, 0));
		btnEnter.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btnEnter.setBounds(199, 395, 75, 75);
		frame.getContentPane().add(btnEnter);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(248, 248, 255));
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btn0.setBounds(112, 395, 75, 75);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton("");
		btnDot.setBackground(new Color(248, 248, 255));
		btnDot.setForeground(new Color(0, 0, 0));
		btnDot.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 30));
		btnDot.setBounds(25, 395, 75, 75);
		frame.getContentPane().add(btnDot);
		
		btn0.addActionListener(new NumberAL(answer,"0"));
		btn1.addActionListener(new NumberAL(answer,"1"));
		btn2.addActionListener(new NumberAL(answer,"2"));
		btn3.addActionListener(new NumberAL(answer,"3"));
		btn4.addActionListener(new NumberAL(answer,"4"));
		btn5.addActionListener(new NumberAL(answer,"5"));
		btn6.addActionListener(new NumberAL(answer,"6"));
		btn7.addActionListener(new NumberAL(answer,"7"));
		btn8.addActionListener(new NumberAL(answer,"8"));
		btn9.addActionListener(new NumberAL(answer,"9"));
		
	}
}

class NumberAL implements ActionListener{
	private JLabel label;
	private String text;
	
	public NumberAL(JLabel l, String s) {
		label =l;
		text =s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = label.getText();
		if(str.equals("0")) {
			label.setText(text);
		}else {
			label.setText(label.getText()+text);
		}
		
	}
	
}
