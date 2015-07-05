public class CustomYear {

    private final int year;

    public CustomYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if ((year % 400) == 0){
            return true;
        }
        if ((year % 100) == 0){
            return false;
        }
        return (year % 4) == 0;
    }
}
