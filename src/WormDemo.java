

import javax.swing.*;
import java.util.Scanner;

public class WormDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WormPane pane = new WormPane();
//		JFrame frame = new JFrame( "Demonstrating FontMetrics" );

		pane.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//		pane.add(pane);
		pane.setSize( 350, 350 ); // set frame size
		pane.setVisible( true ); // display frame

//      Scanner s = new Scanner(System.in);
     

      Worm worm = pane.getWorm();
      
   /*   while(true){
//    	  pane.print();
    	  
    	  String dir = s.nextLine();

    	  if(dir.equals("w"))
    		  worm.Move(-1,0);
    	  else if(dir.equals("s"))
    		  worm.Move(1,0);
    	  else if(dir.equals("a"))
    		  worm.Move(0,-1);
    	  else if(dir.equals("d"))
    		  worm.Move(0,1);
      }*/
	}

}
