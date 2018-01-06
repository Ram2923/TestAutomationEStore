package generic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmailAddress 
{
	public static String getEmailAddres ()
	{
		String Email = "";
		SimpleDateFormat date = new SimpleDateFormat ("YYYYDDMMhhmmss");
		Email = date.format(new Date ());
		
		return Email+"@qa.com"; 
	}

}
