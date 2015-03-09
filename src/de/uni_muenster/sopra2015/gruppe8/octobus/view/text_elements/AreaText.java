package de.uni_muenster.sopra2015.gruppe8.octobus.view.text_elements;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;


/**
 * Customised JTextArea which is limited to 2000 characters and uses the same font settings as a default JTextField
 */
public class AreaText extends JTextArea
{
	private LimitDocument limitDoc;

	public AreaText()
	{
		super();
		setFont(UIManager.getDefaults().getFont("JTextField.font"));
		this.setLineWrap(true);
		this.setWrapStyleWord(true);

		limitDoc.setLimit(2000);
	}

	@Override
	protected Document createDefaultModel()
	{
		this.limitDoc = new LimitDocument();
		return limitDoc;
	}
}
