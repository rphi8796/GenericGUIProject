package controller;

import model.Generic;
import view.Frame;

public class Controller
{
	private Generic myShirt;
	private Frame appFrame;
	
	public Controller()
	{
		myShirt = new Generic();
		
		appFrame = new Frame(this);
	}
	
	public void start()
	{
		
	}
}
