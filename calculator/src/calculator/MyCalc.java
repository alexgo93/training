package calculator;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;



public class MyCalc {
	JPanel windowContent;
	JFormattedTextField displayField;
	JButton numButtons[];
	JButton buttonPoint;
	JButton buttonEqual;
	JPanel p1;
	JPanel p2;
	JButton buttonSum;
	JButton buttonMinus;
	JButton buttonDiv;
	JButton buttonMult;
	// � ������������ ��������� ��� ����������
	// � ����������� �� ����� � ������� ����������
	// BorderLayout � GridLayout
	MyCalc() {
		windowContent = new JPanel();
		
		//������ ����� ��� ���� ������
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		
		// ������� � ���������� ����
		// ��������� ��� � �������� ������� ����
		
		displayField = new JFormattedTextField();
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		windowContent.add("North",displayField);
		
		// ������� ������, ��������� �����������
		// ������ JButton, ������� ��������� �����
		// ������ � �������� ���������
		

		numButtons = new JButton[10];
		buttonPoint=new JButton(".");
		buttonEqual=new JButton("=");
		buttonSum=new JButton("+");
		buttonMinus=new JButton("-");
		buttonDiv=new JButton("/");
		buttonMult=new JButton("*");
		calculatorEngine calcEngine = new calculatorEngine(this);
		
		
		// ������� ������ � GridLayout
		// ������� �������� 12 ������ - 10 ������ � �������
		// � ������ � ������ � ������ �����
		
		p1 = new JPanel();
		GridLayout gl = new GridLayout(4,3);
		p1.setLayout(gl);
		for(int i=0;i<10;i++){
			numButtons[i]=new JButton(""+i);
			numButtons[i].addActionListener(calcEngine);
			if(i==0) {
				
				continue;
			}
			
			p1.add(numButtons[i]);
			if(i==9) {
				p1.add(numButtons[0]);
			}
			}
		// ��������� ������ �� ������ p1
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		
		// �������� ������ p1 � ����������� ������� ����
		windowContent.add("Center",p1);
		
		
		p2 = new JPanel();
		GridLayout gl1 = new GridLayout(4,1);
		p2.setLayout(gl1);
		
		
		p2.add(buttonSum);
		p2.add(buttonMinus);
		p2.add(buttonDiv);
		p2.add(buttonMult);
		
		windowContent.add("East",p2);
		
		// ������� ����� � ������ ��� �������� ������
		JFrame frame = new JFrame("MyCalc");
		frame.setContentPane(windowContent);
		
		//������ ������ ���� �����������
		//��� ����, ����� �������� ��� ����������
		frame.pack();
		
		//���������� ����
		frame.setVisible(true);
		
		
		buttonPoint.addActionListener(calcEngine);
		buttonSum.addActionListener(calcEngine);
		buttonMinus.addActionListener(calcEngine);
		buttonDiv.addActionListener(calcEngine);
		buttonMult.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
	}
	public static void main(String[] args) {
		MyCalc calc = new MyCalc();			
		}

}
