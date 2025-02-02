package com.carlotaml21;

import java.util.ArrayList;
import java.util.List;

public class WeekDaysManager{

    private final List<String> daysWeek;

   public WeekDaysManager() {
    this.daysWeek = new ArrayList<>(List.of(
        "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
    ));
}

    public List<String> getDaysWeek() {
           return daysWeek;
    }

    public int getSize(){
        return daysWeek.size();
    }

    public boolean deleteDay(String day){
        return daysWeek.remove(day);
    }
    
    public String getSpecificDay(String day) {
        if (daysWeek.contains(day)){
            return day;
        }else{
            return null;
        }    
 }

}