package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIAppController;

/*
 * @author ftha4681
 * @version 0.x Nov 9, 2015
 * 
 */
public class GUIFrame extends JFrame
{
	
	private GUIAppController baseController;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
	}
}
