package executor;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import keywords.HelloWorld;

public class TestNGSimpleTest {
  @Test
  public void testAdd() {
      String str = "TestNG is working fine";
      System.out.println("Hello World");
      assertEquals("TestNG is working fine", str);
   }
  
  @Test
  public void helloNoName() {
      assertEquals("Hello, World!", HelloWorld.hello(""));
      assertEquals("Hello, World!", HelloWorld.hello(null));
  }

  @Test
  public void emptyStringIsComparedByValue() {
      assertEquals("Hello, World!", HelloWorld.hello(new String("")));
  }
  
  @Test
  public void helloSampleName() {
      assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
  }

  @Test
  public void helloAnotherSampleName() {
      assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
  }
}
