public class CustomYear {

    private final int year;

    public CustomYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 4) == 0;
    }
}
