package de.uni_muenster.sopra2015.gruppe8.octobus.view.forms;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.form.ControllerFormDepartureTime;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.model.Route;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.text_elements.FieldNumber;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Form used to set departure times in FormRoute.
 */
public class FormDepartureTime extends FormGeneral
{
	private ControllerFormDepartureTime controllerFormDepartureTime;
	private JPanel jpButton, jpMain, jpStartTime, jpEndTime, jpFrequency, jpCheckBox, jpButtonMain;
	private JButton jbSave, jbCancel;
	private JLabel jlStartTime, jlEndTime, jlFrequency, jlInfo1, jlInfo2;
	private FieldNumber fnStartTime_Hour, fnStartTime_Minute, fnEndTime_Hour, fnEndTime_Minute, fnFrequency;
	private JCheckBox jcbMo, jcbDi, jcbMi, jcbDo, jcbFr, jcbSa, jcbSo;
	private Route route;

	public FormDepartureTime(JDialog parent, Route route)
	{
		super(parent, "Abfahrtszeiten Hinzufügen");

		this.route = route;
		controllerFormDepartureTime = new ControllerFormDepartureTime(this, route);

		setLayout(new BorderLayout());
		setResizable(false);

		jpMain = new JPanel();
		jpMain.setLayout(new BoxLayout(jpMain, BoxLayout.Y_AXIS));
		jpMain.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));
		panel.setBorder(new EmptyBorder(new Insets(0, 0, 10, 0)));
		jlInfo1 = new JLabel("Entweder nur die Startzeit angeben,");
		jlInfo1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(jlInfo1);
		jlInfo2 = new JLabel("oder alles ausfüllen.");
		jlInfo2.setHorizontalAlignment(JLabel.CENTER);
		panel.add(jlInfo2);
		jpMain.add(panel);

		jpStartTime = new JPanel();
		jpStartTime.setLayout(new BoxLayout(jpStartTime, BoxLayout.X_AXIS));
		jlStartTime = new JLabel("Startzeit: ");
		fnStartTime_Hour = new FieldNumber(3, 2, 23);
		fnStartTime_Hour.setHorizontalAlignment(JTextField.CENTER);
		fnStartTime_Minute = new FieldNumber(3, 2, 59);
		fnStartTime_Minute.setHorizontalAlignment(JTextField.CENTER);
		jpStartTime.add(jlStartTime);
		jpStartTime.add(Box.createHorizontalStrut(10));
		jpStartTime.add(fnStartTime_Hour);
		jpStartTime.add(Box.createHorizontalStrut(3));
		jpStartTime.add(new JLabel(":"));
		jpStartTime.add(Box.createHorizontalStrut(2));
		jpStartTime.add(fnStartTime_Minute);
		jpStartTime.add(Box.createHorizontalStrut(50));

		jpEndTime = new JPanel();
		jpEndTime.setBorder(new EmptyBorder(new Insets(5, 0, 5, 0)));
		jpEndTime.setLayout(new BoxLayout(jpEndTime, BoxLayout.X_AXIS));
		jlEndTime = new JLabel("Endzeit: ");
		fnEndTime_Hour = new FieldNumber(3, 2, 23);
		fnEndTime_Hour.setHorizontalAlignment(JTextField.CENTER);
		fnEndTime_Minute = new FieldNumber(3, 2, 59);
		fnEndTime_Minute.setHorizontalAlignment(JTextField.CENTER);
		jpEndTime.add(jlEndTime);
		jpEndTime.add(Box.createHorizontalStrut(16));
		jpEndTime.add(fnEndTime_Hour);
		jpEndTime.add(Box.createHorizontalStrut(3));
		jpEndTime.add(new JLabel(":"));
		jpEndTime.add(Box.createHorizontalStrut(2));
		jpEndTime.add(fnEndTime_Minute);
		jpEndTime.add(Box.createHorizontalStrut(50));

		jpFrequency = new JPanel();
		jpFrequency.setLayout(new BoxLayout(jpFrequency, BoxLayout.X_AXIS));
		jlFrequency = new JLabel("Frequenz: ");
		fnFrequency = new FieldNumber(3, 2, 60);
		fnFrequency.setHorizontalAlignment(JTextField.CENTER);
		jpFrequency.add(jlFrequency);
		jpFrequency.add(Box.createHorizontalStrut(6));
		jpFrequency.add(fnFrequency);
		jpFrequency.add(Box.createHorizontalStrut(89));
		
		jpCheckBox = new JPanel();
		jpCheckBox.setBorder(new EmptyBorder(new Insets(5, 0, 0, 0)));
		jpCheckBox.setLayout(new BoxLayout(jpCheckBox, BoxLayout.X_AXIS));
		jcbMo = new JCheckBox("Mo");
		jcbDi = new JCheckBox("Di");
		jcbMi = new JCheckBox("Mi");
		jcbDo = new JCheckBox("Do");
		jcbFr = new JCheckBox("Fr");
		jcbSa = new JCheckBox("Sa");
		jcbSo = new JCheckBox("So");
		jpCheckBox.add(jcbMo);
		jpCheckBox.add(jcbDi);
		jpCheckBox.add(jcbMi);
		jpCheckBox.add(jcbDo);
		jpCheckBox.add(jcbFr);
		jpCheckBox.add(jcbSa);
		jpCheckBox.add(jcbSo);
		

		jpMain.add(jpStartTime);
		jpMain.add(jpEndTime);
		jpMain.add(jpFrequency);
		jpMain.add(jpCheckBox);

		add(jpMain, BorderLayout.CENTER);

		jpButtonMain = new JPanel();
		jpButtonMain.setLayout(new BorderLayout());

		jpButton = new JPanel();
		jpButton.setLayout(new FlowLayout());

		jbSave = new JButton("Speichern");
		jbSave.addActionListener(e ->
				controllerFormDepartureTime.buttonPressed(EmitterButton.FORM_ROUTE_STEP2_DEPARTURE_SAVE));
		jbCancel = new JButton("Abbrechen");
		jbCancel.addActionListener(e ->
				controllerFormDepartureTime.buttonPressed(EmitterButton.FORM_ROUTE_STEP2_DEPARTURE_CANCEL));

		jpButton.add(jbSave);
		jpButton.add(jbCancel);

		jpButtonMain.add(new JSeparator(), BorderLayout.NORTH);
		jpButtonMain.add(jpButton, BorderLayout.CENTER);

		add(jpButtonMain, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public int getFnStartTime_Hour()
	{
		return fnStartTime_Hour.getNumber();
	}

	public int getFnStartTime_Minute()
	{
		return fnStartTime_Minute.getNumber();
	}

	public int getFnEndTime_Hour()
	{
		return fnEndTime_Hour.getNumber();
	}

	public int getFnEndTime_Minute()
	{
		return fnEndTime_Minute.getNumber();
	}

	public int getFnFrequency()
	{
		return fnFrequency.getNumber();
	}

	public boolean getJcbMo()
	{
		return jcbMo.isSelected();
	}

	public boolean getJcbDi()
	{
		return jcbDi.isSelected();
	}

	public boolean getJcbMi()
	{
		return jcbMi.isSelected();
	}

	public boolean getJcbDo()
	{
		return jcbDo.isSelected();
	}

	public boolean getJcbFr()
	{
		return jcbFr.isSelected();
	}

	public boolean getJcbSa()
	{
		return jcbSa.isSelected();
	}

	public boolean getJcbSo()
	{
		return jcbSo.isSelected();
	}
}
