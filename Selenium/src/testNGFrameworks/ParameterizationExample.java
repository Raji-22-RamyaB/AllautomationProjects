package testNGFrameworks;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	@Test
	@Parameters("Name")
	
	public void printname(String name)
	{
     System.out.println("name is" +name);
     
	}

}
