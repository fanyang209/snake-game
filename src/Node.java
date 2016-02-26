
public class Node {
  int x, y;
  
  public Node(int x, int y){
	  this.x = x;
	  this.y = y;
  }
  
  public int getX(){
	  return x;
  }
  
  public void setX(int x){
	  this.x = x;
  }
  
  public int getY(){
	  return y;
  }
  
  public void setY(int y){
	  this.y = y;
  }

	public String toString(){
		return "["+x+","+y+"]";
	}

	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Node){
			Node o =(Node) obj;
			return this.x == o.x && this.y == o.y;
		}
		return false;
	}
  
//  public String toString(){
//	   return "["+x+","+y+"]";
//  }
  
//  public boolean equals(Object obj){
//	   if(obj==null)
//		   return false;
//	   if(this == obj)
//		   return true;
//	   if(obj instanceof Node){
//		   Node o =(Node) obj;
//		   return this.x == o.x && this.y == o.y;
//	   }
//	   return false;
//  }
}
