import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

Timer timer;
final int MENU_STATE= 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
Font titleFont;
//GameObject myGameObject;

GamePanel (){
	timer = new Timer(50/3, this);
	titleFont = new Font("Arial", Font.PLAIN, 48);
	//myGameObject = new GameObject();

}

void startGame(){
	
	timer.start();
}

void updateMenuState(){}

void updateGameState(){}

void updateEndState(){}

void drawMenuState(Graphics g){
	
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
	g.setFont(titleFont);
	g.drawString("Saam west", 200, 400);
	
}

void drawGameState(Graphics g){	
	
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
	
}

void drawEndState(Graphics g){
	
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
		
}

public void paintComponent(Graphics g){
	//myGameObject.draw(g);
	if(currentState == MENU_STATE){
		drawMenuState(g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}
}


public void actionPerformed(ActionEvent e) {
	repaint();
	//myGameObject.update();

	if(currentState == MENU_STATE){
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}
	
	
	
	
}

@Override
public void keyTyped(KeyEvent e) {
	System.out.println("keytyped");
	
}

@Override
public void keyPressed(KeyEvent e) {

	if(e.getKeyCode()==KeyEvent.VK_ENTER){	
		System.out.println("keypressed");
		if(currentState == MENU_STATE ){
			currentState = GAME_STATE;
		}
		else if(currentState == GAME_STATE ){
			currentState = END_STATE;
		}
		else if(currentState == END_STATE ){
			currentState = MENU_STATE;
		}
		
		
	}
	
}

@Override
public void keyReleased(KeyEvent e) {
	System.out.println("keyreleased");
	
}
	
	
}
