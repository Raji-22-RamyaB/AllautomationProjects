 package testNGFrameworks;

import org.testng.annotations.Test;

public class SkipAtestcase {  
	
	 
			
			@Test(priority=0)
			public void startThecar()
			{
				System.out.println("Start the car");
				
			}
			
			@Test(priority=5,enabled=false)
			public void turnonmusic()
			{
				System.out.println("Turned music on");
				
			}

			@Test(priority=1)
			public void putfisrtGear()
			{
				System.out.println("putfirstGear");
				
			}
			@Test(priority=2)
			public void putSecondGeer()
			{
				System.out.println("putSecondGeer");
				
			}
			@Test(priority=3)
			public void putThirdGear()
			{
				System.out.println("putThirdGear");
				
			}
			
		 


}
