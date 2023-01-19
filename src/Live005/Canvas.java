package Live005;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Canvas extends JPanel implements Runnable{

	private Robo javaBot;
	
	public Canvas() {
		
		javaBot = new Robo();
		
		Thread gameloop = new Thread(this);
		gameloop.start();
	}
	
	private void atualiza() {
		
		javaBot.atualizar();
		
	}
	
	
	@Override
	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);
		
		Graphics2D g = (Graphics2D) g2.create();
		
		g.setColor(Color.white);
		g.fillRect(0,0,1366,730);
		
		javaBot.pintar(g);
		
	}

	@Override
	public void run() {
		while(true) {
			atualiza();
			
			repaint();
			
			dorme();
		}
		
	}

	private void dorme() {
		
		try {
			Thread.sleep(16);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
