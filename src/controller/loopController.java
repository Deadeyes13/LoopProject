package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class loopController
{
	public void start()
	{
		whileLoopTest(10);
		forLoopTest();
		enhancedForLoopTest();
		doWhileLoopTest();
	}
	
	private void whileLoopTest(int loopCount)
	{
//		While loop
//		Declare looping variable
		
//		Loop header = while ( condition )
		while(loopCount < 10)
		{
//			Body of the loop
			JOptionPane.showMessageDialog(null, "This is the " + loopCount + "'th time through the while loop");
			
//			Last line in the loop needs to be what eventually causes it to fail the condition
			loopCount++;
		}
	}
	
	private void forLoopTest()
	{
//		Combination of initialization, condition, and increment in one line
		for(int loopCounter = 0; loopCounter < 10; loopCounter++)
		{
//			Body of the loop
			JOptionPane.showMessageDialog(null, "This is the " + loopCounter + "'th time through the loop");
		}
	}
	
	private void enhancedForLoopTest()
//	Called ( For Each Loop )
	{
		ArrayList<String> myWords = new ArrayList<String>();
		myWords.add("first");
		myWords.add("second");
		myWords.add("third");
		
//		Type of thing in the structure, variable, then the structure
		for(String currentWord : myWords)
		{
			JOptionPane.showMessageDialog(null, "The current word is: " + currentWord);
		}
	}
	
	private void doWhileLoopTest()
	{
		int count = 0;
		do
		{
//			Body of the loop
			JOptionPane.showMessageDialog(null, "This is the " + count + "'th time through the do-while loop");
			
//			Last line in the loop needs to be what eventually causes it to fail the condition
			count++;
		} while(count <10);
	}
}
