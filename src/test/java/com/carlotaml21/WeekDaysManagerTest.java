package com.carlotaml21;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class WeekDaysManagerTest {

    @Test
    public void testGetDaysWeek() {
        List<String> days = new WeekDaysManager().getDaysWeek();

        assertNotNull(days);

        List<String> expectedDays = Arrays.asList(
         "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
        );
        assertEquals(expectedDays, days);
    }

    @Test
    public void testDaysListSize(){
        WeekDaysManager weekDaysManager = new WeekDaysManager();
        assertEquals(7, weekDaysManager.getSize());
    }

    @Test 
    public void testDeleteDay(){
     WeekDaysManager weekDaysManager = new WeekDaysManager();  

     assertEquals(true, weekDaysManager.deleteDay("Lunes"));
     assertEquals(6, weekDaysManager.getSize());
    }

    @Test
    public void testGetSpecificDay(){
    WeekDaysManager weekDaysManager = new WeekDaysManager(); 
    assertEquals("Sabado", weekDaysManager.getSpecificDay("Sabado"));
    }

    @Test 
    public void testVerifyDayList(){
     //   WeekDaysManager weekDaysManager = new WeekDaysManager();

      //  List<String> days = weekDaysManager.getDaysWeek();

       // assertTrue(days.contains("Viernes"));
    }

    @Test 
    public void testAlphabeticList(){
        // WeekDaysManager weekDaysManager = new WeekDaysManager();

       // List<String> sortedDays = weekDaysManager.getSortedDaysWeek();

       // assertEquals("Domingo", sortedDays.get(0));
    }

    @Test
    public void testEmptyList(){
    //    WeekDaysManager weekDaysManager = new WeekDaysManager();
       // weekDaysManager.clearDays();
      //  assertTrue(weekDaysManager.getDaysWeek().isEmpty());
    }

    }

