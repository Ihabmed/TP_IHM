package com.IHM.TPInterface.Fenetres;

import javax.swing.*;
//import java.awt.BorderLayout;

public class maFenetre2 extends javax.swing.JFrame {
	public maFenetre2 ( ){
		 
		 // TODO Initiate a window
		 setTitle("ma premiere fenetre avec swing");
		 setSize(300,400);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo( null );		
		 
		 // TODO Initiate a new items
		 // BorderLayout layout = new BorderLayout();
		 JPanel container = new JPanel();
		 BoxLayout layout = new BoxLayout(container,BoxLayout.PAGE_AXIS /*BoxLayout.LINE_AXIS*/);
		 JButton myButton = new JButton("my first button!");
		 JButton myButton2 = new JButton("my second button!");
		 JTextField myText = new JTextField("Hello there SWING!");
		 JComboBox myCombo = new JComboBox();
		 JLabel myLabel = new JLabel("My Label With SWING!");
		 
		 // TODO add combo box items
		 myCombo.addItem("IHM");
		 myCombo.addItem("SE");
		 myCombo.addItem("RCD");
		 myCombo.addItem("BDD-A");
		 
		 // TODO set container layout
		 container.setLayout(layout);
		 
		 // TODO add items to the container
		 container.add(myButton /*layout.WEST*/);
		 container.add(myButton2 /*layout.EAST*/);
		 container.add(myText /*layout.NORTH*/);
		 container.add(myCombo /*layout.SOUTH*/);
		 container.add(myLabel /*layout.CENTER*/);
		 
		 // TODO set the content to container
		 setContentPane(container);
		 
		 // TODO add pack to adjust items
		 pack();
	}
}
