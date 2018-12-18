public class Triangle {

	private int hypotenuse;
	private int adjusent;
	private int opposite;
	private boolean result=false; 	
	private String triangleType;	
	
	public int getHypotenuse() 
	{
		return hypotenuse;
	}
	public void setHypotenuse(int hypotenuse) 
	{
		this.hypotenuse = hypotenuse;
	}
	public int getAdjusent() 
	{
		return adjusent;
	}
	public void setAdjusent(int adjusent) 
	{
		this.adjusent = adjusent;
	}
	public int getOpposite()
	{
		return opposite;
	}
	public void setOpposite(int opposite) 
	{
		this.opposite = opposite;
	}
	
	public Triangle(int hypotenuse, int adjusent, int opposite) 
	{
		super();
		this.hypotenuse = hypotenuse;
		this.adjusent = adjusent;
		this.opposite = opposite;
	}
	
	@Override
	public String toString() 
	{
		return "Triangle [hypotenuse=" + hypotenuse + ", adjusent=" + adjusent
				+ ", opposite=" + opposite + "]";
	}
	
	public boolean isRight()
	{
		if(hypotenuse>adjusent && hypotenuse>opposite)
		{
			if(hypotenuse*hypotenuse==adjusent*adjusent+opposite*opposite)
				result=true;
		}
		else if(adjusent>hypotenuse && adjusent>opposite)
		{
			if(adjusent*adjusent==hypotenuse*hypotenuse+opposite*opposite)
				result =true;
		}
		else if(opposite>adjusent && opposite>hypotenuse)
		{
			if(opposite*opposite==adjusent*adjusent+hypotenuse*hypotenuse)
				result=true;
		}
		return result;
	}
	
	public boolean isScalene()
	{	
		if(hypotenuse!=adjusent && hypotenuse!=opposite && adjusent!=opposite)
		{
			result=true;
		}
		return result;
	}
	
	public boolean isIsosceles() 
	{
		if(hypotenuse==adjusent && hypotenuse!=opposite)
		{
			result=true;
		}
		else if(opposite==adjusent && hypotenuse!=opposite)
		{
			result=true;
		}
		else if(hypotenuse==opposite && adjusent!=opposite)
		{
			result=true;
		}
		return result;
	}
	
	public boolean isEquilateral()
	{
		if(hypotenuse==adjusent && hypotenuse==opposite)
		{
				result=true;
		}
		return result;
	}
	
	public String checkTriangleType()
	{
		if(isRight())
		{
			triangleType="Right";
		}
		else if(isScalene())
		{
			triangleType="Scalene";
		}
		else if(isIsosceles())
		{
			triangleType="Isosceles";
		}
		else if(isEquilateral())
		{
			triangleType="Equilateral";
		}
		return triangleType;
	}
	
}