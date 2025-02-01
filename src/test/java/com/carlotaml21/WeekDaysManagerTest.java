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
        List<String> days = weekDaysManager.getDaysWeek();
        assertEquals(7, days.size());
    }
    }

