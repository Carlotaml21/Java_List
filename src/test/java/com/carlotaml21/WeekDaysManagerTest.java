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
        assertEquals(7, days.size());

        List<String> expectedDays = Arrays.asList(
         "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
        );
        assertEquals(expectedDays, days);
    }

    }

