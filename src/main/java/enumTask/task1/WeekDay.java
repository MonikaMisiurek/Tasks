package enumTask.task1;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekday(){
        return this != SATURDAY && this!= SUNDAY;
    }

    public boolean isHoliday(){
        return this == SATURDAY || this == SUNDAY;
    }

    void wchichIsGreater(WeekDay weekDay){
        if (this.ordinal()< weekDay.ordinal()){
            System.out.println("Before " + weekDay);
        }else {
            System.out.println("After "+ weekDay);
        }

    }


}
