import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Date 
{
	private int date,month,year;  // data members to store the day, month and year of a date.
	public Date(int date, int month, int year) //constructor to initialize Date objects
	{
		this.date = date;
		this.month = month; //initialize d, m, y of the current object using the d, m, y parameters. 
		this.year = year;
	}
	public String toString()  // method to get the value of a Date object printed
	{
		//return the value of a Date object as a String in d/m/y format.
		return date+"/"+month+"/"+year;
	}
	public boolean isSmaller(Date date)
	{
		// method to check whether a date is smaller than the other 
		Date givenDate = new Date(22,12,2019);
		if(date.date<givenDate.date)
		{
			//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
			return true;
		}
		return false;
		//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
	}
	public int[] diff(Date date)
	{
		//method to find out the difference of days, months and years in two dates.
		Date givenDate = new Date(22,12,2019);
		//The difference of days, months and years in the invoking and parameter Date objects 
		int newDate = givenDate.date - date.date;
		int newMonth = givenDate.month - date.month;
		int newyear = givenDate.year - date.year;
		//is obtained and returned in an int array. The first element of the array should represent
		int differences[]  = {newDate,newMonth,newyear};
		return differences;	
		//The difference of days, months and years in the invoking and parameter Date objects 
		//is obtained and returned in an int array. The first element of the array should represent
		//difference of days; second one, the difference of months and the third one, the difference of years.
	}
}
