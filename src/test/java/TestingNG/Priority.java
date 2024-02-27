package TestingNG;

import org.testng.annotations.Test;

public class Priority {
	
	 @Test (priority=1)
	  public void testcase1() {
		  System.out.println("Testcase 1 executed successfully");
	  }
	  @Test (priority=2)
	  public void testcase2() {
		  System.out.println("Testcase 2 executed successfully");
	  }
	  @Test (priority=0)
	  public void testcase3() {
		  System.out.println("Testcase 3 executed successfully");
	  }

}