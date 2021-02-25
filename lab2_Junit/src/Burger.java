
import java.util.Arrays;


public class Burger {
		String[] arrayNever_been_feta= {"ciabatta", "patty", "feta", "mayo", "mustard", "arugula", "fries"};
		String[] arrayEggers_cant_be_cheesers= {"english_muffin", "patty", "cheddar", "egg", "iceburg", "fries"};
		String[] arrayPoutine_on_ritz= {"bun", "patty", "iceburg", "tomato", "red_onion", "ritz_crackers", "fries", "gravy", "cheese_curds"};
		String[] arrayBaby_you_can_chive_my_car= {"bun", "patty", "feta", "mustard", "sour_cream", "chives", "pickle", "fries"};
		String[] arrayBet_it_all_on_black_garlic= {"bun", "patty", "mozzarella", "mayo", "sriracha", "black_garlic", "spinach", "fries"};
		String[] arrayRandom= {"arugula", "mustard", "mozzarella","fries"};//0.78
		String[] arrayNormal= {"egg", "mayo", "fries", "gravy"};//0.65
		String[] arrayHigh_calories= {"gravy", "cheese_curds", "mayo","patty"};//3.15

		
		public double never_Been_feta(String input1,String input2,String input3,String input4,String input5,String input6,String input7)
		{
			if(Arrays.stream(arrayNever_been_feta).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayNever_been_feta).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayNever_been_feta).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayNever_been_feta).anyMatch(input4::equals)==true&&
			Arrays.stream(arrayNever_been_feta).anyMatch(input5::equals)==true&&
			Arrays.stream(arrayNever_been_feta).anyMatch(input6::equals)==true&&
			Arrays.stream(arrayNever_been_feta).anyMatch(input7::equals)==true
			)
			{
				
				Ingredient return_value=new Ingredient();
				return Math.round((return_value.ciabatta+return_value.patty+return_value.feta+return_value.mayo+return_value.mustard+return_value.arugula+return_value.fries)*100)/100.0;
			}
			else
			 return 0;
		}

		public double eggers_cant_be_cheesers(String input1,String input2,String input3,String input4,String input5,String input6)
		{
			if(Arrays.stream(arrayEggers_cant_be_cheesers).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayEggers_cant_be_cheesers).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayEggers_cant_be_cheesers).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayEggers_cant_be_cheesers).anyMatch(input4::equals)==true&&
			Arrays.stream(arrayEggers_cant_be_cheesers).anyMatch(input5::equals)==true&&
			Arrays.stream(arrayEggers_cant_be_cheesers).anyMatch(input6::equals)==true
			)
			{
				Ingredient return_value=new Ingredient();
				return (return_value.english_muffin+return_value.patty+return_value.cheddar+return_value.egg+return_value.iceburg+return_value.fries);
			}
			else
			 return 0;
		}
		public double poutine_on_ritz(String input1,String input2,String input3,String input4,String input5,String input6,String input7,String input8,String input9)
		{
			if(Arrays.stream(arrayPoutine_on_ritz).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input4::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input5::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input6::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input7::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input8::equals)==true&&
			Arrays.stream(arrayPoutine_on_ritz).anyMatch(input9::equals)==true
			)
			{
				Ingredient return_value=new Ingredient();
				return (return_value.bun+return_value.patty+return_value.iceburg+return_value.tomato+return_value.red_onion+return_value.ritz_crackers+return_value.fries+return_value.gravy+return_value.cheese_curds);
			}
			else
			 return 0;
		}
		public double baby_you_can_chive_my_car(String input1,String input2,String input3,String input4,String input5,String input6,String input7,String input8)
		{
			if(Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input4::equals)==true&&
			Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input5::equals)==true&&
			Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input6::equals)==true&&
			Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input7::equals)==true&&
			Arrays.stream(arrayBaby_you_can_chive_my_car).anyMatch(input7::equals)==true
			)
			{
				Ingredient return_value=new Ingredient();
				return (return_value.bun+return_value.patty+return_value.feta+return_value.sour_cream+return_value.mustard+return_value.chives+return_value.pickle+return_value.fries);
			}
			else
			 return 0;
		}
		public double bet_it_all_on_black_garlic(String input1,String input2,String input3,String input4,String input5,String input6,String input7,String input8)
		{
			if(Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input4::equals)==true&&
			Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input5::equals)==true&&
			Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input6::equals)==true&&
			Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input7::equals)==true&&
			Arrays.stream(arrayBet_it_all_on_black_garlic).anyMatch(input7::equals)==true
			)
			{
				Ingredient return_value=new Ingredient();
				return Math.round((return_value.bun+return_value.patty+return_value.mozzarella+return_value.mayo+return_value.sriracha+return_value.black_garlic+return_value.spinach+return_value.fries)*100)/100.0;
			}
			else
			 return 0;
		}
		////////////////////////////////////////////////////////////////////////////
		public double random(String input1,String input2,String input3,String input4)
		{
			if(Arrays.stream(arrayRandom).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayRandom).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayRandom).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayRandom).anyMatch(input4::equals)==true
			)
			{
				Ingredient return_value=new Ingredient();
				return Math.round((return_value.arugula+return_value.mustard+return_value.mozzarella+return_value.fries)*100)/100.0;
			}
			else
			 return 0;
		}
		public double normal(String input1,String input2,String input3,String input4)
		{
			if(Arrays.stream(arrayNormal).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayNormal).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayNormal).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayNormal).anyMatch(input4::equals)==true
			)
			{
				Ingredient return_value=new Ingredient();
				return Math.round((return_value.egg+return_value.fries+return_value.gravy+return_value.mayo)*100)/100.0;
			}
			else
			 return 0;
		}
		public double high_calories(String input1,String input2,String input3,String input4)
		{
			if(Arrays.stream(arrayHigh_calories).anyMatch(input1::equals)==true&&
			Arrays.stream(arrayHigh_calories).anyMatch(input2::equals)==true&&
			Arrays.stream(arrayHigh_calories).anyMatch(input3::equals)==true&&
			Arrays.stream(arrayHigh_calories).anyMatch(input4::equals)==true
			)
			{
				Ingredient return_value=new Ingredient();
				return Math.round((return_value.gravy+return_value.cheese_curds+return_value.mayo+return_value.patty)*100)/100.0;
			}
			else
			 return 0;
		}
}
