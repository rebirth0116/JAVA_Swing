package calculator;


import java.awt.Dimension;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	Dimension butDim = new Dimension(100, 50);
	JPanel panel = new JPanel();
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
//	JButton button3 = new JButton("3");
//	JButton button4 = new JButton("4");
//	JButton button5 = new JButton("5");
//	JButton button6 = new JButton("6");
//	JButton button7 = new JButton("7");
//	JButton button8 = new JButton("8");
//	JButton button9 = new JButton("9");
	
	
	MyFrame(){

//		setTitle("계산기");
		super("계산기");
		setLocation(700, 200);
		setSize(500, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 사용이유 : X버튼을 누르면 프레임은 닫히지만 프로그램은 종료되지 않아서 프로그램도 종료하기 위해 사용
		add(panel);

		button1.setPreferredSize(butDim);
		panel.add(button1);
		panel.add(button2);
		setVisible(true);
		
	}
	
}
