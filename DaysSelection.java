
enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class DaysSelection {
    public static void main(String[] args) {
        
        DaysOfWeek selectDay = DaysOfWeek.FRIDAY;

        
        switch (selectDay) {
            case MONDAY:
                System.out.println("It's the start of the work week. Time to work!");
                break;
            case TUESDAY:
                System.out.println("It's a choose day!");
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It is a regular workday. Keep going!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! a Flyday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend na. Time to relax!");
                break;
            default:
                System.out.println("Invalid day selected.");
                break;
        }
    }
}