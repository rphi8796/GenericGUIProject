package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Card extends CardLayout
{
	private JPanel first;
	private JPanel second;
	private JButton startButton;
	private SpringLayout appLayout;
	private JButton backButton;
	private JPanel StartScreen;
	
	public Card()
	{
		first = new JPanel();
		StartScreen = new JPanel(new CardLayout());

		second = new JPanel();
		appLayout = new SpringLayout();
		backButton = new JButton("Back");
		startButton = new JButton("Start");
		
		setupLayouts();
		setupListeners();
		createShow();
		
	}
	private void setupPanel(Container pane)
	{
		StartScreen.add(startButton);
		first.add(backButton);
		pane.add(startButton, BorderLayout.PAGE_START);
		pane.add(StartScreen, BorderLayout.CENTER);
	}
	
	private void setupLayouts()
	{
		appLayout.putConstraint(SpringLayout.WEST, backButton, 179, SpringLayout.WEST, first);
		appLayout.putConstraint(SpringLayout.SOUTH, backButton, -120, SpringLayout.SOUTH, first);
	}
	
	private void setupListeners()
	{
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{ 
				CardLayout thisLayout = (CardLayout) (StartScreen.getLayout());
				thisLayout.show(first, (String) mouseClick.getActionCommand());
			}
		});
	}
	
	public static void createShow()
	{
		JFrame frame = new JFrame("hopefully");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Card demo = new Card();
		demo.setupPanel(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
}









