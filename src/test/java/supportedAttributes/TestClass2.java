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
	   
	   System.out.println("First change"); 
	   
	   System.out.println("Second change"); 
	  }
	
	public void thirdTest() 
	{ 
	   System.out.println("Third status changed "); 
	   
	   System.out.println("Third First change"); 
	   
	   System.out.println("Third Second change"); 
	  }


}
