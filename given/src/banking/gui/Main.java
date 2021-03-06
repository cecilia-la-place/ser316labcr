/*
  File:	Main.java
  Author:	Paul Horton and Cecilia LaPlace
  Date:	2/20/17

  Description: This file holds the main function used to run the program.
*/
package banking.gui;

import javax.swing.JFrame;

/**
  Class:	Main

  Description: Runs program.
*/
public final class Main {
	/**
	  Method: Main
	  Inputs: String[] args
	  Returns:

	  Description: runs the program
	*/
	public static void main(final String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("Usage: java FormMain <property file>");
			System.exit(1);
		}

		String propertyFile = args[0];
		JFrame frame = new MainFrame(propertyFile);
		frame.setVisible(true);
	}
	/**
	  Method: Main
	  Inputs:
	  Returns:

	  Description: constructor for style issues
	*/
	private Main() {
	}

}
