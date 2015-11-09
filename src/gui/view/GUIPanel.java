package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;

/**
 * @author ftha4681
 * @version 0.1 Nov 9, 2015 Basic constructor setup.
 * 
 */
public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	
	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
	}
}
