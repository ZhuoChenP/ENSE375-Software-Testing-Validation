
import org.junit.jupiter.api.Test; //JUnit5
//import java.lang.NumberFormatException;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BurgerTest {
    @Test
    public void Never_been_Feta_correct_input_test() {
        Burger check=new Burger();
        double result = check.never_Been_feta("ciabatta", "patty", "feta", "mayo", "mustard", "arugula", "fries");
		assertEquals(2.58, result); //expected, actual
	}
	@Test
    public void eggers_cant_be_cheesers_correct_input_test() {
        Burger check=new Burger();
        double result = check.eggers_cant_be_cheesers("english_muffin", "patty", "cheddar", "egg", "iceburg", "fries");
		assertEquals(2.52, result); //expected, actual
	}
	@Test
    public void poutine_on_ritz_correct_input_test() {
        Burger check=new Burger();
        double result = check.poutine_on_ritz("bun", "patty", "iceburg", "tomato", "red_onion", "ritz_crackers", "fries", "gravy", "cheese_curds");
		assertEquals(4.35, result); //expected, actual
	}
	@Test
    public void baby_you_can_chive_my_car_correct_input_test() {
        Burger check=new Burger();
        double result = check.baby_you_can_chive_my_car("bun", "patty", "feta", "mustard", "sour_cream", "chives", "pickle", "fries");
		assertEquals(2.19, result); //expected, actual
	}
	@Test
    public void bet_it_all_on_black_garlic_correct_input_test() {
        Burger check=new Burger();
        double result = check.bet_it_all_on_black_garlic("bun", "patty", "mozzarella", "mayo", "sriracha", "black_garlic", "spinach", "fries");
		assertEquals(2.53, result); //expected, actual
    }
    ////////////////////////////////////////////////////////////////////////////// test with incorect intput/ingredient
    @Test
    public void Never_been_Feta_incorrect_input_test() {
        Burger check=new Burger();
        double result = check.never_Been_feta("honey", "patty", "feta", "mayo", "mustard", "arugula", "fries");
		assertEquals(0, result); //expected, actual
	}
	@Test
    public void eggers_cant_be_cheesers_incorrect_input_test() {
        Burger check=new Burger();
        double result = check.eggers_cant_be_cheesers("honey", "patty", "cheddar", "egg", "iceburg", "fries");
		assertEquals(0, result); //expected, actual
	}
	@Test
    public void poutine_on_ritz_incorrect_input_test() {
        Burger check=new Burger();
        double result = check.poutine_on_ritz("honey", "patty", "iceburg", "tomato", "red_onion", "ritz_crackers", "fries", "gravy", "cheese_curds");
		assertEquals(0, result); //expected, actual
	}
	@Test
    public void baby_you_can_chive_my_car_incorrect_input_test() {
        Burger check=new Burger();
        double result = check.baby_you_can_chive_my_car("honey", "patty", "feta", "mustard", "sour_cream", "chives", "pickle", "fries");
		assertEquals(0, result); //expected, actual
	}
	@Test
    public void bet_it_all_on_black_garlic_incorrect_input_test() {
        Burger check=new Burger();
        double result = check.bet_it_all_on_black_garlic("honey", "patty", "mozzarella", "mayo", "sriracha", "black_garlic", "spinach", "fries");
		assertEquals(0, result); //expected, actual
    }
    ///////////////////////////////////////////////////////test with three new created burger
    @Test
    public void random_correct_input_test() {
        Burger check=new Burger();
        double result = check.random("arugula", "mustard", "mozzarella","fries");
		assertEquals(0.78, result); //expected, actual
    }
    @Test
    public void normal_correct_input_test() {
        Burger check=new Burger();
        double result = check.normal("egg", "mayo", "fries", "gravy");
		assertEquals(0.65, result); //expected, actual
    }
    @Test
    public void high_calories_correct_input_test() {
        Burger check=new Burger();
        double result = check.high_calories("gravy", "cheese_curds", "mayo","patty");
		assertEquals(3.15, result); //expected, actual
    }

}

