package gui.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import gui.controller.GUIAppController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JRadioButton;


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
		setBackground(UIManager.getColor("textHighlight"));
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click the button pls");
		firstButton.setForeground(new Color(0, 0, 0));
		firstButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		firstButton.setBackground(new Color(255, 192, 203));
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 116, SpringLayout.WEST, this);
		firstTextField = new JTextField("You can put words in this box");
		firstTextField.setBackground(new Color(250, 128, 114));
		firstTextField.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 24, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 127, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 0, SpringLayout.EAST, firstButton);
	
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
		
		JSlider slider = new JSlider();
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -39, SpringLayout.NORTH, slider);
		baseLayout.putConstraint(SpringLayout.NORTH, slider, 172, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, slider, -129, SpringLayout.EAST, this);
		add(slider);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Wow so code much developing");
		baseLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 24, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rdbtnNewRadioButton, -26, SpringLayout.SOUTH, this);
		add(rdbtnNewRadioButton);
	}
	
	/**
	 * Helper method to hold ugly GUI layout code.
	 */
	
	private void setupLayout()
	{
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
