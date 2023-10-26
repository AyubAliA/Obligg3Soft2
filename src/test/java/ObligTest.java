import org.example.bool;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ObligTest {

        bool leapYear = new bool();
        @Test
        public void Divided4ButNot100isLeapYearTest(){

            assertTrue(leapYear.isLeapYear(4));   //This test is to check the first criteria and we use leapyears that fit this criteria
            assertTrue(leapYear.isLeapYear(40));
            assertTrue(leapYear.isLeapYear(92));

        }

        @Test
        public void TESTDivided400isLeapYear(){

            assertTrue(leapYear.isLeapYear(400)); //This test is to check the second criteria and we use leapyears that meets the criteria.
            assertTrue(leapYear.isLeapYear(800));
            assertTrue(leapYear.isLeapYear(1200));
        }

        @Test
        public void TESTNotDivided4ButNot100isNotLeapYear(){

            assertFalse(leapYear.isLeapYear(100)); //This test is to guarantee that the first criteria is not met if I give a number that does not meet the condition
            assertFalse(leapYear.isLeapYear(200));
            assertFalse(leapYear.isLeapYear(300));
        }

        @Test
        public void TESTNotDivided400isNotLeapYear(){

            assertFalse(leapYear.isLeapYear(500));  //This test is to guarantee that the second criteria is not met if I give a number that does not meet the condition
            assertFalse(leapYear.isLeapYear(900));
            assertFalse(leapYear.isLeapYear(1300));
        }

        //Det fungerer


    }

