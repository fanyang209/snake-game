import java.util.LinkedList;

public class Worm {
	private int dir;
    public LinkedList<Node> nodes = new LinkedList<Node>();
    
    public Worm(){
		nodes.add(new Node(30,90));
		nodes.add(new Node(40,90));
		nodes.add(new Node(50,90));
		nodes.add(new Node(50,100));
		nodes.add(new Node(50,110));
		nodes.add(new Node(60,110));
		nodes.add(new Node(70,110));
//		dir = 1;
	}
    
 
    
    public boolean contains(int i, int j){
		return nodes.contains(new Node(i,j));
	}




//    		System.out.print(nodes);
    }
  

