package Automation.Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class SignTest {
  @Test
  public void f() {
	  System.out.println("Hello");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Hi");
  }

}
