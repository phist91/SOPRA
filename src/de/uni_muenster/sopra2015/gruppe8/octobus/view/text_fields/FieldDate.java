package de.uni_muenster.sopra2015.gruppe8.octobus.view.text_fields;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FieldDate extends FieldText
{
	public FieldDate()
	{
		super(11);
		isValidDate();

		this.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)
			{
				char c = e.getKeyChar();
				if (((c < '0') || (c > '9')) && (c != '.')) //only allow numbers and dots
				{
					e.consume();  // ignore event
				}
			}
		});

		getDate();

	}

	private boolean isValidDate()
	{
		int year, month, day;
		String input = this.getText();

		Pattern p = Pattern.compile("([0-9]{1,2}).([0-9]{1,2}).([0-9]{4})");
		Matcher m = p.matcher(input);
		if (m.matches())
			return true;
		else
			return false;
	}


	public Date getDate()
	{
		this.setText("3.4.1994");
		if(isValidDate())
		{
			String input = this.getText();
			int indexDot = input.indexOf('.');
			int day = Integer.parseInt(input.substring(0, indexDot));
			input =  input.substring(indexDot + 1);
			indexDot = input.indexOf('.');

			int month = Integer.parseInt(input.substring(0, indexDot));
			input = input.substring(indexDot + 1);
			indexDot = input.indexOf('.');

			int year = Integer.parseInt(input.substring(0));

			if(year < 0 || month < 1 || month > 12 || day > 31 || day < 1)
				return null;

			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			switch (month)
			{
				/*case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(day > 31) return null;
					break;*/
				case 4:
				case 6:
				case 9:
				case 11:
					if(day > 30) return null;
					break;
				case 2:
					if(isLeapYear && day > 29) return null;
					else if(!isLeapYear && day > 28) return null;
			}

			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, year);
			c.set(Calendar.MONTH, month);
			c.set(Calendar.DAY_OF_MONTH, day);

			return c.getTime();
		}
		else
			return null;
	}

	public void setDate(Date date)
	{
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		this.setText(df.format(date));
	}
}
