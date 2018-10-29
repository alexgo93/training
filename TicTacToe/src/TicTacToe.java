import java.applet.Applet;
import java.awt.BorderLayout;
// import java.awt.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends Applet implements ActionListener {
	
	Button squares[];
	Button newGameButton;
	Label score;
	

	
	int emptySquaresLeft=9;
	
	public void actionPerformed(ActionEvent e) {
		
		Button theButton = (Button) e.getSource();
		
		
		if (theButton ==newGameButton){
			for(int i=0;i<9;i++){
				squares[i].setEnabled(true);
				squares[i].setLabel("");
				squares[i].setBackground(Color.ORANGE);
			}
			
			emptySquaresLeft=9;
			score.setText("Your turn!");
			newGameButton.setEnabled(false);
			
		} else {// usual buttons
			String winner = "";
			// Это одна из клеток?
			for ( int i=0; i<9; i++ ) {
				if ( theButton == squares[i] ) {
					squares[i].setLabel("X");
					winner = lookForWinner();
					if(!"".equals(winner)){
						endTheGame();
					} else {
						computerMove();
						winner = lookForWinner();
						if ( !"".equals(winner)){
							endTheGame();
						}
					}
					break;
				}
			} // конец цикла for
		
			if ( winner.equals("X") ) {
				score.setText("You won!");
			} else if (winner.equals("O")){
				score.setText("You lost!");
			} else if (winner.equals("T")){
				score.setText("It's a tie!");
			}
		}		
			
		



	}
	
	private void computerMove() {
		// TODO Auto-generated method stub
		
	}

	private void endTheGame() {
		// TODO Auto-generated method stub
		
	}

	public void init(){
		setLayout(new BorderLayout());
		setBackground(Color.CYAN);
		
		Font appletFont=new Font("Monospased",Font.BOLD, 20);
		this.setFont(appletFont);
		
		newGameButton=new Button("New Game");
		newGameButton.addActionListener(this);
		
		Panel topPanel=new Panel();
		topPanel.add(newGameButton);
		this.add(topPanel,"North");
		Panel centerPanel=new Panel();
		centerPanel.setLayout(new GridLayout(3,3));
		this.add(centerPanel,"Center");
		
		score=new Label("Your turn!");
		this.add(score,"South");
		
		squares=new Button[9];
		// Создаем кнопки, сохраняем ссылки на них в массиве
		// регистрируем в них слушатель, красим их
		// в оранжевый цвет и добавляем на панель
		for(int i=0;i<9;i++){
			squares[i]=new Button();
			squares[i].addActionListener(this);
			squares[i].setBackground(Color.ORANGE);
			centerPanel.add(squares[i]);
		}
		
	}


	String lookForWinner() {
		String theWinner = "";
		emptySquaresLeft--;
		
		if (emptySquaresLeft==0){
			return "T"; // это ничья. T от английского слова tie
		}
		
		
		return null;
	}
	
}
