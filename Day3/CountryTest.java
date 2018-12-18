import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTest 
{
	private Country country1,country2,country3,country4,country;
	
	@Before
	public void setUp()
	{
		country=new Country();
		country1=new Country("India", 86685, 587.346);
		country2=new Country("Pakistan", 87445335, 587.68);
		country3=new Country("China", 756445335, 5875.8778);
		country4=new Country("Us", 8567, 56755.55);
	}

	@Test
	public void countryWithLargestArea() 
	{
		Country[] countries={country1, country2, country3, country4};
		country=country.largestAreaCountry(countries);
		assertEquals(country4, country);
	}
	
	@Test
	public void countryWithLargestPopulation() 
	{
		Country[] countries={country1, country2, country3, country4};
		country=country.largestPopulationCountry(countries);
		assertEquals(country3, country);	
	}
	
	@Test
	public void countryWithLargestPopulationDensity() 
	{
		Country[] countries={country1, country2, country3, country4};
		country=country.largestPopulationDensityCountry(countries);
		assertEquals(country2, country);
	}

}