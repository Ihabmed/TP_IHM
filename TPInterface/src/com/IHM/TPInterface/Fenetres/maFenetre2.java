package com.IHM.TPInterface.Fenetres;

<<<<<<< Updated upstream
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import java.awt.BorderLayout;

>>>>>>> Stashed changes
public class maFenetre2 extends javax.swing.JFrame {
	maFenetre2 ( ){
		 setTitle("ma premiere fenetre avec swing");
		 setSize(300,400);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
		 setLocationRelativeTo( null );		
<<<<<<< Updated upstream
=======
		 
		 // TODO Initiate a new items
		 BorderLayout layout = new BorderLayout();
		 JPanel container = new JPanel();
		 // BoxLayout layout = new BoxLayout(container,BoxLayout.PAGE_AXIS /*BoxLayout.LINE_AXIS*/);
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
		 container.add(myButton ,layout.WEST);
		 container.add(myButton2 ,layout.EAST);
		 container.add(myText ,layout.NORTH);
		 container.add(myCombo ,layout.SOUTH);
		 container.add(myLabel ,layout.CENTER);
		 
		 // TODO set the content to container
		 setContentPane(container);
		 
		 // TODO set the action listeneres
		 myButton.addActionListener( new ActionListener() {
			 public void actionPerformed( ActionEvent e ) {
				 System.out.println("Hey You Clicked Me! <Button One>");
			 }
		 });
		 
		 myButton2.addActionListener( new ActionListener() {
			 public void actionPerformed( ActionEvent e ) {
				 System.out.println("Hey You Clicked Me! <Button Two>");
			 }
		 });
		 
		 myText.addKeyListener( new KeyListener() {
			 public void keyTyped( java.awt.event.KeyEvent e ) {}

			@Override
			public void keyPressed(KeyEvent e) {
				JTextField textField = (JTextField)e.getSource();
				String text = textField.getText();
				textField.setText(text.toUpperCase());
			}

			@Override
			public void keyReleased(KeyEvent e) {}
		 });
 		 
		 myCombo.addItemListener( new ItemListener() {
			 public void itemStateChanged( ItemEvent e ) {
				 if ( e.getStateChange() == ItemEvent.SELECTED ) {
					 System.out.println("Hey You Selected: " + e.getItem()); 
				 }
			 }
		 });
		 
		 myLabel.addMouseListener( new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Hey You Clicked The Label!");
			}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
		 });
		 
		 // TODO add pack to adjust items
		 pack();
>>>>>>> Stashed changes
	}
}
