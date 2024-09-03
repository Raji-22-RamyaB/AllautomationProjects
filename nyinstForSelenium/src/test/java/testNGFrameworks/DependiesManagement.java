package testNGFrameworks;

import org.testng.annotations.Test;

public class DependiesManagement {
  
	@Test(enabled=true)
	public void HighSchool()
	{
		System.out.println("High school");
	
	}  
	
	@Test(enabled=false,dependsOnMethods="HighSchool")
	public void HigherSecondary()
	{
		System.out.println("Higher Secondary");
		
	}
	
	@Test(dependsOnMethods="HigherSecondary")
	public void Degree()
	{
		System.out.println("Engineering");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
	
}
