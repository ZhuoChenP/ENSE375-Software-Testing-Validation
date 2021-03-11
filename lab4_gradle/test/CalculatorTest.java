
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void Check_Earth_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Earth();
		assertEquals(10.0, result); //expected, actual
    }
    @Test
    public void Check_Mercury_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Mercury();
		assertEquals(4.0, result); //expected, actual
    }
    @Test
    public void Check_Venus_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Venus();
		assertEquals(9.0, result); //expected, actual
    }
    @Test
    public void Check_Moon_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Moon();
		assertEquals(2.0, result); //expected, actual
    }
    @Test
    public void Check_Mars_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Mars();
		assertEquals(4.0, result); //expected, actual
    }
    @Test
    public void Check_Jupiter_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Jupiter();
		assertEquals(26.0, result); //expected, actual
    }
    @Test
    public void Check_Saturn_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Saturn();
		assertEquals(11.0, result); //expected, actual
    }
    @Test
    public void Check_Uranus_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Uranus();
		assertEquals(9.0, result); //expected, actual
    }
    @Test
    public void Check_Neptune_Gravity(){
        Calculator check=new Calculator();
        double result = check.cal_Neptune();
		assertEquals(11.0, result); //expected, actual
    }
}