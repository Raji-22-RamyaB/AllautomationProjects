package testNGFrameworks;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {


String name="Raji";
@Test
 public void checkEqual()
 {

//String actualname="raji";
//String expectedvalue="raji";

Assert.assertNotEquals(name,"raji");
	
 }
}
