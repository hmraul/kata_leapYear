import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class customYearShould {

    private CustomYear customYear;

    @Test
    public void say_it_is_leapYear_when_a_year_is_divisible_by_four() {
        customYear = new CustomYear(1996);

        assertThat(customYear.isLeapYear(), is(true));
    }

    @Test
    public void say_it_is__not_leapYear_when_a_year_is_not_divisible_by_four() {
        customYear = new CustomYear(1995);

        assertThat(customYear.isLeapYear(), is(false));
    }

    @Test
    public void say_its_not_a_leapYear_when_is_divisible_by_100() {
        customYear = new CustomYear(1900);

        assertThat(customYear.isLeapYear(), is(false));
    }

    @Test
    public void say_its_a_leapYear_when_is_divisible_by_400() {
        customYear = new CustomYear(2000);

        assertThat(customYear.isLeapYear(), is(true));
    }
}
