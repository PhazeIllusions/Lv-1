import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painter extends JPanel implements MouseListener, MouseMotionListener, ActionListener, KeyListener{
	Color c;
	Color g;
    JFrame window;
    
    ArrayList<Dot> dots = new ArrayList<Dot>();
    
    public static void main(String[] args) {
   	 new Painter();
    }
    
    public Painter(){
    	
   	 window = new JFrame();
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.setVisible(true);
   	 window.pack();
   	 window.addMouseListener(this);
   	 window.addMouseMotionListener(this);
   	 window.addKeyListener(this);
   	 //1. Make the window respond to mouse clicks
   	 //2. Use the addDot() method to create a new dot at the mouse's x and y position when the mouse is clicked.
    }
    
    public void paintComponent(Graphics g){
   	 for(Dot d : dots){
   		 d.draw(g);
   	 }
    }
    
    private void addDot(int x, int y){
   	 dots.add(new Dot(x, y, 1000, 1000));
    }


    private class Dot{
   	 int x;
   	 int y;
   	 int width;
   	 int height;
   	 
   	 public Dot(int x, int y, int width, int height){
   		 this.x = x;
   		 this.y = y;
   		 this.width = width;
   		 this.height = height;
   	 }
   	 
   	 public void draw(Graphics g){
   		 g.setColor(c);
   		 g.setColor(g);
   	
   		 g.fillRect(x, y, width, height);
   		 
   	 }
    }




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
		int x = e.getX();
		int y = e.getY();
		addDot(x, y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
		int x = e.getX();
		int y = e.getY();
		addDot(x, y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
		int x = e.getX();
		int y = e.getY();
		addDot(x, y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		repaint();
		int x = e.getX();
		int y = e.getY();
		addDot(x, y);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_W){
		Color c = new Color(152, 200, 102);
	;
	;
	;
	;
		}
		if(e.getKeyCode() == KeyEvent.VK_D){
			
			Color g = new Color(193, 234, 74);
			}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
    
}
