
/*----------------------------------------------------------------------------*\

       ___ _  _ ___ ___   ________ ___         _    ____        ___      
      | __| \| / __| __| |__ /__  | __|  ___  | |  |__ /  ___  | __|__ _ 
      | _|| .` \__ \ _|   |_ \ / /|__ \ |___| | |__ |_ \ |___| | _|/ _` |
      |___|_|\_|___/___| |___//_/ |___/       |____|___/       |___\__, |
                                                                   |___/ 
                              DateValidator.java
                                  Adam Tilson
                                   Jan, 2021

    This application is starter code for the Test Driven Development Lab.
    
    Compile and Run: See the included readme.md for compilation commands
\*----------------------------------------------------------------------------*/
public class DateValidator {
    private boolean checkNumber(String input) {
	    boolean checkNum = false;
	    boolean result=true;
	    if (input != null && !input.isEmpty()) {
	        for (char c : input.toCharArray()) {
	            if (checkNum == Character.isDigit(c)) {
	                result=false;
	            }
	        }
	    }
	    return result;
	}
    private String checkweekday(int month, int day, int year)
    {
        double m;
        int y;
        int day_of_week;//from 0=Sun to Sat=6;
        m=(month-2+12)%12;
        if(month<=2)
        {
        m = month + 10;
         year--;
        }
        y=5*(year%4)+4*(year%100)+6*(year%400);
        day_of_week=(day+(int)(2.6*m-0.2)+y)%7;
        if(day_of_week==0)
            return "Sun";
        else if(day_of_week==1)
            return "Mon";
        else if(day_of_week==2)
            return "Tues";
        else if(day_of_week==3)
            return "Wed";
        else if(day_of_week==4)
            return "Thurs";
        else if(day_of_week==5)
            return "Fri";
        else if(day_of_week==6)
            return "Sat";
        else
         return "false";
    }

    private boolean checkIllegalDays(int month, int day, int year,String weekday){
        if(weekday!=""){
            String dow;
           dow= checkweekday( month,  day,  year);
           if(dow.equals(weekday.substring(0,3))==false)//if the calculated weekday is not match to the given weekday return false;
           return false;
        }

        if(day >= 32 || month >= 13 ||
        ( month == 2  && day == 31 ) ||
        ( month == 4  && day == 31 ) ||
        ( month == 6  && day == 31 ) ||
        ( month == 9  && day == 31 ) ||
        ( month == 11 && day == 31 ) ||
        ( month == 2  && day == 30 ) ||
        //illegal                 but not leap years
        ( month == 2  && day == 29 && year % 4 != 0)) {
        
        return false;
        }
        else 
        return true;
    }
    public boolean validate_world (String month,String weekday){
        boolean result_month=false;
        boolean result_weekday=false;
        String month_list[]={"January","Jan","February","Feb","March","Mar","April","Apr","May","June","Jun","July","Jul","August","Aug","September","Sep","October","Oct","November","Nov","December","Dec"};
        String weekday_list[]={"Sunday"	,"Sun","Monday","Mon","Tuesday","Tues","Wednesday",	"Wed","Thursday","Thurs","Friday","Fri","Saturday","Sat"};
        for(String check_value:month_list)
            {if(check_value.equals(month))
                result_month=true;    
            }
        for(String check_value:weekday_list)
        {if(check_value.equals(weekday))
            result_weekday=true;    
        }
        if((result_month==true)&&(result_weekday==true))
            return true;
        else
            return false;

    }
    public boolean validate(String date){
        
    int shortDateLength=8;
    int longDateLength=10;
    int mostDateLength=28;
    int lessDataLength=16;
    String mm;
    String dd;
    String yyyy;
    String weekday="";
    String month_date;
        if(date.length()==shortDateLength)
        {
           
             mm=date.substring(0,2);//set substring at index 0 and up to but excluding index 2
             dd=date.substring(2,4);
             yyyy=date.substring(4,8);
        }
        else if(date.length()==longDateLength)
        {
            char firstSeperator=date.charAt(2);
            char secondSeperator=date.charAt(5);
            if(firstSeperator!=secondSeperator){
                return false;
            }
             mm=date.substring(0,2);//set substring at index 0 and up to but excluding index 2
             dd=date.substring(3,5);
             yyyy=date.substring(6,10);
        }
        else if(date.length()<=mostDateLength&&date.length()>=lessDataLength)
        {

            String temp_date=date;
            weekday=temp_date.substring(0,date.indexOf(" ")-1);
            temp_date=temp_date.substring(temp_date.indexOf(" ")+1,temp_date.length());//get temp_date from first " " to end of the date. 
            month_date=temp_date.substring(0,temp_date.indexOf(" "));//get the month from first letter of temp_string to the " ".
            dd=temp_date.substring(temp_date.indexOf(" ")+1,temp_date.indexOf(","));//get day from the " " of temp_date to ",".
            temp_date=temp_date.substring(temp_date.indexOf(",")+2,temp_date.length());//reduce the temp_date, only have input year
            yyyy=temp_date;
            if(validate_world(month_date, weekday)==false)
                return false;
            if(month_date.substring(0,3).equals("Jan"))
                mm="1";
            else if(month_date.substring(0,3).equals("Feb"))
                mm="2";
            else if(month_date.substring(0,3).equals("Mar"))
                mm="3";
            else if(month_date.substring(0,3).equals("Apr"))
                mm="4";
            else if(month_date.substring(0,3).equals("May"))
                mm="5";
            else if(month_date.substring(0,3).equals("Jun"))
                mm="6";
            else if(month_date.substring(0,3).equals("Jul"))
                mm="7";
            else if(month_date.substring(0,3).equals("Aug"))
                mm="8";
            else if(month_date.substring(0,3).equals("Sep"))
                mm="9";
            else if(month_date.substring(0,3).equals("Oct"))
                mm="10";
            else if(month_date.substring(0,3).equals("Nov"))
                mm="11";
            else if(month_date.substring(0,3).equals("Dec"))
                mm="12";
            else 
            	mm="false";
        }
        else 
        return false;
        int month,day,year;
       
        if(checkNumber(mm)==true) //checking if the input is convetable to number
          month=Integer.parseInt(mm);
        else
        	return false;
        if(checkNumber(dd)==true) //checking if the input is convetable to number
          day=Integer.parseInt(dd);
        else 
        	return false;
        if(checkNumber(yyyy)==true) //checking if the input is convetable to number
          year=Integer.parseInt(yyyy);
        else 
        	return false;
         return (checkIllegalDays(month, day, year,weekday));
    }
}