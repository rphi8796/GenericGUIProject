package view;

import javax.swing.JPanel;
import controller.Controller;

public class Panel extends JPanel
{
	private Controller appController;
	
	public Panel(Controller appController)
	{
		super();
		
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
