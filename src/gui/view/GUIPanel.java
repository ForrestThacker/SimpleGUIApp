package gui.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import gui.controller.GUIAppController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		firstButton = new JButton("Do not click the button pls");
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
	
	/**
	 * Helper method to hold ugly GUI layout code.
	 */
	
	private void setupLayout()
	{   baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 65, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 0, SpringLayout.WEST, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 320, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 117, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -181, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Pls no click it");
			}
		});
	}
}
