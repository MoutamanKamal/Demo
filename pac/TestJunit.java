package pac;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test	
   public void testAdd() {
      String str = "Junit is wordsking fine";
      assertEquals("Junit is working fine",str);
   }
   @Test	
   public void testAdd1() {
      String str = "Junit is workisdsng fine";
      assertEquals("Junit is working fine",str);
   }

	
}