package gui.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import gui.controller.GUIAppController;

/**
 * @author ftha4681
 * @version 0.1 Nov 9, 2015 Basic constructor setup.
 * 
 */
public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the the button pls");
		firstTextField = new JTextField("You can put words in this box");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	/**
	 * Loads content onto the panel.
	 */
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);		//Needs to be the first line of the setupPanel helper method.
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
