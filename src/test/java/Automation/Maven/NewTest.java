package Automation.Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test(groups="flavor",priority=1)
  public void f() {
	  System.out.println("red");
  }
  @Test(groups="flavor",priority=0)
  public void g() {
	  System.out.println("white");
  }
  @Test(groups="mobiles")
  public void h() {
	  System.out.println("black");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
