package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ThanosHooks {
@Before(order=1)
	public void beforeSnapping() {
	System.out.println("Thanos collecting the infinity stones1");
		
	}
@After(order=0)
	public void aftereSnapping() {
	System.out.println("After killing everyone he is taking rest in Garden");

	}
@Before(order=1)
public void beforetoBeforeSnapping() {
System.out.println("Thanos has to be born");
	
}
@After(order=0)
public void afteretoafterbSnapping() {
System.out.println("Finally Thanos is also dying");

}
	       
	 
}
