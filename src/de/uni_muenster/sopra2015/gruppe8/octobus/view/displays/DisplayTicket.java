package de.uni_muenster.sopra2015.gruppe8.octobus.view.displays;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.display.ControllerDisplayTicket;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;

import javax.swing.*;
import java.awt.*;

/**
 * @author Patricia Schinke
 *
 */
public class DisplayTicket extends JPanel
{
	//panel which shall show all tickets should be with scollpane
	private JPanel plTable;
	private JPanel plTickets;
	private JButton btnBack;
	private ControllerDisplayTicket controller;
	private  GridBagConstraints cst;

	public DisplayTicket()
	{
		controller = new ControllerDisplayTicket(this);

		setLayout(new BorderLayout(5,5));
		plTable = new JPanel();
		plTickets = new JPanel();
		JScrollPane scrollPane = new JScrollPane(plTable);
		add(scrollPane, BorderLayout.CENTER);

		//all Tickets shown vertical
		plTable.setLayout(new BoxLayout(plTable, BoxLayout.Y_AXIS));

		btnBack = new JButton("Zurück");
		btnBack.addActionListener(e->{
			controller.buttonPressed(EmitterButton.DISPLAY_TICKET_BACK);
		});

		JPanel plButton = new JPanel();
		plButton.setLayout(new BorderLayout());
		plButton.add(btnBack, BorderLayout.EAST);
		add(plButton, BorderLayout.PAGE_END);
		plTickets.setLayout(new GridBagLayout());
		plTickets.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		cst = new GridBagConstraints();
		controller.fill();
		plTable.add(plTickets);
	}


	//adds Panel to the plTable with data from the dataBase (is used in ControllerFormShowTckets
	public void addPanel(String name, int price, int numPassengers, String description, int i){
	//noch umranden und vllt mit Farben und anderen schriftgrößen schöner machen
		cst.gridy = i;
		if(i>102)
		{
			JPanel plDistance = new JPanel();
			plDistance.setBackground(Color.LIGHT_GRAY);
			plDistance.setPreferredSize(new Dimension(982, 3));
			plTickets.add(plDistance, cst);
		}
		cst.ipadx = 20;
		cst.ipady = 20;
		cst.gridx = 0;
		cst.gridy = i+1;
		cst.gridwidth = 2;
		JLabel lbName = new JLabel(name);
		lbName.setFont(new Font("Arial", Font.BOLD, 16));
		plTickets.add(lbName, cst);
		cst.gridx = 0;
		cst.gridy = i+2;
		cst.gridwidth = 1;
		cst.weightx = 1;
		cst.anchor = GridBagConstraints.LINE_END; //does not work
		JLabel lbPrice = new JLabel("Preis: "+price+"€");
		lbPrice.setFont(new Font("Tahoma",Font.PLAIN,14));
		plTickets.add(lbPrice, cst);
		cst.gridx = 1;
		cst.anchor = GridBagConstraints.LINE_START;
		String strNumPas;
		if(numPassengers == 1)
		{
			strNumPas = numPassengers+" Person";
		}
		else
		{
			strNumPas = numPassengers+" Personen";
		}
		JLabel lbNumPassengers = new JLabel(strNumPas);
		lbNumPassengers.setFont(new Font("Arial",Font.PLAIN,14)); //TODO nicht arial
		plTickets.add(lbNumPassengers, cst);
		cst.gridx = 0;
		cst.gridy = i+6;
		cst.gridwidth = 2;
		cst.anchor = GridBagConstraints.CENTER;
		String[] lines = description.split("\n");
		for(String line: lines)
		{
			JLabel lbDescription = new JLabel(line);
			plTickets.add(lbDescription, cst);
			i++;
			cst.gridy = i+2;
		}
	}
}
