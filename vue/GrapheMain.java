package vue;

import javax.swing.SwingUtilities;

public class GrapheMain {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable()
				{
					public void run(){
						new Menu().display();
					}
					
				});
		
	}
	
}
