package controller;

import model.Generic;
import view.Card;

public class Controller
{
	private Generic myShirt;
	
	public Controller()
	{
		myShirt = new Generic();
	}
	
	public void start()
	{
		Card.createShow();
	}
	
}
