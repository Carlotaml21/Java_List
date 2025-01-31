package com.carlotaml21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

public class WeekDaysManagerTest {

    @Test
    public void testGetDaysWeek() {
        List<String> days = new WeekDaysManager().getDaysWeek();

        assertNotNull(days);
        assertEquals(7, days.size());
    }
}

