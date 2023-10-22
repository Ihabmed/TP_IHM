package com.IHM.TPInterface;
import javax.swing.JFrame;

public class MaPremiereFenetre {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO instancier la fenetre
		JFrame maFenetreI = new JFrame();

		// TODO rendre visible la fenetre
		maFenetreI.setVisible(true);
		
		maFenetreI.setTitle("Ma Premiere Fenetre SWING");
		maFenetreI.setSize(400,300);
		maFenetreI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetreI.setResizable(false);
		
		// TODO centrer la fenetre
		maFenetreI.setLocation(145,500);
		maFenetreI.setLocationRelativeTo( null );
	}
}
