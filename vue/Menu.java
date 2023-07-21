package vue;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.creationgraphe;

@SuppressWarnings("deprecation")
public class Menu extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JFrame mainframe;
	creationgraphe modelcreation;
	JTextField text1;
	JButton nouveau;
	JButton charger;
	
	public Menu() {
		createModel();
		createView();
		createComposant();
		createController();
	}
	
	public void display() {
		refresh();
		mainframe.pack();
		mainframe.setLocationRelativeTo(null);
		mainframe.setVisible(true);

	}
	
	private void createModel() {
		modelcreation =new creationgraphe();
		
	}

	private void createView() {
		int width=200,height=300;
		mainframe=new JFrame("graphe tp");
		mainframe.setPreferredSize(new Dimension(height,width));
		text1=new JTextField("Choisir une des deux options");
		nouveau =new JButton("Nouveau graphe");
		charger=new JButton("Charger un graphe");
	}

	private void createComposant() {
		JPanel P=new JPanel();
		{
			P.add(text1);
		}
		JPanel P1=new JPanel();
		{
			P1.add(nouveau);
			P1.add(charger);
		}
		mainframe.add(P1,BorderLayout.SOUTH);
		mainframe.add(P,BorderLayout.NORTH);
	}

	private void createController() {
		
		((Observable) modelcreation).addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
				
				refresh();
			}
		});
		nouveau.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
					}	
				});
	}
	private void refresh() {
		mainframe.getContentPane();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
