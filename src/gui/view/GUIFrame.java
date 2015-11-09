package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;

/*
 * Creates the Frame for the GUI project.
 * @author ftha4681
 * @version 0.3 Nov 9, 2015 Added a reference to the GUIPanel and installed it as he content pane.
 * Added the setupFrame helper method.
 * 
 */
public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
		basePanel = new GUIPanel(baseController);  //Creates an instance of a GUIPanel with a reference to the controller.
		setupFrame();
	}
	
	/*
	 * Helper method to setup the Frame and its structure.
	 */
	private void setupFrame()
	
	{
		this.setContentPane(basePanel);	//Sets the panel in the GUIFrame, this REQUIRED!!!
		this.setResizable(false);	 	//Usually a good idea but is not required.
		this.setSize(400,400); 			//Sets the size.
		this.setVisible(true);			//Must be the last line of code in the setupFrame method.
	}
}
