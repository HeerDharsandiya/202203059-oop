/*Q-2) Write a Java applet program that allows user to select a color from drop-down list and then changes
the background color of applet window accordingly.*/

import java.applet.*;
import java.awt.*;

public class Applet2 extends Applet{
	Choice ch=new Choice();
	public void init(){
		ch.addItem("White");
		ch.addItem("Red");
		ch.addItem("Blue ");
		ch.addItem("Green ");
		ch.addItem("Yellow");
		ch.addItem("Orange");
		ch.addItem("Pink");
		ch.addItem("Cyan");
		add(ch);
	}
	public void paint(Graphics g){
		g.drawString("Choose a color: ",10,15);
		String s=ch.getSelectedItem();
		if(s=="White") setBackground(Color.white);
		else if(s=="Red") setBackground(Color.red);
		else if(s=="Blue ") setBackground(Color.blue);
		else if(s=="Green ") setBackground(Color.green);
		else if(s=="Yellow") setBackground(Color.yellow);
		else if(s=="Orange") setBackground(Color.orange);
		else if(s=="Pink") setBackground(Color.pink);
		else if(s=="Cyan") setBackground(Color.cyan);
		
	}
}