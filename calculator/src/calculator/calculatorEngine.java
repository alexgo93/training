package calculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class calculatorEngine implements ActionListener {
		
		MyCalc parent; //������ �� ���� ������������
		
		char selectedAction = ' '; // +, -, / ��� *
		double currentResult = 0;
		
		//����������� ��������� ������ �� ���� ������������ � ���������� ���������� ������
		
		calculatorEngine(MyCalc parent) {
			this.parent = parent;
		}
		
		public void actionPerformed(ActionEvent e) {
			//�������� �������� ��������
			JButton clickedButton = (JButton) e.getSource();
			String dispFieldText = parent.displayField.getText();
			String clickedButtonLabel = clickedButton.getText();
			parent.displayField.setText(dispFieldText + clickedButtonLabel);
			
			double displayValue = 0;
			
			//�������� ����� �� ������� ������������,
			// ���� �� �� ������.
			//��������������� ���� = ��� �������� ���������
			
			if (!"".equals(dispFieldText)) {
				displayValue = Double.parseDouble(dispFieldText);
			}
			
			Object src = e.getSource();
			
			//��� ������ ������ ��������������� ��������
			//��������� ���:+, -, / ��� *, ��������� ������� �����
			//� ���������� currentResult, � �������� �������
			//��� ����� ������ �����
			
			if (src == parent.buttonSum) {
				selectedAction = '+';
				currentResult = displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonMinus) {
				selectedAction = '-';
				currentResult = displayValue;
				parent.displayField.setText("");
				
			} else if (src == parent.buttonMult) {
				selectedAction = '*';
				currentResult = displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonDiv) {
				selectedAction = '/';
				currentResult = displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonEqual) {
				//��������� �������������� ��������, � ����������� �� selectedAction, �������� ����������
				// currentResult � �������� ��������� �� �������
				
				if (selectedAction == '+') {
					currentResult+=displayValue;
					
					//��������������� ��������� � ������, �������� ��� � ������ ������ � �������� ���
					parent.displayField.setText(""+currentResult);
				} else if (selectedAction == '-') {
					currentResult-=displayValue;
					parent.displayField.setText(""+currentResult);
				} else if (selectedAction == '/') {
					currentResult/=displayValue;
					parent.displayField.setText(""+currentResult);
				} else if (selectedAction == '*') {
					currentResult*=displayValue;
					parent.displayField.setText(""+currentResult);
				} /*else {
					//��� ���� �������� ������ ������������ ������� �� ������ � ������� � �������
					String clickedButtonLabel = clickedButton.getText();
					parent.displayField.setText(dispFieldText + clickedButtonLabel);
				}*/
			}

		}
		
		
		
}
