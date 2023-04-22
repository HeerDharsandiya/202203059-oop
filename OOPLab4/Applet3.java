/*Q-3) Write a Java applet program that displays a calculator with basic arithmetic operations (addition,
subtraction, multiplication, division). The user should be able to input the numbers using buttons and
result should be displayed in the text field.*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet3 extends Applet implements ActionListener{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mult,div,eq,clr;
	TextField t;
	int a,b,c=0;
	String s1,s2,s3,s4;
	public void init(){
		t=new TextField();
		b0=new Button("0");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		add=new Button("+");
		sub=new Button("-");
		mult=new Button("*");
		div=new Button("/");
		eq=new Button("=");
		clr=new Button("C");

		 add(t);
       		 add(b7);
       		 add(b8);
        		 add(b9);
       		 add(add);

      		 add(b4);
       		 add(b5);
       		 add(b6);
        		 add(sub);

       		 add(b1);
        		 add(b2);
       		 add(b3);
       		 add(mult);

        		 add(clr);
		 add(b0);
       		 add(eq);
        		 add(div);
		
		  b1.addActionListener(this);
		  b2.addActionListener(this);
		  b3.addActionListener(this);
		  b4.addActionListener(this);
		  b5.addActionListener(this);
		  b6.addActionListener(this);
		  b7.addActionListener(this);
		  b8.addActionListener(this);
		  b9.addActionListener(this);
		  b0.addActionListener(this);
		  add.addActionListener(this);
		  sub.addActionListener(this);
		  mult.addActionListener(this);
		  div.addActionListener(this);
		  eq.addActionListener(this);
		  clr.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		if(s=="0" || s=="1" || s=="2" || s=="3" || s=="4" || s=="5" || s=="6" || s=="7" || s=="8" || s=="9"){
			s1=t.getText()+s;
			t.setText(s1);
		}
		if(s=="+"){
			s2=t.getText();
			t.setText("");
			s3="+";
		}
		if(s=="-"){
			s2=t.getText();
			t.setText("");
			s3="-";
		}
		if(s=="*"){
			s2=t.getText();
			t.setText("");
			s3="*";
		}
		if(s=="/"){
			s2=t.getText();
			t.setText("");
			s3="/";
		}
		 if(s=="="){
			s4=t.getText();
 			a=Integer.parseInt(s2);
   			b=Integer.parseInt(s4);
			if(s3=="+") c=a+b;
  		                if(s3=="-") c=a-b;
   			if(s3=="*") c=a*b;
			if(s3=="/") c=a/b;
			s=String.valueOf(c);
  			t.setText(s);
 		 }
		if(s=="C") t.setText("");
		
	}
	public void paint(Graphics g){
		g.drawString("Calculator",90,30);		

		t.setBounds(40,40,175,40);

		b7.setBounds(40,85,40,40);
		b8.setBounds(85,85,40,40);
		b9.setBounds(130,85,40,40);
		add.setBounds(175,85,40,40);

		b4.setBounds(40,130,40,40);
		b5.setBounds(85,130,40,40);
		b6.setBounds(130,130,40,40);
		sub.setBounds(175,130,40,40);

		b1.setBounds(40,175,40,40);
		b2.setBounds(85,175,40,40);
		b3.setBounds(130,175,40,40);
		mult.setBounds(175,175,40,40);

		clr.setBounds(40,220,40,40);
		b0.setBounds(85,220,40,40);
		eq.setBounds(130,220,40,40);
		div.setBounds(175,220,40,40);
	}
}

