package com.carlotaml21;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DWMngtTest {

    @Test
    public void testList(){
        DWMngt dwMngt = new DWMngt();
        List<String> days = dwMngt.getDaysWeek();

        assertNotNull(days);
        assertEquals(7,days.size());

    } 
}
