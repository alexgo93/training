package calculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class calculatorEngine implements ActionListener {
		
		MyCalc parent; //ссылка на окно калькулятора
		
		char selectedAction = ' '; // +, -, / или *
		double currentResult = 0;
		
		//конструктор сохраняет ссылку на окно калькулятора в переменной экземпляра класса
		
		calculatorEngine(MyCalc parent) {
			this.parent = parent;
		}
		
		public void actionPerformed(ActionEvent e) {
			//получить источник действия
			JButton clickedButton = (JButton) e.getSource();
			String dispFieldText = parent.displayField.getText();
			String clickedButtonLabel = clickedButton.getText();
			parent.displayField.setText(dispFieldText + clickedButtonLabel);
			
			double displayValue = 0;
			
			//Получить число из дисплея калькулятора,
			// если он не пустой.
			//Восклицательный знак = это оператор отрицания
			
			if (!"".equals(dispFieldText)) {
				displayValue = Double.parseDouble(dispFieldText);
			}
			
			Object src = e.getSource();
			
			//Для каждой кнопки арифметического действия
			//Запомнить его:+, -, / или *, сохранить текущее число
			//в переменной currentResult, и очистить дисплей
			//для ввода нового числа
			
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
				//Совершить арифметические действия, в зависимости от selectedAction, обновить переменную
				// currentResult и показать результат на дисплее
				
				if (selectedAction == '+') {
					currentResult+=displayValue;
					
					//сконвертировать результат в строку, добавляя его к пустой строке и показать его
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
					//Для всех цифровых кнопок присоединить надпись на кнопке к надписи в дисплее
					String clickedButtonLabel = clickedButton.getText();
					parent.displayField.setText(dispFieldText + clickedButtonLabel);
				}*/
			}

		}
		
		
		
}
