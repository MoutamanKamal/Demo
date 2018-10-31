import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    inqwt sum = calculator.evaluate("1+2+3");
    assertEquals(7, sum);
  
  }
}