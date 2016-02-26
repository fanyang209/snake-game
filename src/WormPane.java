import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class WormPane extends JFrame implements KeyListener {

	int rows = 350;
	int cols = 350;
	static Node food;

	public LinkedList<Node> foods = new LinkedList<Node>();

	public WormPane(){

		addKeyListener(this);
		worm = new Worm();

		foods.add(new Node(70,90));


//		initFoods(5);
	}

	/*public void initFoods(int n){
		Random r = new Random();
		while(true){
			int i = r.nextInt(rows-2)+1;
			int j = r.nextInt(cols)-2+1;
			if(worm.contains(i, j)){
				continue;
			}
			food = new Node(i,j);
			if(foods.contains(food)){
				continue;
			}
			foods.add(food);
			if(foods.size()==n){
				break;
			}

		}
	}*/


	private String line1 = "";

	Worm worm = new Worm();

	public Worm getWorm(){
		return worm;
	}

	public void paint(Graphics g) {
		super.paint(g);

		for(int i=0;i<worm.nodes.size();i++) {
			g.setColor(Color.red);
			g.fillOval(worm.nodes.get(i).getX(),worm.nodes.get(i).getY(),10,10 );
		}


			if(foods!= null) {
				g.setColor(Color.blue);
				g.fillOval(foods.getFirst().getX(), foods.getFirst().getY(), 10, 10);
			}

	}





	@Override
	public void keyTyped(KeyEvent event) {

	}

	@Override
	public void keyPressed(KeyEvent event) {

		line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(event.getKeyCode())); // show
		// pressed
		// key
		// setLines2and3(event); // set output lines two and three

		System.out.println(line1);
//		System.out.println("ddd");

		int keyCode = event.getKeyCode();
		// System.out.println(KeyEvent.VK_UP);
		switch (keyCode) {
			case KeyEvent.VK_W:
				Move(0, -10);
				break;
			case KeyEvent.VK_S:
				Move(0, 10);
				break;
			case KeyEvent.VK_A:
				Move(-10, 0);
				break;
			case KeyEvent.VK_D:
				Move(10, 0);
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {

	}

	public void Move(int x, int y) {
		Node head = worm.nodes.getFirst();
//    		System.out.print(nodes.getFirst());
		int x1 = head.getX() + x;
		int y1 = head.getY() + y;

		head = new Node(x1, y1);
		worm.nodes.addFirst(head);
		worm.nodes.removeLast();

		Graphics g = getGraphics();
		repaint();

		for(int i=0;i<worm.nodes.size();i++) {
			g.setColor(Color.red);
			g.fillOval(worm.nodes.get(i).getX(),worm.nodes.get(i).getY(),10,10 );
		}

		System.out.println(head);
		System.out.println(foods);

		if(foods.contains(head))
		{
			System.out.println("sss");
			foods.remove(head);

		}

	}
//	public void print(){
//
//		for(int i=0;i<rows;i++){
//			for(int j=0;j<cols;j++){
//				if(i==0 || i==rows-1){
//					System.out.print("-");
//				}else if(j==0 || j==cols-1){
//					System.out.print("|");
//				}else if(worm.nodes.contains(new Node(i,j))){
//					System.out.print("#");
//				}else{
//					System.out.print(" ");
//				}
////				  System.out.print((new Node(i,j)));
//			}
//			System.out.println();
//		}
//	}
}
