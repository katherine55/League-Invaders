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
Font enterFont;
Font spaceFont;

Font overFont;
Font killFont;
Font backFont;
//GameObject myGameObject;

GamePanel (){
	timer = new Timer(50/3, this);
	titleFont = new Font("Arial", Font.PLAIN, 48);
	enterFont = new Font("Arial", Font.PLAIN, 24);
	spaceFont = new Font("Arial", Font.PLAIN, 24);
	
	overFont = new Font("Arial", Font.PLAIN, 48);
	killFont = new Font("Arial", Font.PLAIN, 24);
	backFont = new Font("Arial", Font.PLAIN, 24);
	//myGameObject = new GameObject();

}

Rocketship denny = new Rocketship(250,700, 50,50);

void startGame(){
	
	timer.start();
}

void updateMenuState(){}

void updateGameState(){
	
	denny.update();
	
}

void updateEndState(){}

void drawMenuState(Graphics g){
	
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
	g.setColor(Color.yellow);
	g.setFont(titleFont);
	g.drawString("LEAGUE INVADERS", 25, 200);
	
	g.setColor(Color.yellow);
	g.setFont(enterFont);
	g.drawString("Press ENTER to start", 130, 300);
	
	g.setColor(Color.yellow);
	g.setFont(spaceFont);
	g.drawString("Press SPACE  for instructions", 90, 400);
	
}

void drawGameState(Graphics g){	
	
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
	denny.draw(g);
	
}

void drawEndState(Graphics g){
	
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	
	g.setColor(Color.black);
	g.setFont(overFont);
	g.drawString("GAME OVER", 95, 200);
	
	g.setColor(Color.black);
	g.setFont(killFont);
	g.drawString("You killed " + "0" + " aliens.", 145, 375);
	
	g.setColor(Color.black);
	g.setFont(backFont);
	g.drawString("Press BACKSPACE to Restart", 80, 550);
		
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
	
	if(e.getKeyCode()==KeyEvent.VK_LEFT){
		
	denny.left=true;
		
	}
	
	if(e.getKeyCode()==KeyEvent.VK_RIGHT){
		
		denny.right=true;
			
		}
	
	if(e.getKeyCode()==KeyEvent.VK_UP){
		
		denny.up=true;
			
		}
	
	if(e.getKeyCode()==KeyEvent.VK_DOWN){
		
	denny.down=true;
			
		}
	
}

@Override
public void keyReleased(KeyEvent e) {
	System.out.println("keyreleased");
	if(e.getKeyCode()==KeyEvent.VK_UP){
		denny.up=false;
	}
	if(e.getKeyCode()==KeyEvent.VK_DOWN){
		denny.down=false;
	}
	if(e.getKeyCode()==KeyEvent.VK_RIGHT){
		denny.right=false;
	}
	if(e.getKeyCode()==KeyEvent.VK_LEFT){
		denny.left=false;
	}
	
	
	
}
	
	
}
