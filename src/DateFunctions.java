
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFunctions {

	public static void main(String[] args) throws ParseException {
		String date="15/03/2015";
		
		SimpleDateFormat df =  new SimpleDateFormat("dd/MM/yyyy");
		Date d = df.parse(date);
		
		
		String  month =  new SimpleDateFormat("MMMM").format(d);
		String year = new SimpleDateFormat("yyyy").format(d);
		String day = new SimpleDateFormat("d").format(d);
		
		System.out.println(day);
		System.out.println(month);
		System.out.println( year);
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		day = new SimpleDateFormat("dd").format(d);
		month =  new SimpleDateFormat("MMMM").format(d);
		year = new SimpleDateFormat("yyyy").format(d);
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		
		
		
		
		

	}

}
