package pac;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test	
   public void testAdd() {
      String str = "Junit is working fiene";
      assertEquals("Junit is working fine",str);
   }
   @Test	
   public void testAdd1() {
      String str = "Junit is working fi4ne";
      assertEquals("Junit is working fine",str);
   }

	
}