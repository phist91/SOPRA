package de.uni_muenster.sopra2015.gruppe8.octobus.view.text_elements;

import javax.swing.*;
import javax.swing.text.Document;

/**
 * Customised JFormattedTextField which can be limited to up to 200 characters of input.
 */
public class FieldText extends JFormattedTextField
{
	private LimitDocument limitDocument;

	/**
	 * Calls default constructor of JFormattedTextField.
	 */
	public FieldText()
	{
		super();
	}


	/**
	 * Calls default constructor of JFormattedTextField and sets desired limit.
     *
	 * @param limit limits maximum number of characters in FieldText. If reached, all user inputs, will be blocked
	 */
	public FieldText(int limit)
	{
		super();
		setLimit(limit);
	}


	/**
	 * Calls default constructor of JFormattedTextField, sets desired column width of the field and sets desired limit
     * on total length of the input.
     *
	 * @param columns numbers of columns to use to calculate preferred width
	 * @param limit maximum number of characters
	 */
	public FieldText(int columns, int limit)
	{
		super();
		this.setColumns(columns);

		if(limit != -1)
			setLimit(limit);
	}

	protected void setLimit(int limit)
	{
		limitDocument.setLimit(limit);
	}
	

	@Override
	protected Document createDefaultModel()
	{
		this.limitDocument = new LimitDocument();
		return limitDocument;
	}

}
