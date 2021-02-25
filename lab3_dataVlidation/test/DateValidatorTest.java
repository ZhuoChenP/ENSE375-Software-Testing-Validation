/*----------------------------------------------------------------------------*\

       ___ _  _ ___ ___   ________ ___         _    ____        ___      
      | __| \| / __| __| |__ /__  | __|  ___  | |  |__ /  ___  | __|__ _ 
      | _|| .` \__ \ _|   |_ \ / /|__ \ |___| | |__ |_ \ |___| | _|/ _` |
      |___|_|\_|___/___| |___//_/ |___/       |____|___/       |___\__, |
                                                                   |___/ 
                            DateValidatorTest.java
                                  Adam Tilson
                                   Jan, 2021

    This application is starter code for the Test Driven Development Lab.
    
    Compile and Run: See the included readme.md for compilation commands
\*----------------------------------------------------------------------------*/
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class DateValidatorTest {
    
    @Test
    public void Validate_Today_True(){
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02052021");
        assertTrue(legalDate);
    }
    @Test
    public void Validate_Tomorrow_True(){
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02062021");
        assertTrue(legalDate);
    }
    @Test
    public void Validate_Jan23_True(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("01322021");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_Feb31_True(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("02312021");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_LeapDay_True(){
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02292020");
        assertTrue(legalDate);
    }
    @Test
    public void Validate_TodaySeparated_True(){
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02/05/2021");
        assertTrue(legalDate);
    }
    @Test
    public void Validate_TodaySeparatorsMismatch_False(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("02/05.2021");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_NonNumeric8_False(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("abcdefgh");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_NonNumeric10_False(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("ab/cd/efgh");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_Word_date_True(){
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("Friday, September 17, 2021");
        assertTrue(legalDate);
    }
    @Test
    public void Validate_Word_date_spelling_error_month_False(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("Friday, Septembre 17, 2021");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_Word_date_spelling_error_weekday_False(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("Fridar, September 17, 2021");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_Word_combination_True(){
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("Sat, August 30, 2014");
        assertTrue(legalDate);
    }
    @Test
    public void Validate_Word_weekday_match_calendar_False(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("Monday, August 31, 2014");
        assertFalse(illegalDate);
    }
    @Test
    public void Validate_Word_weekday_match_calendar_True(){
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("Sunday, August 31, 2014");
        assertTrue(legalDate);
    }
    public void Validate_junk_input_False(){
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("wtftgert,gergfdgre,gergdf");
        assertFalse(illegalDate);
    }
}