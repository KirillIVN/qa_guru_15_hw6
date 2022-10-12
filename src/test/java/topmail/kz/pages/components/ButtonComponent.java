package topmail.kz.pages.components;

import static com.codeborne.selenide.Selenide.$x;

public class ButtonComponent {
    public ButtonComponent clickButton() {
        $x("//*[@id='submit']").click();

        return this;
    }
}
