public class Date {
	int monthArray[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	private int day;
	private int month;    // data members to store the day, month and year of a date.
	private int year;
	public Date(int day, int month, int year) //constructor to initialize Date objects 
	{	
		this.day=day;
		this.month=month;	//initialize date, month, year of the current object using the date, month, year parameters. 
		this.year=year;
		if(year%4==0 && year%100!=0 || year%400==0)
			monthArray[2]=29;
	}
	public int getDay() 
	{
		return day;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month) 
	{
		this.month = month;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	@Override
	public String toString() // method to get the value of a Date object printed 
	{
		return "20/04/2017";  //return the value of a Date object as a String in d/m/y format.
	}
		
	//method to check whether a date is smaller than the other
	public static boolean isSmaller(Date dateOne)
	{   
		Date dateTwo = new Date(11,05,2024);
		if(dateOne.noOfdays()<dateTwo.noOfdays())	//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
			return true;
		return false;
	}

	 int noOfdays() 
	 {
		int days=day;
		int years=year-1;
		days=days+years*365;
		days=days+(years/4-years/100+years/400);
		for(int counter=1;counter<month;counter++)
		{
			days=days+monthArray[counter];
		}
		return days;	
	}
	 
	 public static int[] diff(Date dateOne) //method to find out the difference of days, months and years in two dates.
		{
		 int dateArray[]=new int[3];
		 Date dateTwo = new Date(21,05,2017);
		 int daysOne=dateOne.noOfdays();
		 int daysTwo=dateTwo.noOfdays();
		 int result;
		 if(daysOne>daysTwo)
			 result=daysOne-daysTwo;
		 else
			 result=daysTwo-daysOne;
		 dateArray[0]=result;
		 dateArray[1]=result/30;
		 int yearResult;
		 if(dateOne.year>dateTwo.year)
			 yearResult=dateOne.year-dateTwo.year;
		 else
			 yearResult=dateTwo.year-dateOne.year;
		 dateArray[2]=yearResult;
		 return dateArray;
		}
}