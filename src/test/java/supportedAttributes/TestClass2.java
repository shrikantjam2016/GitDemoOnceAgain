package supportedAttributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	@Parameters({"Name","School"})
	@Test 
	public void firstTest(String a, String b) 
	{ 
	  System.out.println("First Test Method class2"+a+" "+b); 
	} 
	@Test 
	public void secondTest() 
	{ 
	   System.out.println("Second Test Method class2"); 
	  }

}
