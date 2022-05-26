import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{
	
	public JComboBox combo1;
	private JLabel label;
	private JButton boton1, boton2;
	
	public Menu() {
		setLayout(null);
		setTitle("Menu");
		
		label = new JLabel("Seleccione una opción de conversión");
		label.setBounds(15,10,300,20);
		add(label);
		
	
		combo1 = new JComboBox();
		combo1.setBounds(15,40,300,20);
		add(combo1);
		combo1.addItem("Conversor de Moneda");
		combo1.addItem("Conversor de Temperatura");	
		
		boton1 = new JButton("OK");
		boton1.setBounds(60,80,90,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("Cancel");
		boton2.setBounds(170,80,90,30);
		add(boton2);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			
			String item = (String)combo1.getSelectedItem();
			
			if (item == "Conversor de Moneda") {
				Input entrada = new Input();
				entrada.setBounds(0,0,440,150);
				entrada.setVisible(true);
				entrada.setResizable(false);
				entrada.setLocationRelativeTo(null);
				
				this.setVisible(false);
			}
			else {
				System.out.println("Conversor de temperatura por diseñar");
			} 
	
		}
		
		if (e.getSource() == boton2) {
			String item = (String)combo1.getSelectedItem();
			System.out.println(item);
			System.out.println("Cancel");
		}	
		
	}
	
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.setBounds(0,0,350,170);
		menu.setVisible(true);
		menu.setResizable(false);
		menu.setLocationRelativeTo(null);
		
	}
	
	
}
