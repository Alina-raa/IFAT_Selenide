package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {
    final SelenideElement title = $(".header__bottom_btn-menu");
    final SelenideElement titleBtn = $(".header__bottom_btn-menu");

    public void waiteOpen() {

        title.shouldBe(visible);
        titleBtn.should(cssValue("background-color", "rgba(23, 92, 255, 1)"));
    }
}
