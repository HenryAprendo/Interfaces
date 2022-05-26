import javax.swing.*;
import java.awt.event.*;

public class Input extends JFrame implements ActionListener {

	private JLabel label;
	private JTextField textfield;
	private JButton boton1, boton2;
	
	public Input() {
		setLayout(null);
		setTitle("Input");
		
		label = new JLabel("Ingresa la cantidad de dinero que deseas convertir:");
		label.setBounds(10,10,400,20);
		add(label);
		
		textfield = new JTextField();
		textfield.setBounds(10,30,400,20);
		add(textfield);
		
		boton1 = new JButton("OK");
		boton1.setBounds(110,60,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("Cancel");
		boton2.setBounds(220,60,100,30);
		add(boton2);
		boton2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			System.out.println("OK");
		}
		
		if (e.getSource() == boton2) {
			System.out.println("Cancel");
		}
	}
	
	
	public static void main(String[] args) {
		Input entrada = new Input();
		entrada.setBounds(0,0,440,150);
		entrada.setVisible(true);
		entrada.setResizable(false);
		entrada.setLocationRelativeTo(null);
	} 
	
}





























