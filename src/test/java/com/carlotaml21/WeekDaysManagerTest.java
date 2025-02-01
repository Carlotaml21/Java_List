package com.carlotaml21;

import java.util.Arrays;
import java.util.List;

import javax.print.attribute.DateTimeSyntax;

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
        List<String> days = weekDaysManager.getDaysWeek();
        assertEquals(7, days.size());
    }

    @Test 
    public void testDeleteDay(){
     WeekDaysManager weekDaysManager = new WeekDaysManager();  
     boolean removed = weekDaysManager.removeDay("Lunes");

     assertTrue(removed);
    }

    @Test
    public void testGetSpecificDay(){
    WeekDaysManager weekDaysManager = new WeekDaysManager(); 

    assertEquals("Martes", DateTimeSyntax.get(1));
    }

    @Test 
    public void testVerifyDayList(){
        WeekDaysManager weekDaysManager = new WeekDaysManager();

        List<String> days = weekDaysManager.getDaysWeek();

        assertTrue(days.contains("Viernes"));
    }

    @Test 
    public void testAlphabeticList(){
        WeekDaysManager weekDaysManager = new WeekDaysManager();

        List<String> sortedDays = weekDaysManager.getSortedDaysWeek();

        assertEquals("Domingo", sortedDays.get(0));
    }

    @Test
    public void testEmptyList(){
        WeekDaysManager weekDaysManager = new WeekDaysManager();
        weekDaysManager.clearDays();
        assertTrue(weekDaysManager.getDaysWeek().isEmpty());
    }

    }

