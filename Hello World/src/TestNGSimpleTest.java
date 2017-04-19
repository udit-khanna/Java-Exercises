import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGSimpleTest {
  @Test
  public void testAdd() {
      String str = "TestNG is working fine";
      System.out.println("Hello World");
      assertEquals("TestNG is working fine", str);
   }
}
