/*Q - 1) Write a Java applet program which takes the name of user as input and displays a personalized
greeting in the middle of applet window.
Example output: Hello {your_name}*/ 

import java.applet.*;  
import java.awt.*; 
 
public class  Applet1 extends Applet{  
	TextField t1;

	public void init(){
		t1= new TextField();
		add(t1);
	}
  
	public void paint(Graphics g){  
		
		g.drawString("Enter your name: ",10,10);
		String s1=t1.getText();
		String s2="Hello " + s1+"!";
		Dimension d=getSize();
		g.drawString(s2,d.width/2,d.height/2);
		
	}  
} 
