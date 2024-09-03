package testNGFrameworks;

import org.testng.annotations.Test;

public class TestngSample { 
	
	@Test
	public void firstsample()
	{ 
     System.out.println("first sample");

    }
	@Test(priority=1)
	public void secondsample()
	{ 
     System.out.println("sec sample");

    }
	@Test(priority=2)
	public void thirdsample()
	{ 
     System.out.println("third sample");

    }
	@Test(priority=3,invocationCount = 10)
	public void fourthsample()
	{ 
     System.out.println("fourth sample");

    }
	
	
}
