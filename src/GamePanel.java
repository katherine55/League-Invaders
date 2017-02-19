import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

Timer timer;
GameObject myGameObject;


GamePanel (){
	timer = new Timer(50/3, this);
	myGameObject = new GameObject();

}

void startGame(){
	
	timer.start();
}

public void paintComponent(Graphics g){
	
}


public void actionPerformed(ActionEvent e) {

	repaint();
}

@Override
public void keyTyped(KeyEvent e) {
	System.out.println("keytyped");
	
}

@Override
public void keyPressed(KeyEvent e) {
	System.out.println("keypressed");
	
}

@Override
public void keyReleased(KeyEvent e) {
	System.out.println("keyreleased");
	
}
	
	
}
