import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TemperatureCalculatorTest {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("TemperatureCalculatorTest");
	getTempByDayTest();
  }

  @Test
  public void getTempByDayTest() {

    TemperatureCalculator temperatureCalculator = new TemperatureCalculator();
    int inputValue = 2;
    int expectedValue = 22;
    String errorMessageString = String.format("Temperature(%d) incorrect", expectedValue);
    assertEquals(errorMessageString, expectedValue, temperatureCalculator.getTempByDay(inputValue));
	}
	void getTemperatureAverageExceptionTest(int firstDay, int lastDay){
		try{
			TemperatureCalculator tempCalc = new TemperatureCalculator();
			int output = tempCalc.tempAvg(firstDay, lastDay);
		}
		catch(AverageException ex){
			assertEquals("First day and last day must be in range 1-30", ex.getMessage());
			System.out.println(-1);
		}
		catch(IllegalRangeException  e){
			assertEquals("Last day must larger than first day", e.getMessage());
			System.out.println(-2);
		}
	}
	@Test(timeout = 1000)
	public void tempAverageTest0(){
		getTemperatureAverageExceptionTest(5,45);
	}
	@Test(timeout = 1000)
	public void tempAverageTest0(){
		getTemperatureAverageExceptionTest(23,7);
	}
 
}
