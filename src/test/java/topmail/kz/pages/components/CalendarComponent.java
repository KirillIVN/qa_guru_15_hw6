package topmail.kz.pages.components;

import static com.codeborne.selenide.Selenide.$x;

public class CalendarComponent {

    public CalendarComponent setDate(String day, String month, String year) {
        $x("//*[@class='react-datepicker__month-select']").click();
        $x("//*[@class='react-datepicker__month-select']").selectOption(month);
        $x("//*[@class='react-datepicker__year-select']").click();
        $x("//*[@class='react-datepicker__year-select']").selectOptionByValue(year);
        $x("//*[@class='react-datepicker__day react-datepicker__day--0" + day + "']").click();

        return this;
    }
}
