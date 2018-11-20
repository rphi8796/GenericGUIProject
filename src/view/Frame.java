package view;

import javax.swing.JFrame;

import controller.Controller;

public class Frame extends JFrame
{
	private Controller appController;
	private Panel appPanel;
	
	public Frame(Controller appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new Panel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("LOL");
		this.setResizable(true);
		this.setVisible(true);
	}
	
	
}
