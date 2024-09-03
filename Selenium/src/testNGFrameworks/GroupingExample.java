package testNGFrameworks;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups= {"apple"})
	public void apple()
	{
	 System.out.println("apple");
	
	}
    @Test(groups= {"apple"})
	public void apple1()
	{
	 System.out.println("apple");
	
	}
    @Test(groups= {"vivo"})
	public void vivo()
	{
	 System.out.println("vivo");
	
	}
    @Test(groups= {"vivo"})
	public void vivo1()
	{
	 System.out.println("vivo");
	
	}
    @Test(groups= {"moto"})
	public void moto()
	{
	 System.out.println("moto");
	
	}
    @Test(groups= {"moto"})
	public void moto1()
	{
	 System.out.println("moto");
	
	}
	
}
