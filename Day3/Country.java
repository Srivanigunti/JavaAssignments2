public class Country 
{
	private String name;
	private long population;
	private double area;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public long getPopulation() 
	{
		return population;
	}
	public void setPopulation(long population) 
	{
		this.population = population;
	}
	public double getArea() 
	{
		return area;
	}
	public void setArea(double area) 
	{
		this.area = area;
	}
	
	public Country(String name, long population, double area) 
	{
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}
	
	public Country() 
	{
		
	}
	
	@Override
	public String toString() 
	{
		return "Country [name=" + name + ", population=" + population
				+ ", area=" + area + "]";
	}
	
	public Country largestAreaCountry(Country[] countries)
	{
		for(int size=0; size<countries.length-1; size++)
		{
			Country country=null;
			//changes array in ascending order based on area of country
			if(countries[size].getArea()>countries[size+1].getArea()) 
			{
				country=countries[size];
				countries[size]=countries[size+1];
				countries[size+1]=country;
			}
		}
		return countries[countries.length-1];
	}
	public Country largestPopulationCountry(Country[] countries)
	{
		for(int size=0; size<countries.length-1; size++)
		{
			Country country=null;
			//changes array in ascending order based on population of country
			if(countries[size].getPopulation()>countries[size+1].getPopulation())
			{
				country=countries[size];
				countries[size]=countries[size+1];
				countries[size+1]=country;
			}
		}
		return countries[countries.length-1];
	}
	public Country largestPopulationDensityCountry(Country[] countries)
	{
		for(int size=0; size<countries.length-1; size++)
		{
			Country country=null;
			//changes array in ascending order based on population density of country
			if((countries[size].getPopulation()/countries[size].getArea()) > 
					(countries[size+1].getPopulation()/countries[size+1].getArea()))
			{
				country=countries[size];
				countries[size]=countries[size+1];
				countries[size+1]=country;
			}
		}
		return countries[countries.length-1];
	}
}
